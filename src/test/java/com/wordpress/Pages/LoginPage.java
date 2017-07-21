package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by ddorneanu on 03.10.2016.
 * This class will store all the locators and methods of the login page
 * Based on tutorial from here: https://www.youtube.com/watch?v=w_iPCT1ETO4
 */
public class LoginPage {

    private WebDriver driver;
    private By username = By.id("user_login");
    private By password = By.xpath("//*[@id=\"user_pass\"]");
    private By LoginButton = By.name("wp-submit");

    public LoginPage (WebDriver driver){


        this.driver=driver;

    }
    public void loginToWordpress (String uid, String pass)
    {
        driver.findElement(username).sendKeys(uid);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(LoginButton).click();
    }


}
