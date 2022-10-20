package com.bbarkthong.gsrsmmng.Service;

import java.util.List;
import java.util.Map;
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

    public List<Team> findItemsByName(String team_nm) {
        return teamRepository.findAll();
    }

    public Optional<Team> findTeamById(String team_id) {
        return teamRepository.findById(team_id);
    }

    @Transactional
    public void saveTeamById(String team_id, Map<String, Object> params) {
        // Team team = Team.builder().teamId(team_id).build();
        // teamRepository.save(team);
    }

    public void reset(List<Team> initData) {
        // teamRepository.deleteAll();
        teamRepository.saveAll(initData);
    }
}
