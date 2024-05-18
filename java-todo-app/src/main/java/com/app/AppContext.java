package main.java.com.app;

import main.java.com.controller.DashboardController;

public class AppContext {
    private static DashboardController dashboardController; // khoi tao 1 bien

    public static DashboardController getDashboardController() {
        if (dashboardController == null) {
            dashboardController = new DashboardController(); // khoi tao instance
        }
        return dashboardController;
    }
}
