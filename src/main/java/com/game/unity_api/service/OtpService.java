package com.game.unity_api.service;

import com.game.unity_api.entity.Otp;
import com.game.unity_api.repository.OtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OtpService {

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private OtpRepository otpRepository;
    @Autowired
    private DateTimeService dateTimeService;

    public boolean validateOtp(String email, String otp){
        Otp data = otpRepository.findByEmail(email);
        if(otp.equals(data.getOtp())){
            return true;
        }else {
            return false;
        }
    }
    public void sendOtp(String email){
        Random random = new Random();
        String otp = String.valueOf(random.nextInt(999999));
        sendMail(email, otp);
    }

    private void sendMail(String email, String otpNum) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("kannamanoj88@gmail.com");
        message.setTo(email);
        message.setSubject("Unity OTP");
        message.setText("your otp is " + otpNum);
        javaMailSender.send(message);
        String date = dateTimeService.currentDate();
        String time = dateTimeService.currentTime();
        Otp otp = new Otp(email, otpNum, date, time);
        otpRepository.save(otp);
    }
}
