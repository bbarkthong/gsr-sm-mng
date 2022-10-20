package com.bbarkthong.gsrsmmng.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbarkthong.gsrsmmng.Entity.Team;
import com.bbarkthong.gsrsmmng.Service.TeamService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
public class TeamController {

    private final TeamService teamService;

    @GetMapping("/team")
    public List<Team> getTeam(@RequestParam Map<String, Object> params) {
        String team_nm = "";
        team_nm = (String) params.get("team_nm");
        log.info(team_nm);
        return teamService.findItemsByName(team_nm);
    }

    @GetMapping("/team/{team_id}")
    public Optional<Team> getTeam(@RequestParam Map<String, Object> params,
            @PathVariable("team_id") String team_id) {
        log.info(team_id);
        return teamService.findTeamById(team_id);
    }

    @PostMapping("/team/{team_id}")
    public void saveTeam(@PathVariable("team_id") String team_id, @RequestParam Map<String, Object> params) {
        log.debug(params.toString());
        teamService.saveTeamById(team_id, params);
    }
}
