package com.cydeo.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/*
In this class only general utility methods that are not releated to some specific page
 */
public class BrowserUtils {

    /*
    This method will accept int (in second) and execute Thread.sleep for given duration
     */
    public static void sleep(int second){

        second*=1000;

        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    /*
    This method accepts 3 arguments
    1-webdriver
    2-expectedinUrl--> for verify if the url contains given String
    3-expectedTitle--> to be compared with actual title
     */

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){

        Set<String> allWindowHandles=driver.getWindowHandles();

        for (String each : allWindowHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }
        String actualTitle= driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    /*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */

    public static void verifyTitle (WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }





}

