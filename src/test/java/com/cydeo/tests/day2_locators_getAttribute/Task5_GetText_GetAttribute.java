package com.cydeo.tests.day2_locators_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_GetText_GetAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText= driver.findElement(By.tagName("h2"));
        String expectedheaderText="Registration Form";
        String actualheaderText= headerText.getText();
        if (actualheaderText.equals(expectedheaderText)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED!!!");
        }



    }
}
