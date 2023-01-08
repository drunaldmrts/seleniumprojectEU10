package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_IframePractice {
WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }
    //@Ignore for skip the test
    @Test
    public void iframeTask(){

        //We need to switch driver's focus to iframe
        //driver.switchTo().frame("mce_0_ifr");---> option1 switch to using id attribute
        //option2 switch to frame using index
        driver.switchTo().frame(0);

        //locate p tag
        WebElement contentText= driver.findElement(By.xpath("//p"));

        //Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(contentText.isDisplayed());

        // To be able to verify the header, we must switch back to main HTML
        driver.switchTo().parentFrame();

        WebElement headerText= driver.findElement(By.xpath("//h3"));

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        Assert.assertTrue(headerText.isDisplayed());

    }

}
