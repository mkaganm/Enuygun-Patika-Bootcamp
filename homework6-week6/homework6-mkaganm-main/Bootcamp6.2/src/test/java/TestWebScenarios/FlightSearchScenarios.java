package TestWebScenarios;

import Api.EnuygunApi;
import EnuygunPages.HomePage;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.qameta.allure.*;
import model.Root;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchScenarios extends BaseTest {

    HomePage homePage;
    String keyWord = "ada";
    Root root;


    public FlightSearchScenarios(){
        setupDriver();
    }

    @BeforeClass()
    public void setup(){

        homePage = new HomePage();
        root = new Root();
    }


    @Test(priority = 1)
    @Feature("open enuygun home page")
    @Epic("open enuygun home page")
    @Description("open enuygun home page")
    @Link("www.enuygun.com")
    public void openEnuygun(){
        driverChrome.open(homePage.getBaseUrl());
    }



    @Test(priority = 2)
    @Description("search for keyword")
    public void searchForKeyword(){

        driverChrome.getElement(homePage.getFlightSearch()).click();

        String tagName = driverChrome.getElement(homePage.getFlightSearch()).getTagName();
        Assert.assertEquals("input", tagName);

        driverChrome.getElement(homePage.getFlightSearch()).sendKeys(keyWord);

        String tagName2 = driverChrome.getElement(homePage.getFlightSearch()).getAttribute("value");
        Assert.assertEquals(keyWord, tagName2);

    }



    @Test(priority = 3)
    @Description("check search list and api search")
    public void checkListForSearch() throws UnirestException, IOException{
        List<String> searchFlightLists;

        searchFlightLists = driverChrome.getElements(homePage.getListFlightSearch())
                .stream().map(e->e.getText()).collect(Collectors.toList());

        EnuygunApi api = new EnuygunApi();
        Root[] roots = api.flightTiketFromListByRest("ada");
        List<String> rootsString = root.convertToRootList(roots);

        for (int i = 0; i<rootsString.size(); i++){
            Assert.assertEquals(rootsString.get(i), searchFlightLists.get(i));
        }
    }

}
