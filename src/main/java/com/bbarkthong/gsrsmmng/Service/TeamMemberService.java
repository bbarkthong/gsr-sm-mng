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
        return teamMemberService.findById(teamId);
    }

    public Optional<TeamMember> findByUser(String userId) {
        return teamMemberService.findById(userId);
    }

    @Transactional
    public void save(TeamMember user) {
    }

}
