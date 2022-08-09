package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class OpenWithProfile {

    public static void main(String[] args) {

        // * set driver path
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", absolutePath+"/bin/chromedriver.exe");

        // * chrome options
        ChromeOptions options = new ChromeOptions();
        // * options for chrome window start maximized
        options.addArguments("--start-maximized");
        // * path of profile
        String profilePath = "C:\\Users\\mkaga\\AppData\\Local\\Google\\Chrome\\User Data";
        // * path of profile added to options
        options.addArguments("user-data-dir=" + profilePath);
        // * The settings added to the options variable were given to the driver when defining the driver.
        WebDriver driver = new ChromeDriver(options);

        String url = "https://www.enuygun.com";
        driver.get(url);
    }
}
