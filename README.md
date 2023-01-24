# GS리테일 운영 관리

## REST API

- GET:/teams
- GET:/team/{팀ID}
- POST:/team/{팀ID}
---
- GET:/team/all/members
- GET:/team/{팀ID}/members
- GET:/team/{팀ID}/member/{유저ID}
- POST:/team/{팀ID}/member/{유저ID}
---
- GET:/users
- GET:/user/{유저ID}
- POST:/user/{유저ID}

# 업데이트 API 서버 설계

## 목적

- 각 Client에 필요한 마스터 정보를 전체/증분 동기화 한다.
- 각 Client의 요청으로 Health check를 한다. 

## 설계

- 각 Client는 각자의 token을 발급받는다. token은 Client의 ID를 해시함수를 통해 생성한다. 
- Client가 API서버로 Request를 보내면 MQ/EQ가 1차 수신받고, API서버가 순차 처리한다. 
- API서버는 등록되어 있는 token만 Response를 응답한다. 미등록된 token은 admin에게 전달되며, 이를 수동 등록할 수 있다. 
- 마스터 정보는 DB에 적재되어 있고, 마스터 ID를 각각 보유하고 있다. 만약, 기존에 있는 마스터 정보가 수정될 경우 마스터 ID도 최근 ID로 갱신된다.
- 기존의 마스터 정보가 수정되어 마스터 ID가 갱신될 경우, 기존/신규 마스터 ID에 해당되는 Redis의 데이터를 제거한다. 
- Redis에 해당 데이터가 없을 경우, 생성 여부를 판단 후 DB에서 조회하여 응답한다. 응답 값은 Redis에 적재한다. 
- 증분 동기화의 경우, 위와 같이 진행되며 전체 동기화는 Redis가 아닌 DB에서 직접 전송한다. 
- 각 전체/증분 동기화 시, 지정된 Block Size만큼 분할 생성한다. 

## 업데이트 방법

- 각 Client가 최종 마스터 ID를 API 서버로 요청하여, 이후 갱신된 마스터 정보가 있는지 확인. 
- API 서버가 갱신된 마스터 ID의 내역을 응답. 단, 너무 오래되어 증분 마스터로 처리되지 않을 경우 전체 마스터로 응답한다.
- 각 Client는 응답받은 마스터 ID를 순차적으로 API 서버에게 요청한다. API 서버에게 응답받은 마스터 데이터는 순차적으로 DB에 적재한다.
- 
