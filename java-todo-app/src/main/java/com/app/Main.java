package main.java.com.app;

import main.java.com.controller.DashboardController;

public class Main {
  private static DashboardController dashboardController;

  public static void main(String[] args) {
    dashboardController = new DashboardController();
    dashboardController.runApp();
  }
}
