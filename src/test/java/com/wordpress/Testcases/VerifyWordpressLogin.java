package com.wordpress.Testcases;

import com.wordpress.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by ddorneanu on 04.10.2016 00:46.
 * This clase is the actual testcase that uses the Login Page Object
 * Based on tutorial from here: https://www.youtube.com/watch?v=w_iPCT1ETO4
 */
public class VerifyWordpressLogin {



    @Test
    public void verifyValidLogin(){
        System.setProperty("webdriver.chrome.driver", "D://WebTesting//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demosite.center/wordpress/wp-login.php");
        LoginPage login = new LoginPage(driver);
        login.loginToWordpress("admin","demo123");
        driver.quit();
    }
}
