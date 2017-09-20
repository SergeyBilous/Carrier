package com.odinbilet.carrier.client;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private Long sessionId;
    private String userName;
    private static final long serialVersionUID = 1L;
    public UserInfo() {
        sessionId = 0L;
        userName = "";
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
