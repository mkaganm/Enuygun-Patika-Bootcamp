package com.demoqa;

public class Main {

    // * yazılan metodlar main de kullanıldı
    public static void main(String[] args) {

        String url = "https://demoqa.com/webtables";
        String xPath = "//input[@id=\"searchBox\"]";

        // * chrome için
        String placeHolder;
        placeHolder = Automation.search("chrome", url, xPath);
        System.out.println(placeHolder);

        // * edge için
        placeHolder = Automation.search("edge", url, xPath);
        System.out.println(placeHolder);

        // * firefox için
        placeHolder = Automation.search("firefox", url, xPath);
        System.out.println(placeHolder);
    }
}