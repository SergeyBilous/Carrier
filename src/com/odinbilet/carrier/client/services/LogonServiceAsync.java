package com.odinbilet.carrier.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.odinbilet.carrier.client.UserInfo;

public interface LogonServiceAsync {
    void logon(String user, String password,AsyncCallback<UserInfo> arg3);
}
