package com.odinbilet.carrier.client;

import com.google.gwt.user.client.Window;

import com.odinbilet.carrier.client.services.UserInfoCallBack;

import java.awt.*;

public class LogonPage implements DialogBoxOpener {
    private LogonWindow logonWindow = new LogonWindow();

    @Override
    public void bnOkClicked() {

        Globals.logonService.logon("Serge", "pass", new UserInfoCallBack());

    }

    @Override
    public void bnCancleClicked() {
        Globals.userInfo = null;

    }

    public void show() {
        logonWindow.setOpener(this);
        logonWindow.show();
    }
}
