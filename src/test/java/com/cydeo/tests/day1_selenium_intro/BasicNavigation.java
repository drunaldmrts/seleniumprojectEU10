package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https:tesla.com");

        // stop code execution 3 seconds
        Thread.sleep(3000);

        // use selenium to nevigate back
        driver.navigate().back();

        // stop code execution 3 seconds
        Thread.sleep(3000);

        // use selenium to nevigate forward
        driver.navigate().forward();

        // stop code execution 3 seconds
        Thread.sleep(3000);

        // use selenium to nevigate refresh
        driver.navigate().refresh();

        // use nevigate().to() method
        driver.navigate().to("https:www.apple.com");

        // get the title of the page
        //driver.getTitle();
        System.out.println(driver.getTitle());


    }

    }

