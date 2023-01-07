package com.cydeo.tests.day5_dynamicWebelements_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task2_radiobutton {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
        WebElement hockeyButton= driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();
        

        //4. Verify “Hockey” radio button is selected after clicking.
        if(hockeyButton.isSelected()){
            System.out.println("Button is selected. Verification is PASSED");
        }else {
            System.out.println("Button is not selected. Verification is FAILED");
        }

        driver.close();
    }
}
