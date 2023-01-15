package com.cydeo.tests.day8_properties;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_WebTable {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }
    @Test
    public void order_name_verfy_test(){
        //1. Locate Bob's name---> If there are more than one table on the page first locate table than cell
        ////table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']
        WebElement bobName=driver.findElement(By.xpath("//td[.='Bob Martin']"));

        //2. Verify Bob’s name is listed as expected. //Expected: “Bob Martin”
        String expectedBobName="Bob Martin";
        String actualBobName=bobName.getText();

        Assert.assertEquals(actualBobName,expectedBobName);

        //3. Verify Bob Martin’s order date is as expected  //Expected: 12/31/2021
        WebElement bobOrderDate= driver.findElement(By.xpath("//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedOrderDate="12/31/2021";
        String actualOrderDate=bobOrderDate.getText();

        Assert.assertEquals(actualOrderDate,expectedOrderDate);

    }
}
