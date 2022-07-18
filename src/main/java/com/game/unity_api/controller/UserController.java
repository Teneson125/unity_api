package com.game.unity_api.controller;

import com.game.unity_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("register")
    public void userRegister(@RequestParam String email, @RequestParam String name, @RequestParam(defaultValue = "noReferral") String refId ){
        userService.createUser(email, name, refId);
    }
}
