package com.bbarkthong.gsrsmmng.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bbarkthong.gsrsmmng.Entity.Team;
import com.bbarkthong.gsrsmmng.Repository.TeamRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public List<Team> findTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> findTeamById(String team_id) {
        return teamRepository.findById(team_id);
    }

    @Transactional
    public void saveTeam(Team team) {
        // TODO: 저장 구현
    }
}
