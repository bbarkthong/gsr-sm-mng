package com.bbarkthong.gsrsmmng.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbarkthong.gsrsmmng.Entity.User;
import com.bbarkthong.gsrsmmng.Service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<User> getUser() {
        return userService.getUsers();
    }

    @GetMapping("/user/{user_id}")
    public Optional<User> getUser(@PathVariable("user_id") String user_id) {
        return userService.findUserById(user_id);
    }

    @PostMapping("/user/{user_id}")
    public void saveUser(@PathVariable("user_id") String user_id) {
        User user = new User();
        // TODO:user 구현
        userService.save(user);
    }
}
