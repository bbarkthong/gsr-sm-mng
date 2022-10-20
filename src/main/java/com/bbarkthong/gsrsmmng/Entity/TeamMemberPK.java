package com.bbarkthong.gsrsmmng.Entity;

import java.io.Serializable;

import javax.persistence.Id;

public class TeamMemberPK implements Serializable {

    @Id
    // 팀ID
    private String teamId;

    @Id
    // 일원ID
    private String memberId;
}
