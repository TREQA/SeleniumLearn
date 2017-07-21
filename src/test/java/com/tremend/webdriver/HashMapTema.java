package com.tremend.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dbrosteanu on 3/3/2017.
 */
public class HashMapTema {


    @Test
    public static void temaHashMaps() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-2.30\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://webshop.mezcrafts.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("radu");
        driver.findElement(By.id("password")).sendKeys("qwerty123456789");
        driver.findElement(By.id("button-title")).click();
        driver.findElement(By.id("cs-submit")).click();
        HashMap<String, String> map = new HashMap<String, String>();
        List<Map<String,String>> listofMaps = new ArrayList<Map<String, String>>();

        int i = 1;
        String xpathTemp;


        do {
            int j=1;
            xpathTemp = "//*[@id=\"nav\"]/ol/li[" + i + "]/a";
            System.out.println(xpathTemp);
            Actions action = new Actions(driver);
            System.out.println(driver.findElement(By.xpath(xpathTemp)).getAttribute("class"));

//            if(driver.findElement(By.xpath(xpathTemp)).getClass() == "leve1 has-children" ){
//                System.out.println("MFG");
//            }
//            else {
//                System.out.println("nay");
//            }
            i++;

        }while (driver.findElement(By.xpath(xpathTemp)).isDisplayed());


    }
}

