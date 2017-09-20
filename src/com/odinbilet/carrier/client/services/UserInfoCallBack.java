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
        if (userInfo != null) {
            Globals.userInfo = userInfo;
            if (Globals.userInfo.getUserName() == "Serge")
                Globals.initScreen();
        } else {
            Window.alert("Not logged in");
        }

    }

    public UserInfoCallBack() {
    }
}
