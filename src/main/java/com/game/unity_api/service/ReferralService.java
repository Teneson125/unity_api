package com.game.unity_api.service;

import com.game.unity_api.repository.ReferralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReferralService {

    @Autowired
    ReferralRepository referralRepository;

}
