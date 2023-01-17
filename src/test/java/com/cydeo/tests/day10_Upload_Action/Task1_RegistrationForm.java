package com.cydeo.tests.day10_Upload_Action;

import com.cydeo.Utilities.ConfigurationReader;
import com.cydeo.Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task1_RegistrationForm {

    @Test
    public void registration_form_test() {
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker=new Faker();

        //3. Enter first name
        WebElement inputFirstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement inputLastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement inputUsername=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUsername.sendKeys(faker.name().username().replaceAll(".",""));
        String user=faker.bothify("helpdesk###");
        inputUsername.sendKeys(user);

        //6. Enter email address
        WebElement inputEmail=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user+"@email.com");

        //7. Enter password
        WebElement inputPassword=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.internet().password());
        //inputPassword.sendKeys(faker.bothify("###???#?#?"));

        //8. Enter phone number
        WebElement inputPhone=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));
        //inputPhone.sendKeys(faker.phoneNumber().cellPhone());

        //9. Select a gender from radio buttons
        WebElement inputGender=Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        inputGender.click();

        //10. Enter date of birth
        WebElement inputBirthday=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputBirthday.sendKeys("03/08/1980");

        //11. Select Department/Office
        Select department=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        department.selectByIndex(faker.number().numberBetween(1,9));

        //12. Select Job Title
        Select jobTitle=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,9));

        //13. Select programming language from checkboxes
        WebElement programmingLanguage=Driver.getDriver().findElement(By.xpath("//label[@for='inlineCheckbox2']"));
        programmingLanguage.click();

        //14. Click to sign up button
        WebElement signUpButton=Driver.getDriver().findElement(By.cssSelector("button[id='wooden_spoon']"));
        signUpButton.click();

        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.
        WebElement message=Driver.getDriver().findElement(By.tagName("p"));
        message.isDisplayed();

    }
}
