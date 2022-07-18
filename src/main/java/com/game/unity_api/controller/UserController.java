package com.game.unity_api.controller;

import com.game.unity_api.service.OtpService;
import com.game.unity_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    OtpService otpService;

    @PostMapping("register")
    public String userRegister(@RequestParam String email, @RequestParam String name, @RequestParam(defaultValue = "noReferral") String refId ){
        return userService.createUser(email, name, refId);
    }
    @PostMapping("login")
    public void login(@RequestParam String email){
        otpService.sendOtp(email);
    }

}
