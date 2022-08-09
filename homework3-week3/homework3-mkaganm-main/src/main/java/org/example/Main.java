package org.example;



public class Main {
    public static void main(String[] args) {

        EnuygunLoginPage loginPage = new EnuygunLoginPage();
        loginPage.openLoginPageAllDrivers();

        EnuygunRegisterPage registerPage = new EnuygunRegisterPage();
        registerPage.openRegisterAllDrivers();

    }
}