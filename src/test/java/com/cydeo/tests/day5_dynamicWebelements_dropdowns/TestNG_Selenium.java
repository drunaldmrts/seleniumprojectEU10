package com.cydeo.tests.day5_dynamicWebelements_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        // Do browser set up
        // Open browser
        driver = WebDriverFactory.getDriver("chrome");

        // Maximase the page
        driver.manage().window().maximize();

        // Implicitly wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void selenium_test(){

        // Get https://www.google.com
        driver.get("https://www.google.com");

        // Assert title is "Google"
        //Assert.assertEquals(driver.getTitle(),"Google","Title is not matching here."); --> second way

        String actualTitle= driver.getTitle();  // more organise way
        String expectedTitle="Google";
        Assert.assertEquals(actualTitle,expectedTitle,"Title is not matching here.");
    }
}
