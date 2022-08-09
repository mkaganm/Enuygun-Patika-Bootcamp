package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Data;
import org.openqa.selenium.By;
import testng.AddContactToHomeTest;


@Data
public class HomePage extends BasePages {


    @AndroidFindBy(id = "android:id/title")
    private MobileElement homePageTitle;

    @AndroidFindBy(id = "showInvisible")
    private MobileElement invisibleCheck;

    @AndroidFindBy(id = "addContactButton")
    private MobileElement addContactButton;


}
