package com.cydeo.Utilities;

public class BrowserUtilities {

    /*
    This method will accept int (in second) and execute Thread.sleep for given duration
     */
    public void sleep(int second){

        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }
}
