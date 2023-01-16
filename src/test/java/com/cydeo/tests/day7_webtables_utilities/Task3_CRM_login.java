package com.cydeo.tests.day7_webtables_utilities;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.CRM_Utilities;
import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task3_CRM_login extends TestBase {


    @Test
    public void crm_login_test() {
        //Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        username.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement password = driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement logIn = driver.findElement(By.xpath("//input[@value='Log In']"));
        logIn.click();

        //6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver, "Portal");
        //Expected: Portal
    }

    @Test
    public void crm_login_test_2() {
        //Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);

        //6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver, "Portal");
        //Expected: Portal


    }
}

