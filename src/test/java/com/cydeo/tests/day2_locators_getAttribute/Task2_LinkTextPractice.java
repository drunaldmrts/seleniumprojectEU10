package com.cydeo.tests.day2_locators_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_LinkTextPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //Click to A/B Testing from the top of the list
        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink=driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        // Verify the title
        String expectedTitle="No A/B Testing";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED!!");
        }

        // Go back to home page by using back()
        driver.navigate().back();

        // Verify title
        expectedTitle="Practice";
        actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED!!");
        }

        driver.close();

    }
}
