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
@Table(name = "MS_TEAM_MEMBER")
public class TeamMember {

    @Id
    private TeamMemberPK teamMemberPK;

    // 직무ID
    private String dutyId;

    // 일원유형
    private String memberType;

    // 소속시작일
    private String assignStartDt;

    // 소속종료일
    private String assignEndDt;

    // 등록자ID
    protected String regiUserId;

    // 등록일시
    protected Timestamp regiDttm;

    // 최종수정자ID
    protected String finalModUserId;

    // 최종수정일시
    protected Timestamp finalModDttm;
}
