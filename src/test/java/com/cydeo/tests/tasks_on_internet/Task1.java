package com.cydeo.tests.tasks_on_internet;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationexercise.com");
    }

    @Test
    public void task1(){
        WebElement loginButton=driver.findElement(By.xpath("//a[@href='/login']"));
        loginButton.click();

        WebElement newUser= driver.findElement(By.xpath("//h2[.='New User Signup!']"));
        String expectedNewUser="New User Signup!";
        String actualNewUser= newUser.getText();

        Assert.assertEquals(actualNewUser,expectedNewUser);

        WebElement name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
        name.sendKeys("Unal");

        WebElement email= driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        email.sendKeys("drunalde@gmail.com");

        WebElement signUpButton= driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        signUpButton.click();

        WebElement loginText= driver.findElement(By.tagName("b"));

        String actualLoginText=loginText.getText();

        System.out.println(loginText.isDisplayed());

        clickAndVerifyRadioButton(driver,"title","id_gender1");
        clickAndVerifyRadioButton(driver,"title","id_gender2");

        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("abc123");

        Select dayDropdown=new Select(driver.findElement(By.xpath("//select[@id='days']")));
        Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@id='uniform-months')]")));
        Select yearDropdown=new Select(driver.findElement(By.xpath("//select[@id='uniform-years']")));

        dayDropdown.selectByValue("26");
        monthDropdown.selectByVisibleText("June");
        yearDropdown.selectByValue("1979");

        WebElement signText= driver.findElement(By.xpath("//label[.='Sign up for our newsletter!']"));
        signText.isSelected();

        WebElement otherText= driver.findElement(By.xpath("//laber[@for='optin']"));
        otherText.isSelected();

        WebElement firstName= driver.findElement(By.id("first_name"));
        firstName.sendKeys("Unal");

        WebElement lastName= driver.findElement(By.id("last_name"));
        lastName.sendKeys("Demir");

        WebElement company=driver.findElement(By.id("company"));
        company.sendKeys("Cydeo");

        WebElement address1= driver.findElement(By.id("address1"));
        address1.sendKeys("Main Street");

        Select countryDropdown= new Select(driver.findElement(By.name("country")));
        countryDropdown.selectByIndex(3);

        WebElement state=driver.findElement(By.id("state"));
        state.sendKeys("Arizona");

        WebElement city=driver.findElement(By.id("city"));
        city.sendKeys("Ariby");

        WebElement zipcode=driver.findElement(By.id("zipcode"));
        zipcode.sendKeys("AR123Q");

        WebElement mobileNumber=driver.findElement(By.id("mobile_number"));
        mobileNumber.sendKeys("04567 89743");

        WebElement createAccount=driver.findElement(By.xpath("//button[@data-qa='create-account']"));
        createAccount.click();
    }
    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){

        List<WebElement> radioButtons=driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButtons) {
            String eachId= each.getAttribute("id");

            if(eachId.equals(idValue)){
                each.click();
                break;
            }

        }


    }






}
