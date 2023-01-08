package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Yahoo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https:www.yahoo.com");

        String expectedTitle="Yahoo";

        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title is expected. Verification PASSED");
        }else{
            System.out.println("Title is NOT expected. Verification FAILED");
        }


    }
}
