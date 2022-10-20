package com.bbarkthong.gsrsmmng.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbarkthong.gsrsmmng.Entity.Team;

public interface TeamRepository extends JpaRepository<Team, String> {

    // private final EntityManager em;

    // public List<Team> findByName(String team_nm) {
    // return em.createQuery("select o from Team o where o.team_nm =
    // :team_nm").setParameter("team_nm", team_nm)
    // .setMaxResults(100).getResultList();
    // }

    // public Team findById(String team_id) {
    // log.info(team_id);
    // return em.find(Team.class, team_id);
    // }

}
