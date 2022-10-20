package com.bbarkthong.gsrsmmng.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbarkthong.gsrsmmng.Entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
