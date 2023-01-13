package com.cydeo.tests.day7_webtables_utilities;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_WindowsHandling {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }

    @Test
    public void windowsHandling() {

        //Go to : https://www.amazon.com
        //3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open
        //Set<String> WindowHandle=driver.getWindowHandles();
        //WindowHandle
        for (String each : driver.getWindowHandles()) {

            driver.switchTo().window(each);

            System.out.println("Current URL = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("etsy")) {
                break;
            }

        }
        //5. Assert: Title contains “Etsy”

        String actualTitle=driver.getTitle();
        String expectedTitle="Etsy";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}



