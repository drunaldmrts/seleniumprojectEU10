package com.cydeo.tests.day2_locators_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_LibraryLoginPage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https:library2.cybertekschool.com/login.html");

        // Enter username
        WebElement usernameInput= driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

        // Enter password
        WebElement passwordInput= driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        // Click to sign in button
        WebElement signIn= driver.findElement(By.tagName("button"));
        signIn.click();

        // Verify visualisation "Sorry, Wrong Email or Password"




    }
}
