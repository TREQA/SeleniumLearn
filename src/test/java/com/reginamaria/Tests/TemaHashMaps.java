package com.reginamaria.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.*;
import java.util.HashMap;

/**
 * Created by cpruteanu on 7/21/2017.
 */

public class TemaHashMaps {

    @Test
    public void temaHashMaps() {


        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-2.30\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.reginamaria.ro/");

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        String xPath;
        int i = 1;

        try {
            do {
                xPath = "//*[@id=\"block-menu-block-1\"]/div/ul/li[" + i + "]/a";
                hm.put(i, driver.findElement(By.xpath(xPath)).getText());
                i++;

            } while (driver.findElement(By.xpath(xPath)).isDisplayed());

        } catch (NoSuchElementException e) {
            System.out.println("Mapping done!");
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Categorii cu a.txt"));
        } catch (IOException ex) {
            System.out.println("IOException!");
        }

        ///WIP

    }

}
