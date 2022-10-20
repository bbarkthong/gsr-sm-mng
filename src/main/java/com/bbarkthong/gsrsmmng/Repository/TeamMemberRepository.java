package com.bbarkthong.gsrsmmng.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbarkthong.gsrsmmng.Entity.TeamMember;

public interface TeamMemberRepository extends JpaRepository<TeamMember, String> {

}
