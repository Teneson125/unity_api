package com.game.unity_api.service;

import com.game.unity_api.entity.Referral;
import com.game.unity_api.entity.User;
import com.game.unity_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    ReferralService referralService;
    @Autowired
    DateTimeService dateTimeService;

    public void createUser(String email, String name, String refId ){

        userData(refId);
        User user = new User(userId, name, email, status, coin, balance,keySilver, keyGold, keyDiamond, totalReferral, xp, level, reason, refId, refStatus, date, time);
        userRepository.save(user);
    }

    private void userData(String refId) {
        Referral referral = referralService.findReferralId(refId);
        if(referral != null){
            if(referral.getStatus().equals("active")) {
                coin = referral.getCoin();
                balance = referral.getAmount();
                keySilver = referral.getKeySilver();
                keyGold = referral.getKeyGold();
                keyDiamond = referral.getKeyDiamond();
            }
        }else{
            referral = referralService.findReferralId("noReferral");
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
        int number = random.nextInt(99999999);
        char[] text = new char[random.nextInt(8)];
        for(int i = 0; i < text.length; i++){
            text[i] = (char)(random.nextInt(26));
        }
        String word = new String(text);
        return "ref" + word + number;
    }

}
