package com.bbarkthong.gsrsmmng.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bbarkthong.gsrsmmng.Repository.UserRepository;
import com.bbarkthong.gsrsmmng.Entity.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findUserById(String userId) {
        return userRepository.findById(userId);
    }

    @Transactional
    public void save(User user) {
        // TODO: 저장 구현
    }

}
