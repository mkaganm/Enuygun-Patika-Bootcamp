package MKaganM;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverChrome extends Drivers {

    // ! dont forget adding try catch
    // * default constructor for driver
    public DriverChrome() {
        setupDriver();
        this.driver = new ChromeDriver();
    }

    // ! dont forget adding try catch
    // * constructor with options
    public DriverChrome(String[] args){
        setupDriver();
        this.driver = new ChromeDriver(optionsChrome(args));
    }

    // * set options
    public ChromeOptions optionsChrome(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.addArguments(args);
        return options;
    }

    // * setup driver and driver path
    @Override
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver", FindPath.driverPath(DriverType.CHROME));
    }


}
