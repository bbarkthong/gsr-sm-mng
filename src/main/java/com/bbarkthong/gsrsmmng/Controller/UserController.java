package com.bbarkthong.gsrsmmng.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbarkthong.gsrsmmng.Entity.User;
import com.bbarkthong.gsrsmmng.Service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public List<User> getUser() {
        return userService.getUsers();
    }
}
