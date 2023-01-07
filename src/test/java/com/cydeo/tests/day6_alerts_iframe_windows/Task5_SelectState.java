package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task5_SelectState {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void stateDropdown(){
        Select stateDropdownOption=new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //Select Illinois
        stateDropdownOption.selectByVisibleText("Illinois");

        //4. Select Virginia
        stateDropdownOption.selectByValue("VA");

        //5. Select California
        stateDropdownOption.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOption="California";
        String actualOption=stateDropdownOption.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption,expectedOption);

        }
    @Test
    public void stateDropdown_task6(){
        //Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown=new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using  : visible text
        yearDropdown.selectByVisibleText("1924");

        //Select month using   : value attribute
        monthDropdown.selectByValue("11");

        //Select day using : index number
        dayDropdown.selectByIndex(0);

        String expectedYear="1924";
        String expectedMonth="December";
        String expectedDay="1";

        String actualYear=yearDropdown.getFirstSelectedOption().getText();
        String actualMonth=monthDropdown.getFirstSelectedOption().getText();
        String actualDay=dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear,expectedYear);
        Assert.assertEquals(actualMonth,expectedMonth);
        Assert.assertEquals(actualDay,expectedDay);

    }
    @AfterMethod
    public void tearDropdown(){
        driver.close();
    }
}
