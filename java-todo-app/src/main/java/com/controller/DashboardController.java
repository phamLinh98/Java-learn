package main.java.com.controller;

import java.util.Scanner;
import main.java.com.models.TodoListModel;
import main.java.com.views.DashboardView;
import main.java.com.services.DashboardService;

public class DashboardController {
  public void runApp() {
    TodoListModel todoList = new TodoListModel();
    DashboardView menu = new DashboardView();
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        menu.showMenu();
        if (!scanner.hasNext()) {
          System.out.println("Invalid input. Please enter an integer.");
          scanner.next();
          continue;
        }
        int choice = scanner.nextInt();
        DashboardService dashboardService = new DashboardService();
        dashboardService.process(choice, todoList, scanner);
      }
    }
  }
}