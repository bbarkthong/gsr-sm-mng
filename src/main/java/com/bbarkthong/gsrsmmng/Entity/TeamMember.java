package com.bbarkthong.gsrsmmng.Entity;

import java.io.Serializable;

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
public class TeamMember implements Serializable {

    @Id
    // 팀ID
    private String teamId;

    @Id
    // 일원ID
    private String memberId;

    // 직무ID
    private String dutyId;

    // 일원유형
    private String memberType;

    // 소속시작일
    private String assignStartDt;

    // 소속종료일
    private String assignEndDt;
}
