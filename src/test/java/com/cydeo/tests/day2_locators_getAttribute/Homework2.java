package com.cydeo.tests.day2_locators_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //Verify header text
        //Expected: “Log in to ZeroBank”
        WebElement header= driver.findElement(By.tagName("h3"));
        String actualHeader=header.getText();
        String expectedHeader="Log in to ZeroBank";

        System.out.println("actualHeader = " + actualHeader);

        if (actualHeader.equals(expectedHeader)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED!!!");
        }

        driver.close();


    }
}
