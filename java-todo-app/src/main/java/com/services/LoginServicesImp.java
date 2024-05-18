package main.java.com.services;

public class LoginServicesImp implements SSOLogin, FormLogin {

    @Override
    public void login(String cookie) // 2 interface trung method van Ok mien khac param
    {

    }

    @Override
    public void logout(String cookie) {

    }

    @Override
    public void formLogin(String username, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formLogin'");
    }

    @Override
    public void formLogin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formLogin'");
    }

    @Override
    public void formRegister() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formRegister'");
    }

    @Override
    public void formLogout() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formLogout'");
    }

    @Override
    public void login() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

}
