package com.cydeo.tests.day2_locators_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Cydeo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        // driver.get("https://practice.cydeo.com");
        driver.navigate().to("https://practice.cydeo.com");


        String expectedURL="cydeo";
        String actualURL= driver.getCurrentUrl();

        if(expectedURL.contains(actualURL)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED!");
        }

        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED!");
        }






    }
}
