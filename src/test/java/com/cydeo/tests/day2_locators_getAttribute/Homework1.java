package com.cydeo.tests.day2_locators_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //Search for “wooden spoon”
        WebElement search= driver.findElement(By.name("search_query"));
        search.sendKeys("wooden spoon"+ Keys.ENTER);

        //Verify title:
        //Expected: “Wooden spoon | Etsy”
        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification is PASSED");
        }else {
            System.out.println("Verification is FAILED!!!");
        }

        driver.close();
    }
}
