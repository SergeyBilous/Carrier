package com.odinbilet.carrier.client.services;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.odinbilet.carrier.client.Globals;
import com.odinbilet.carrier.client.UserInfo;

public class UserInfoCallBack implements AsyncCallback<UserInfo> {
    @Override
    public void onFailure(Throwable throwable) {
        Window.alert("Server call unsuccessful");
    }

    @Override
    public void onSuccess(UserInfo userInfo) {

        Globals.userInfo = userInfo;
        Globals.initScreen();
        Window.alert("Greetings, "+Globals.userInfo.getUserName());}

    public UserInfoCallBack() {
    }
}
