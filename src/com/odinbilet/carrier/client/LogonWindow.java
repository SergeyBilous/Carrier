package com.odinbilet.carrier.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;

public class LogonWindow extends DialogBox {
    private DialogBoxOpener opener;
    private com.google.gwt.user.client.ui.Grid gr = new Grid(6, 2);
    private Label hostLb = new Label("Хост");
    private Label portLb = new Label("Порт");
    private Label userLb = new Label("Пользователь");
    private Label passwLb = new Label("Пароль");

    private TextBox hostTb = new TextBox();
    private TextBox portTb = new TextBox();
    private TextBox userTb = new TextBox();
    private PasswordTextBox passwTb = new PasswordTextBox();
    Button loginBn = new Button("Вход");
    Button cancelBn = new Button("Отмена");

    public LogonWindow() {

        gr.setWidget(1, 0, hostLb);
        gr.setWidget(2, 0, portLb);
        gr.setWidget(3, 0, userLb);
        gr.setWidget(4, 0, passwLb);
        gr.setWidget(1, 1, hostTb);
        gr.setWidget(2, 1, portTb);
        gr.setWidget(3, 1, userTb);
        gr.setWidget(4, 1, passwTb);
        gr.setWidget(5, 0, loginBn);
        gr.setWidget(5, 1, cancelBn);
        loginBn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                opener.bnOkClicked();
                LogonWindow.this.hide();
            }
        });
        cancelBn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                opener.bnCancleClicked();
                LogonWindow.this.hide();

            }
        });
        setText("Подключение");
        setGlassEnabled(false
        );
        setModal(true);
        setAutoHideEnabled(false);
        setWidget(gr);
    }

    public void setOpener(DialogBoxOpener pOpener) {
        opener = pOpener;
    }
}
