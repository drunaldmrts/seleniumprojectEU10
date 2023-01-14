package com.cydeo.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/*
In this class only general utility methods that are not releated to some specific page
 */
public class BrowserUtilities {

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
}
