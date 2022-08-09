/*
 * @author M.Kağan Meriç
 * @since 06.2022
 */

package com.demoqa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomationTest {


    // * chrome için search testi
    @Test
    public void searchChromeTest(){
        String expectation = "Type to search";
        String url = "https://demoqa.com/webtables";
        String xPath = "//input[@id=\"searchBox\"]";
        String result = Automation.search("chrome",url,xPath);
        assertEquals(expectation, result);
    }

    // * edge için search testi
    @Test
    public void searchEdgeTest(){
        String expectation = "Type to search";
        String url = "https://demoqa.com/webtables";
        String xPath = "//input[@id=\"searchBox\"]";
        String result = Automation.search("edge",url,xPath);
        assertEquals(expectation, result);
    }

    // * firefox için search testi
    @Test
    public void searchFirefoxTest(){
        String expectation = "Type to search";
        String url = "https://demoqa.com/webtables";
        String xPath = "//input[@id=\"searchBox\"]";
        String result = Automation.search("firefox",url,xPath);
        assertEquals(expectation, result);
    }

}
