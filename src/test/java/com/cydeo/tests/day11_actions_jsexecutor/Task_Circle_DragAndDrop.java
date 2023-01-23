package com.cydeo.tests.day11_actions_jsexecutor;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_Circle_DragAndDrop {

    @Test
    public static void dragAndDrop_Test(){

        //Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptCocciesButton=Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCocciesButton.click();
        BrowserUtils.sleep(3);

        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));

        //2. Drag and drop the small circle to bigger circle.
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();
        //actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”

        String actualText=bigCircle.getText();
        String expectedText="You did great!";

        Assert.assertEquals(actualText,expectedText);

        Driver.closeDriver();
    }

}
