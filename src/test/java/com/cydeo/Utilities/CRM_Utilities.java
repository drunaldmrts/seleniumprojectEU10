package com.cydeo.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /*
    This method will log in with helpdesk1@cybertekschool.com user when it is called
     */

    public static void crm_login(WebDriver driver){
        //3. Enter valid username
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement password = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement logIn = driver.findElement(By.xpath("//input[@value='Log In']"));
        logIn.click();

    }
    public static void crm_login(WebDriver driver, String username, String password) {
        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);

    }
}
