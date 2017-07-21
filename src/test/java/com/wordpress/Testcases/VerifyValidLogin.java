package com.wordpress.Testcases;

import com.Utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by ddorneanu on 08.10.2016 13:11.
 * created using tutorila from https://www.youtube.com/watch?v=fUSl-WhqymU
 *
 */
public class VerifyValidLogin {
    @Test
    public void checkValidUser(){
      WebDriver driver = BrowserFactory.startBrowser("chome","http://demosite.center/wordpress/wp-login.php");

    }
}
