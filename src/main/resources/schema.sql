DROP TABLE IF EXISTS MS_TEAM;
CREATE TABLE IF NOT EXISTS MS_TEAM
(
    `TEAM_ID`               VARCHAR(6)     NOT NULL    COMMENT '팀ID', 
    `TEAM_NM`               VARCHAR(45)    NOT NULL    COMMENT '팀명', 
    `UPPER_TEAM_ID`         VARCHAR(6)     NULL        COMMENT '상위팀ID', 
    `TEAM_NM_OLD`           VARCHAR(45)    NOT NULL    COMMENT '이전팀명', 
    `TEAM_NM_APP_DT`        VARCHAR(8)     NOT NULL    COMMENT '팀명적용일', 
    `TEAM_TYPE`             VARCHAR(2)     NOT NULL    COMMENT '팀유형', 
    `TEAM_LEADER_ID`        VARCHAR(10)    NOT NULL    COMMENT '팀장ID', 
    `TEAM_LEADER_ID_OLD`    VARCHAR(10)    NOT NULL    COMMENT '이전팀장ID', 
    `TEAM_LEADER_ID_APPDT`  VARCHAR(8)     NOT NULL    COMMENT '팀장ID적용일', 
    `TEAM_DESC`             TEXT           NULL        COMMENT '팀설명', 
    `TEAM_VIEW_START_DT`    VARCHAR(8)     NOT NULL    COMMENT '팀노출시작일', 
    `TEAM_VIEW_END_DT`      VARCHAR(8)     NOT NULL    COMMENT '팀노출종료일', 
    `REGI_USER_ID`          VARCHAR(10)    NOT NULL    COMMENT '등록자ID', 
    `REGI_DTTM`             DATETIME       NOT NULL    COMMENT '등록일시', 
    `FINAL_MOD_USER_ID`     VARCHAR(10)    NOT NULL    COMMENT '최종수정자ID', 
    `FINAL_MOD_DTTM`        DATETIME       NOT NULL    COMMENT '최종수정일시', 
     PRIMARY KEY (TEAM_ID)
);

DROP TABLE IF EXISTS MS_TEAM_MEMBER;
CREATE TABLE IF NOT EXISTS MS_TEAM_MEMBER
(
    `TEAM_ID`            VARCHAR(6)     NOT NULL    COMMENT '팀ID', 
    `MEMBER_ID`          VARCHAR(10)    NOT NULL    COMMENT '일원ID', 
    `DUTY_ID`            VARCHAR(4)     NULL        COMMENT '직무ID', 
    `MEMBER_TYPE`        VARCHAR(2)     NOT NULL    COMMENT '일원유형', 
    `ASSIGN_START_DT`    VARCHAR(8)     NOT NULL    COMMENT '소속시작일', 
    `ASSIGN_END_DT`      VARCHAR(8)     NOT NULL    COMMENT '소속종료일', 
    `REGI_USER_ID`       VARCHAR(10)    NOT NULL    COMMENT '등록자ID', 
    `REGI_DTTM`          DATETIME       NOT NULL    COMMENT '등록일시', 
    `FINAL_MOD_USER_ID`  VARCHAR(10)    NOT NULL    COMMENT '최종수정자ID', 
    `FINAL_MOD_DTTM`     DATETIME       NOT NULL    COMMENT '최종수정일시', 
     PRIMARY KEY (TEAM_ID, MEMBER_ID)
);

DROP TABLE IF EXISTS MS_USER;
CREATE TABLE IF NOT EXISTS MS_USER
(
    `USER_ID`            VARCHAR(10)    NOT NULL    COMMENT '사용자ID', 
    `USER_NM`            VARCHAR(45)    NOT NULL    COMMENT '사용자명', 
    `USER_TYPE`          VARCHAR(2)     NOT NULL    COMMENT '사용자유형', 
    `COMPANY_ID`         VARCHAR(6)     NULL        COMMENT '회사ID', 
    `PORTAL_ID`          VARCHAR(45)    NULL        COMMENT '포탈ID', 
    `EMP_ID`             VARCHAR(45)    NULL        COMMENT '사번ID', 
    `USER_STAT`          VARCHAR(2)     NOT NULL    COMMENT '사용자상태', 
    `JOIN_DT`            VARCHAR(8)     NOT NULL    COMMENT '입사일자', 
    `RETIRE_DT`          VARCHAR(8)     NOT NULL    COMMENT '퇴사일자', 
    `REGI_USER_ID`       VARCHAR(10)    NOT NULL    COMMENT '등록자ID', 
    `REGI_DTTM`          DATETIME       NOT NULL    COMMENT '등록일시', 
    `FINAL_MOD_USER_ID`  VARCHAR(10)    NOT NULL    COMMENT '최종수정자ID', 
    `FINAL_MOD_DTTM`     DATETIME       NOT NULL    COMMENT '최종수정일시', 
     PRIMARY KEY (USER_ID)
);
