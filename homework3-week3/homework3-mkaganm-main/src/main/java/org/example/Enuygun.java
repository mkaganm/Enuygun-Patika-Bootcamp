package org.example;

import MKaganM.DriverChrome;
import MKaganM.DriverEdge;
import MKaganM.DriverFirefox;

public class Enuygun {


    DriverChrome driverChrome = new DriverChrome();
    DriverFirefox driverFirefox = new DriverFirefox();
    DriverEdge driverEdge = new DriverEdge();

    // * main page url
    public String url = "https://www.enuygun.com";

    // * this method open main page with all drivers
    public void openMainPageAllDriver(){
        openMainPageChrome();
        openMainPageFirefox();
        openMainPageEdge();
    }

    // * this method open enuygun main page with chrome
    public void openMainPageChrome(){

        this.driverChrome.open(url);
    }

    // * this method open enuygun main page with Firefox
    public void openMainPageFirefox(){

        this.driverFirefox.open(url);
    }

    // * this method open enuygun main page with edge
    public void openMainPageEdge(){

        this.driverEdge.open(url);
    }

}
