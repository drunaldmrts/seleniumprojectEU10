package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_getAttribute {

    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

       //2- Go to: https://login1.nextbasecrm.com/
       driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        //WebElement logInButton= driver.findElement(By.className("login-btn"));
        //                                                  tagName[attribute='value']
        //WebElement logInButton= driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement logInButton= driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement logInButton= driver.findElement(By.cssSelector("input[value='Log In']"));

    }
}
