package com.cydeo.tests.day4_findelements;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_2 {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //WebElement homeLink= driver.findElement(By.cssSelector("a[class='nav-link']"));
        //WebElement homeLink= driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink= driver.findElement(By.xpath("//a[@class='nav-link']"));

        //b. “Forgot password” header
        WebElement forgotPassword1= driver.findElement(By.cssSelector("div[class='example']>h2"));
        //WebElement forgotPassword2= driver.findElement(By.cssSelector("div.example>h2"));
        //WebElement forgotPassword3= driver.findElement(By.xpath("//h2[.'Forgot Password']"));
        //WebElement forgotPassword4= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailText1= driver.findElement(By.xpath("//label[@for='email']"));
        //WebElement emailText2= driver.findElement(By.cssSelector("label[for='email']"));

        //d. E-mail input box
        WebElement inputBox= driver.findElement(By.xpath("//input[@name='email']"));
        //WebElement inputBox1= driver.findElement(By.xpath("//input[@name='email']"));
        // tagName[contains(@attribute,'value']
        WebElement inputBox2= driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        //WebElement passwordButton= driver.findElement(By.cssSelector("button#form_submit"));
        WebElement passwordButton1= driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement cydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("passwordButton1.isDisplayed() = " + passwordButton1.isDisplayed());
        System.out.println("cydeoText.isDisplayed() = " + cydeoText.isDisplayed());
    }
}
