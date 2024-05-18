package main.java.com.services;

public interface FormLogin {
    public void formLogin(String username, String password);

    public void formLogin(); // trung ten nhung khac param van OK
    public void login();

    public void formRegister();

    public void formLogout();
}
