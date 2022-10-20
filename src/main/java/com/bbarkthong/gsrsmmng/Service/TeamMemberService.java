package com.bbarkthong.gsrsmmng.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bbarkthong.gsrsmmng.Entity.TeamMember;
import com.bbarkthong.gsrsmmng.Repository.TeamMemberRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TeamMemberService {

    private final TeamMemberRepository teamMemberService;

    public List<TeamMember> getTeamMembers() {
        return teamMemberService.findAll();
    }

    public Optional<TeamMember> findByTeam(String teamId) {
        // TODO: 팀으로 조회하도록 구현
        return teamMemberService.findById(teamId);
    }

    public Optional<TeamMember> findByUser(String userId) {
        // TODO: 사람으로 조회하도록 구현
        return teamMemberService.findById(userId);
    }

    @Transactional
    public void save(TeamMember user) {
        // TODO: 저장 구현
    }

}
