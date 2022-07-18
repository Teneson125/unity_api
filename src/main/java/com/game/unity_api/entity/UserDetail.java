package com.game.unity_api.entity;

import java.util.HashMap;

public class UserDetail {
    private HashMap<String, String> messages = new HashMap<>();
    private HashMap<String, User> userInfo = new HashMap<>();

    public UserDetail(HashMap<String, String> messages) {
        this.messages = messages;
    }

    public UserDetail(HashMap<String, String> messages, HashMap<String, User> userInfo) {
        this.messages = messages;
        this.userInfo = userInfo;
    }

    public HashMap<String, String> getMessages() {
        return messages;
    }

    public void setMessages(HashMap<String, String> messages) {
        this.messages = messages;
    }

    public HashMap<String, User> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(HashMap<String, User> userInfo) {
        this.userInfo = userInfo;
    }
}
