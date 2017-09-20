package com.odinbilet.carrier.server;


import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.odinbilet.carrier.client.UserInfo;
import com.odinbilet.carrier.client.services.LogonService;

public class LogonServiceImpl extends RemoteServiceServlet implements LogonService {
    @Override
    public UserInfo logon(String user, String password) {
        UserInfo ret=new UserInfo();
        ret.setSessionId(100l);
        ret.setUserName("Serge");
        return ret;
    }
}

