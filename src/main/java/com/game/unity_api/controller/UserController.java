package com.game.unity_api.controller;

import com.game.unity_api.entity.UserDetail;
import com.game.unity_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("register")
    public Map<String, String> userRegister(@RequestParam String email, @RequestParam String name, @RequestParam(defaultValue = "noReferral") String refId, @RequestParam String otp ){
        return userService.createUser(email, name, refId, otp);
    }
    @PostMapping("login")
    public UserDetail login(@RequestParam String email, @RequestParam String otp){
        return userService.getUserDetail(email, otp);
    }

}
