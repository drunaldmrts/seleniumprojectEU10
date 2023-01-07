package com.cydeo.tests.day5_dynamicWebelements_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task1_StaleElementRefExc {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        WebElement addEleButton= driver.findElement(By.xpath("//button[.='Add Element']"));
        //WebElement addEleButton= driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        //4. Verify “Delete” button is displayed after clicking.
        addEleButton.click();

        //5. Click to “Delete” button.
        WebElement deleteButton= driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        //6. Verify “Delete” button is NOT displayed after clicking.
        deleteButton.click();

        try{
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        } catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("This web element completely is deleted from the page");
            System.out.println("deleteButton.isDisplayed() = false");
        }

        driver.close();
    }
}
