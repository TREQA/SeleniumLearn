package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by ddorneanu on 08.10.2016 13:04.
 */
public class BrowserFactory {

    public static WebDriver driver;
    public static WebDriver startBrowser(String browserName, String url){

        if (browserName.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C://chromedriver-2.30//chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("iexplore")){
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;

    }
}
