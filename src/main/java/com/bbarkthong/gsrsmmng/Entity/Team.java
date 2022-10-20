package com.bbarkthong.gsrsmmng.Entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "MS_TEAM")
public class Team {

    @Id
    // 팀ID
    private String teamId;

    // 팀명
    private String teamNm;

    // 상위팀ID
    private String upperTeamId;

    // 이전팀명
    private String teamNmOld;

    // 팀명적용일
    private String teamNmAppDt;

    // 팀유형
    private String teamType;

    // 팀장ID
    private String teamLeaderId;

    // 이전팀장ID
    private String teamLeaderIdOld;

    // 팀장ID적용일
    private String teamLeaderIdAppdt;

    // 팀설명
    private String teamDesc;

    // 팀노출시작일
    private String teamViewStartDt;

    // 팀노출종료일
    private String teamViewEndDt;

    // 등록자ID
    protected String regiUserId;

    // 등록일시
    protected Timestamp regiDttm;

    // 최종수정자ID
    protected String finalModUserId;

    // 최종수정일시
    protected Timestamp finalModDttm;
}
