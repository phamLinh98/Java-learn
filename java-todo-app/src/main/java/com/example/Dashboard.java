package main.java.com.example;

public class Dashboard {
  public void runApp(){
        TodoList todoList = new TodoList();
        Menu menu = new Menu();
        try(Scanner scanner = new Scanner(System.in)) {
        while(true) {
            menu.showMenu();
            if(!scanner.hasNext()) {
                System.out.println(x:"Invalid input. Please enter an integer.");
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();
            CoreLogin CoreLogin = new CoreLogin();
            CoreLogin.process(); 
    }
   }
  }
}