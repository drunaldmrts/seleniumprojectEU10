package com.cydeo.tests.day12_PageObjectModel;

import com.cydeo.Utilities.Driver;
import com.cydeo.pages.LibraryLoginPage;
import org.testng.annotations.Test;

public class POM_Practices {

    @Test
    public void require_field_error_message_test(){
        //Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Do not enter any information
        //4- Click to “Sign in” button
        LibraryLoginPage libraryLoginPage=new LibraryLoginPage;

        
        //5- Verify expected error is displayed:

    }
}
