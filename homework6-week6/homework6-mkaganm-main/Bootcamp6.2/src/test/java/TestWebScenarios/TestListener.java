package TestWebScenarios;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener extends BaseTest implements ITestListener {

    private static String getTestMethodName(ITestResult iTestResult){
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(WebDriver driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    public static String saveTextLog(String message){
        return message;
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        ITestListener.super.onTestFailure(iTestResult);
        System.out.println("onTestFailure method " + getTestMethodName(iTestResult) );

        Object testClass = iTestResult.getInstance();
        WebDriver driver = (driverChrome.driver);

        if (driver instanceof WebDriver){
            System.out.println("SS captured for test case " + getTestMethodName(iTestResult));
            saveScreenshot(driver);
        }

        saveTextLog(getTestMethodName(iTestResult) + "failed");
    }
}
