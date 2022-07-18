package com.game.unity_api.controller;

import com.game.unity_api.service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtpController {
    @Autowired
    OtpService otpService;

    @PostMapping("trigger-otp")
    public void triggerOtp(@RequestParam String email){
        otpService.sendOtp(email);
    }
}
