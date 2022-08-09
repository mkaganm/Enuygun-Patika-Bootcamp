/*
 * @author M.Kağan Meriç
 * @since 06.2022
 */

package com.demoqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation {

    static WebDriver driver;

    // * Chrome için WebDriver setup eden metod
    public static void setChromeDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println(driver);
    }

    // * Edge için WebDriver setup eden metod
    public static void setEdgeDriver(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        System.out.println(driver);
    }

    // * Firefox için WebDriver setup eden metod
    public static void setFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        System.out.println(driver);
    }

    // * Search alanı için oluşturulan metod
    public static String search(String browser, String url, String xPath){
        switch (browser) {
            case "chrome" -> setChromeDriver();
            case "edge" -> setEdgeDriver();
            case "firefox" -> setFirefoxDriver();
        }

        driver.get(url);
        WebElement searchElement = driver.findElement(By.xpath(xPath));
        return searchElement.getAttribute("placeholder");
    }

    // * oluşturulan metodlar mainde kullanıldı...
    public static void main(String[] args) {

        String url = "https://demoqa.com/webtables";
        String xPath = "//input[@id=\"searchBox\"]";
        String placeHolder = search("chrome",url, xPath);
        System.out.println(placeHolder);

    }
}
