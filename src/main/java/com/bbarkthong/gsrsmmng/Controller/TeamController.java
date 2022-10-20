package com.bbarkthong.gsrsmmng.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbarkthong.gsrsmmng.Entity.Team;
import com.bbarkthong.gsrsmmng.Entity.TeamMember;
import com.bbarkthong.gsrsmmng.Service.TeamMemberService;
import com.bbarkthong.gsrsmmng.Service.TeamService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class TeamController {

    private final TeamService teamService;
    private final TeamMemberService teamMemberService;

    @GetMapping("/teams")
    public List<Team> getTeam() {
        return teamService.findTeams();
    }

    @GetMapping("/team/{team_id}")
    public Optional<Team> getTeam(@PathVariable("team_id") String team_id) {
        return teamService.findTeamById(team_id);
    }

    @PostMapping("/team/{team_id}")
    public void saveTeam(@PathVariable("team_id") String team_id, @RequestParam Map<String, Object> params) {
        Team team = new Team();
        // TODO: team 구현
        teamService.saveTeam(team);
    }

    @GetMapping("/team/all/members")
    public List<TeamMember> getTeamMember() {
        return teamMemberService.getTeamMembers();
    }

    @GetMapping("/team/{team_id}/members")
    public Optional<TeamMember> getTeamMember(@PathVariable("team_id") String team_id) {
        return teamMemberService.findByTeam(team_id);
    }

    @GetMapping("/team/{team_id}/member/{user_id}")
    public Optional<TeamMember> getTeamMember(@PathVariable("team_id") String team_id,
            @PathVariable("user_id") String user_id) {
        return teamMemberService.findByTeam(team_id);
    }

    @PostMapping("/team/{team_id}/member/{user_id}")
    public void saveTeamMember(@PathVariable("team_id") String team_id, @PathVariable("user_id") String user_id,
            @RequestParam Map<String, Object> params) {
        TeamMember teamMember = new TeamMember();
        // TODO: teamMember 구현
        teamMemberService.save(teamMember);
    }
}
