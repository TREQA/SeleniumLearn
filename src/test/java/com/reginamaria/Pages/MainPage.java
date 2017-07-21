package com.reginamaria.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.HashMap;

/**
 * Created by cpruteanu on 7/21/2017.
 */

public class MainPage {

    //declare webdriver
    protected static WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //-------------------------------------- Locators

    @FindBy(xpath = "//*[@id=\"block-menu-block-1\"]/div/ul/li[1]/a")
    private WebElement medici;

    @FindBy(xpath = "//*[@id=\"block-menu-block-1\"]/div/ul/li[2]/a")
    private WebElement policlinici;

    @FindBy(xpath = "//*[@id=\"block-menu-block-1\"]/div/ul/li[3]/a")
    private WebElement spitale;

    @FindBy(xpath = "//*[@id=\"block-menu-block-1\"]/div/ul/li[4]/a")
    private WebElement laborator;

    @FindBy(xpath = "//*[@id=\"block-menu-block-1\"]/div/ul/li[5]/a")
    private WebElement abonamenteSiPachete;

    @FindBy(xpath = "//*[@id=\"block-menu-block-1\"]/div/ul/li[6]/a")
    private WebElement imagistica;

    @FindBy(xpath = "//*[@id=\"block-menu-block-1\"]/div/ul/li[7]/a")
    private WebElement stiri;



    //-------------------------------------- Methods

//    public void map() {
//        HashMap<String, WebElement> hashMap = new HashMap();
//        hashMap.put("1", medici);
//        hashMap.put("2", policlinici);
//        hashMap.put("3", spitale);
//        hashMap.put("4", laborator);
//        hashMap.put("5", abonamenteSiPachete);
//        hashMap.put("6", imagistica);
//        hashMap.put("7", stiri);
//
//        for (int i = 0; i < hashMap.size(); i++) {
//            System.out.println(hashMap.get(i));
//        }
//    }


}
