package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_AlertPracrices {
WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");

    }
    @Test
    public void alert_Task1(){

        //Click to “Click for JS Alert” button
        WebElement informationButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationButton.click();

        // To be able to click to Alert OK button we need to switch driver's focus to Alert itself
        Alert alert=driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement alertText= driver.findElement(By.xpath("(//p[@id='result'])"));

        Assert.assertTrue(alertText.isDisplayed(),"Result text is NOT displayed");

        String expectedText="You successfully clicked an alert";
        String actualText=alertText.getText();

        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void alertTask_Task2(){
        //Click to “Click for JS Confirm” button
        WebElement confirmButton= driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        confirmButton.click();

        //4. Click to OK button from the alert
        Alert alert= driver.switchTo().alert();
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resultText= driver.findElement(By.xpath("//p[.='You clicked: Ok']"));

        Assert.assertTrue(resultText.isDisplayed());
    }
}
