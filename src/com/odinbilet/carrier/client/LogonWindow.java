package com.odinbilet.carrier.client;

import com.google.gwt.user.client.ui.*;

public class LogonWindow extends DialogBox {
    private com.google.gwt.user.client.ui.Grid gr = new Grid(5, 2);
    private Label hostLb = new Label("Хост");
    private Label portLb = new Label("Порт");
    private Label userLb = new Label("Пользователь");
    private Label passwLb = new Label("Пароль");

    private TextBox hostTb = new TextBox();
    private TextBox portTb = new TextBox();
    private TextBox userTb = new TextBox();
    private PasswordTextBox passwTb = new PasswordTextBox();
    public LogonWindow(){
        gr.setWidget(1,0,hostLb);
        gr.setWidget(2,0,portLb);
        gr.setWidget(3,0,userLb);
        gr.setWidget(4,0,passwLb);
        gr.setWidget(1,1,hostTb);
        gr.setWidget(2,1,portTb);
        gr.setWidget(3,1,userTb);
        gr.setWidget(4,1,passwTb);
        setWidget(gr);
    }
}
