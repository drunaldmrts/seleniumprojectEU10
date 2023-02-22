package com.cydeo.tests.day13_review_practices;

import com.cydeo.Utilities.Driver;
import org.testng.annotations.Test;

public class DoubleClick {

    @Test
    public void double_click_test(){
        //Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2. Switch to iframe.
        //3. Double click on the text “Double-click me to change my text color.”
        //4. Assert: Text’s “style” attribute value contains “red”.



    }
}
