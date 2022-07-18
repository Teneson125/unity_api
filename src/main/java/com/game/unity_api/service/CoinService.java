package com.game.unity_api.service;

import com.game.unity_api.entity.Coin;
import com.game.unity_api.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoinService {
    @Autowired
    CoinRepository coinRepository;

    public void insertData(String email, Integer coinCount, String reason, String date, String time){
        Coin coin = new Coin(email, coinCount, reason, date, time);
        coinRepository.save(coin);
    }
}
