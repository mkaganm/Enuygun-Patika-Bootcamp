package TestWebScenarios;

import MKaganM.DriverChrome;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public DriverChrome driverChrome;

    public void setupDriver(){
        String[] options ={"--start-maximized"
                ,"--disable-notifications"};
        driverChrome = new DriverChrome(options);
    }

    public WebDriver returnDriver(){
        return this.driverChrome.driver;
    }
}
