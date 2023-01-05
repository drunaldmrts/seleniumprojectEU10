package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement labelText= driver.findElement(By.className("login-item-checkbox-label"));
        String expectedLabelText="Remember me on this computer";
        String actualLabelText=labelText.getText();

        if(actualLabelText.equals(expectedLabelText)){
            System.out.println("Label verification PASSED");
        }else{
            System.out.println("Label verification FAILED!!!");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPassword= driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgot="Forgot your password?";
        String actualForgot=forgotPassword.getText();

        if(actualForgot.equals(expectedForgot)){
            System.out.println("Forgot Password Link verification PASSED");
        }else{
            System.out.println("actualForgot = " + actualForgot);
            System.out.println("expectedForgot = " + expectedForgot);

            System.out.println("Forgot Password Link verification FAILED!!!");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedAttribute="forgot_password=yes";
        String actualAttribute= forgotPassword.getAttribute("href");
        System.out.println("actualAttribute = " + actualAttribute);

        if(actualAttribute.contains(expectedAttribute)){
            System.out.println("hrf attribute verification PASSED");
        }else{
            System.out.println("hrf attribute verification FAILED!!!");
        }


    }
}
