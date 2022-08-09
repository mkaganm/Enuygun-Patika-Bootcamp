package org.example;


public class EnuygunLoginPage extends Enuygun {

    String loginID = "ctx-LoginBtn";

    // * this method open login page with all drivers
    public void openLoginPageAllDrivers(){

        openLoginPageChrome();
        openLoginPageFirefox();
        openLoginPageEdge();
    }

    // * this method open login page with chrome
    public void openLoginPageChrome(){
        openMainPageChrome();
        driverChrome.clickById(loginID);
    }

    // * this method open login page with firefox
    public void openLoginPageFirefox(){
        openMainPageFirefox();
        driverFirefox.clickById(loginID);
    }

    // * this method open login page with edge
    public void openLoginPageEdge(){
        openMainPageEdge();
        driverEdge.clickById(loginID);
    }

}
