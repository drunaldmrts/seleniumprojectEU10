package com.cydeo.tests.day4_findelements;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task4_FindElements {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {

            System.out.println("Test of link: "+each.getText());
            System.out.println("HREF Text: "+ each.getAttribute("href") );
        }


    }
}
