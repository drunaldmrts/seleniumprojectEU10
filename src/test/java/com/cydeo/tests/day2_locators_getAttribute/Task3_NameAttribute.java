package com.cydeo.tests.day2_locators_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_NameAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // Go to www.google.com
        driver.get("https:www.google.com");

        // Write "apple" in search box
        // Press Enter by using Keys.ENTER
        WebElement searchGoogle= driver.findElement(By.name("q"));
        searchGoogle.sendKeys("apple"+ Keys.ENTER);

        // Verify title
        String expectedTitle="apple";
        String actualTitle= driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }


    }
}
