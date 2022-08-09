package org.example;

public class EnuygunRegisterPage extends Enuygun {

    public String registerId = "ctx-RegisterBtn";

    // * this method open register page with all drivers
    public void openRegisterAllDrivers(){
        openRegisterChrome();
        openRegisterFirefox();
        openRegisterEdge();
    }

    // * this method open register page with chrome
    public void openRegisterChrome(){
        openMainPageChrome();
        this.driverChrome.clickById(registerId);
    }

    // * this method open register page with firefox
    public void openRegisterFirefox(){
        openMainPageFirefox();
        this.driverFirefox.clickById(registerId);
    }

    // * this method open register page with edge
    public void openRegisterEdge(){
        openMainPageEdge();
        this.driverEdge.clickById(registerId);
    }
}
