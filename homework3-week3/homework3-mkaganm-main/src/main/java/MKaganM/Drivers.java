package MKaganM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Drivers {

    // * webdriver variable for all drivers
    public WebDriver driver;

    // * this method for opening url
    // * All driver class using this method
    public void open(String url){
        this.driver.get(url);
    }

    // * click method
    public void clickById(String id){
        this.driver.findElement(By.id(id)).click();
    }
    // * It is used by overwriting inside driver classes.
    public abstract void setupDriver();
}
