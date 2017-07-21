package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ddorneanu on 08.10.2016 12:44.
 */
public class LoginPageNew {
    WebDriver driver;

    public LoginPageNew (WebDriver ldriver){
        this.driver = ldriver;
    }

    @FindBy(id="user_login")
    WebElement username;
    @FindBy(how = How.ID, using="user_pass" )
    WebElement password;
    @FindBy(how = How.XPATH, using="//*[@id=\"wp-submit\"]")
    WebElement submit_button;
    @FindBy(how = How.LINK_TEXT, using="Lost your password?")
    WebElement forget_password;

    public void login_Wordpress (String uid, String pass){
        username.sendKeys(uid);
        password.sendKeys(pass);
        submit_button.click();
    }

}
