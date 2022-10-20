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
@Table(name = "MS_USER")
public class User {

    @Id
    // 사용자ID
    private String userId;

    // 사용자명
    private String userNm;

    // 사용자유형
    private String userType;

    // 회사ID
    private String companyId;

    // 포탈ID
    private String portalId;

    // 사번ID
    private String empId;

    // 사용자상태
    private String userStat;

    // 입사일자
    private String joinDt;

    // 퇴사일자
    private String retireDt;

    // 등록자ID
    private String regiUserId;

    // 등록일시
    private Timestamp regiDttm;

    // 최종수정자ID
    private String finalModUserId;

    // 최종수정일시
    private Timestamp finalModDttm;
}
