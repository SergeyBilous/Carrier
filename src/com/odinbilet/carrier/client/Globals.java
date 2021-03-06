package com.odinbilet.carrier.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.odinbilet.carrier.client.services.LogonService;
import com.odinbilet.carrier.client.services.LogonServiceAsync;

import java.util.logging.Logger;

public class Globals {
    public static Logger logger = Logger.getLogger("Commands");
    public static Integer clientHeght, clientWidth;
    public static UserInfo userInfo = null;
    public static LogonServiceAsync logonService = GWT.create(LogonService.class);
    public static void initScreen() {
        MenuBar mainMenu = new MenuBar();
        mainMenu.setAutoOpen(true);
        mainMenu.setAnimationEnabled(true);
        // Главное меню

        // Перевозки
        MenuBar transportationsMenu = new MenuBar(true);
        transportationsMenu.setAnimationEnabled(true);
        transportationsMenu.addItem("Разнарядки", MenuCommands.distributionsCmd());
        transportationsMenu.addItem("Прием данных терминалов", MenuCommands.getTerminalDataCmd());
        mainMenu.addItem("Перевозки", transportationsMenu);

        // Предприятие
        MenuBar organiationMenu = new MenuBar(true);
        MenuBar transportSubMenu = new MenuBar(true);
        transportSubMenu.addItem("Список", MenuCommands.transportCmd());
        transportSubMenu.addItem("Пробег", MenuCommands.mileageCmd());
        organiationMenu.addItem("Транспорт", transportSubMenu);
        organiationMenu.addItem("Сотрудники", MenuCommands.employeesCmd());
        mainMenu.addItem("Предприятие", organiationMenu);

        // Справочники
        MenuBar dictionariesMenu = new MenuBar(true);
        dictionariesMenu.addItem("Остановки", MenuCommands.stationsCmd());
        dictionariesMenu.addItem("Маршруты", MenuCommands.routesCmd());
        dictionariesMenu.addItem("Расписания", MenuCommands.shedulesCmd());
        dictionariesMenu.addItem("Организации", MenuCommands.organisationsCmd());
        mainMenu.addItem("Справочники", dictionariesMenu);
        //  Отчеты
        MenuBar reportsMenu = new MenuBar(true);
        MenuBar transporationsSubMenu = new MenuBar(true);
        MenuBar onTerminalData = new MenuBar(true);
        MenuBar workRegistrationList = new MenuBar(true);
        workRegistrationList.addItem("По одному графику", MenuCommands.workOnRouteOnSheduleCmd());
        workRegistrationList.addItem("По маршруту за день", MenuCommands.workOnRouteOnRouteCmd());
        transporationsSubMenu.addItem("Лист учета работы на маршруте", workRegistrationList);
        reportsMenu.addItem("Перевозки", transporationsSubMenu);
        transporationsSubMenu.addItem("Данные о перевозках", MenuCommands.transportationsDataCmd());
        transporationsSubMenu.addItem("Пассажиропоток по маршруту за месяц", MenuCommands.passengerFlowAtMonthCmd());
        transporationsSubMenu.addItem("Выручка по дням", MenuCommands.incomingsByDaysCmd());

        onTerminalData.addItem("По автобусам", MenuCommands.reportByBusesCmd());
        onTerminalData.addItem("По водителям", MenuCommands.reportByDriversCmd());
        onTerminalData.addItem("По кондукторам", MenuCommands.reportByConductorsCmd());
        onTerminalData.addItem("Сводный за месяц", MenuCommands.consolidatedReportCmd());
        reportsMenu.addItem("По данным терминалов", onTerminalData);
        mainMenu.addItem("Отчеты", reportsMenu);
        Window.setTitle("Рабочее место перевозчика в АСОП \"Один билет\"");
        RootPanel.get().add(mainMenu);
        TabLayoutPanel pl = new TabLayoutPanel(1.5, Style.Unit.EM);
        pl.add(new HTML("this content"), "this");
        pl.add(new HTML("that content"), "that");
        pl.add(new HTML("the other content"), "the other");
        RootPanel.get().add(pl);

    }
}
