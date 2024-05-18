package main.java.com.views;

public class DashboardViewImpl implements DashboardView,SettingEuro {
    public void showMenu() {
        System.out.println("-------------");
        System.out.println("1. Add item");
        System.out.println("2. Remove item");
        System.out.println("3. Update list");
        System.out.println("4. Print list");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
    }

    @Override
    public void showName() {
        // .....
    }

    @Override
    public void settingInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'settingInfo'");
    }

    @Override
    public void exitApp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exitApp'");
    }

    @Override
    public void confirmCookie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'confirmCookie'");
    }
}