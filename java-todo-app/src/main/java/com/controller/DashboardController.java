package main.java.com.controller;

import java.util.Scanner;
import main.java.com.models.TodoListModel;
import main.java.com.views.DashboardView;
//import main.java.com.views.DashboardViewImpl;
import main.java.com.views.Menu;
import main.java.com.services.DashboardService;
import main.java.com.services.FormLogin;
import main.java.com.services.LoginServicesImp;
import main.java.com.services.SSOLogin;

public class DashboardController {
  public void runApp() {
    TodoListModel todoList = new TodoListModel();
    // DashboardViewImpl menu = new Menu(); // su dung class: lay theo chuan cua
    // DashboardViewImpl thi hien tai dang co 4 method(DashboardView +
    // SettingGlobal)
    DashboardView menu = new Menu(); // lay theo chuan interface DashboardView thi chi co 2 method
    FormLogin formLogin = new LoginServicesImp();
    SSOLogin ssoLogin = new LoginServicesImp();
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