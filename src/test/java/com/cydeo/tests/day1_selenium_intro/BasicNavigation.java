package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        // this is the line opening empty browser
        WebDriver driver=new ChromeDriver();

        // this line will maximize the page
        driver.manage().window().maximize();
        // driver.manage().window().fullscreen(); this is for mac

        driver.get("https:tesla.com");
        
        // get the title 
        String currenttitle= driver.getTitle();
        System.out.println("currenttitle = " + currenttitle);

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

        // get current URL
        //driver.getCurrentUrl();
        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        // this will close the currently opened window
        // if we have more than one windows, it will only close the one that was focused on
        driver.close();


        // it will kill the session
        // if we have more than one window, everything will be closed
        driver.quit();



    }

    }

