package com.game.unity_api.service;

import com.game.unity_api.entity.Referral;
import com.game.unity_api.entity.User;
import com.game.unity_api.repository.ReferralRepository;
import com.game.unity_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


@Service
public class UserService {
    private String userId;
    private String status;
    private Integer coin;
    private Double balance;
    private Integer keySilver;
    private Integer keyGold;
    private Integer keyDiamond;
    private Integer totalReferral;
    private Integer xp;
    private Integer level;
    private String reason;
    private String refStatus;
    private String date;
    private String time;

    @Autowired
    UserRepository userRepository;
    @Autowired
    DateTimeService dateTimeService;
    @Autowired
    ReferralRepository referralRepository;
    @Autowired
    OtpService otpService;

    public Map<String, String> getUserDetail(String email, String otp) {
        HashMap<String, String> map = new HashMap<>();

        if(otpService.validateOtp(email, otp)){
            if(checkEmailId(email)){
                User user = userRepository.findByEmail(email);
                map.put("message","Login Success");
            }
            else {
                map.put("message","Email Not Register");
            }

        }else {
            map.put("message","Invalid OTP");
        }
        return map;
    }

    public Map<String, String> createUser(String email, String name, String refId, String otp){
        HashMap<String, String> map = new HashMap<>();

        if(otpService.validateOtp(email, otp)){
            if(!checkEmailId(email)){
                if(checkRefId(refId)){
                    userData(refId);
                    User user = new User(userId, name, email, status, coin, balance,keySilver, keyGold, keyDiamond, totalReferral, xp, level, reason, refId, refStatus, date, time);
                    userRepository.save(user);
                    map.put("message","Register Success");
                }
                else {
                    map.put("message","Invalid Referral Id");
                }
            }
            else {
                map.put("message","Email Already Register");
            }
        }
        else {
            map.put("message","Invalid Otp");
        }
        return map;
    }

    private boolean checkRefId(String refId) {
        if(referralRepository.findByRefId(refId) == null){
            return false;
        }else {
            return true;
        }
    }
    private boolean checkEmailId(String email){
        if(userRepository.findByEmail(email) == null){
            return false;
        }else {
            return true;
        }
    }

    private void userData(String refId) {
        Referral referral = referralRepository.findByRefId(refId);
        if(referral != null){
            if(referral.getStatus().equals("active")) {
                coin = referral.getCoin();
                balance = referral.getAmount();
                keySilver = referral.getKeySilver();
                keyGold = referral.getKeyGold();
                keyDiamond = referral.getKeyDiamond();
            }
        }else{
            referral = referralRepository.findByRefId("noReferral");
            coin = referral.getCoin();
            balance = referral.getAmount();
            keySilver = referral.getKeySilver();
            keyGold = referral.getKeyGold();
            keyDiamond = referral.getKeyDiamond();
        }
        userId = createUserId();
        xp = 0;
        level = 0;
        totalReferral = 0;
        status = "created";
        reason = "no data";
        refStatus = "coin";
        time = dateTimeService.currentTime();
        date = dateTimeService.currentDate();
    }

    private String  createUserId() {
        Random random = new Random();
        int number1 = random.nextInt(99);
        int number2 = random.nextInt(999);
        int number3 = random.nextInt(99);
        char word1 = (char)('a' + random.nextInt(26));
        char word2 = (char)('a' + random.nextInt(26));
        char word3 = (char)('a' + random.nextInt(26));
        userId = "" + word1 + number1 + word2 + number2 + word3 + number3;
        return userId;

    }

}
