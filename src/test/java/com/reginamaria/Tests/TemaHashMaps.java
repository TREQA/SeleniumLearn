package com.reginamaria.Tests;

import com.Utility.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by cpruteanu on 7/21/2017.
 */

public class TemaHashMaps {

    @Test
    public void temaHashMaps() {

        //instantierea webdriver-ului (pentru ca webdriverul sa functioneze cu chrome este necesara modificarea path-ului din clasa BrowserFactory pentru chrome-driver)
        BrowserFactory.startBrowser("chrome", "https://www.reginamaria.ro/");
        WebDriver driver = BrowserFactory.driver;

        //crearea hashmap-ului si definirea variabilelor necesare popularii hashmap-ului
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        String xPath;
        int i = 1;

        //popularea hashmap-ului cu categoriile de pe site
        try {
            do {
                xPath = "//*[@id=\"block-menu-block-1\"]/div/ul/li[" + i + "]/a";
                hm.put(i, driver.findElement(By.xpath(xPath)).getText());
                i++;

            } while (driver.findElement(By.xpath(xPath)).isDisplayed());

        } catch (NoSuchElementException e) {
            System.out.println("Mapping done!");
        }

        //transformarea hashmap-ului intr-un array de string-uri
        Collection<String> categories = hm.values();
        String[] categoriesArray = categories.toArray(new String[categories.size()]);

        //printarea categoriilor de pe site ce contin litera "A" intr-un fisier
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Rezultat tema.txt"));
            bw.write("Aceste categorii contin caracterul \"A\":");
            bw.newLine();

            for (int j = 0; j < categoriesArray.length; j++) {
                if (categoriesArray[j].contains("A")) {
                    bw.write(categoriesArray[j]);
                    bw.newLine();
                }
            }

            bw.close();

        } catch (IOException ex) {
            System.out.println("IOException: " + ex);
        }

    }

}
