package com.tremend.webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ddorneanu on 01.10.2016 22:23 22:24.
 */
public class PrimulTest {

    @Test
    public void verificareTitlu(){

        System.setProperty("webdriver.chrome.driver", "C:\\AutomatedStuff\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.navigate().to("http://www.tremend.com/");
        Assert.assertTrue(driver.getTitle().equals("Tremend - Delivered as intended"));

        driver.close();


    }

}
