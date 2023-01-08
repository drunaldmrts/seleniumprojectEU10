package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4 {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        //WebElement resetPasswordButton= driver.findElement(By.cssSelector("button.login-btn"));
        WebElement resetPasswordButton= driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResetPasswordButton="Reset password";
        String actualResetPasswordButton=resetPasswordButton.getAttribute("value");

        System.out.println("actualResetPasswordButton = " + actualResetPasswordButton);

        if(actualResetPasswordButton.equals(expectedResetPasswordButton)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED!!!");
        }

        driver.close();
    }
}
