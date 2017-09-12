package com.odinbilet.carrier.client;


import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;


import java.util.logging.Level;

public class MenuCommands {


    public static Command distributionsCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                Integer h = Window.getClientHeight();
                Integer w = Window.getClientWidth();
                Window.alert("Size is " + w.toString() + "x" + h.toString());
            }
        };

        return ret;
    }


    public static Command getTerminalDataCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Прием данных терминалов");
            }
        };

        return ret;
    }

    public static Command employeesCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Сотрудники");
            }
        };

        return ret;
    }

    public static Command mileageCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Пробег");
            }
        };
        return ret;
    }

    public static Command transportCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Список ТС");
            }
        };
        return ret;
    }

    public static Command stationsCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Остановки");
            }
        };
        return ret;
    }

    public static Command routesCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Список ТС");
            }
        };
        return ret;
    }

    public static Command shedulesCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Список ТС");
            }
        };
        return ret;
    }

    public static Command organisationsCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Организации");
            }
        };
        return ret;
    }

    public static Command workOnRouteOnSheduleCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Лист учета по графику");
            }
        };
        return ret;
    }

    public static Command workOnRouteOnRouteCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Лист учета по маршруту за день");
            }
        };
        return ret;
    }

    public static Command transportationsDataCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Данные о перевозках");
            }
        };
        return ret;
    }

    public static Command passengerFlowAtMonthCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Пассажиропоток за месяц");
            }
        };
        return ret;
    }

    public static Command incomingsByDaysCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Выручка по дням");
            }
        };
        return ret;
    }

    public static Command reportByBusesCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Выручка по автобусам");
            }
        };
        return ret;
    }

    public static Command reportByDriversCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Выручка по водителям");
            }
        };
        return ret;
    }

    public static Command reportByConductorsCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Выручка по кондукторам");
            }
        };
        return ret;
    }

    public static Command consolidatedReportCmd() {
        Command ret = new Command() {
            @Override
            public void execute() {
                GWT.log("Сводный отчет за период");
            }
        };
        return ret;
    }
}
