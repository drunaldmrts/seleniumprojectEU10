package com.cydeo.tests.day10_Upload_Action;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_UploadPracrice {
    @Test
    public void upload_test(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //Find a file from the computer and get the path of it.
        String path="C:/Users/Çağlayan Pınar/OneDrive/Masaüstü/HTML Class/CLASSNOTES.docx";

        //Upload the file
        WebElement fileUpload=Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton=Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement fileLoadHeader=Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileLoadHeader.isDisplayed());

    }

}
