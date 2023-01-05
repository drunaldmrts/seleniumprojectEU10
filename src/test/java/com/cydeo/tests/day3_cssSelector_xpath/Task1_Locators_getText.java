package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_Locators_getText {

    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver= new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        //Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Enter incorrect username: “incorrect”
        WebElement username= driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement password= driver.findElement(By.name("USER_PASSWORD"));
        username.sendKeys("incorrect");

        //5- Click to login button.
        WebElement login= driver.findElement(By.className("login-btn"));
        login.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage= driver.findElement(By.className("errortext"));
        String expectedErrorMessage="Incorrect login or password";
        String actualErrorMessage=errorMessage.getText();

        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED!!!");
        }

        driver.close();

    }
}
