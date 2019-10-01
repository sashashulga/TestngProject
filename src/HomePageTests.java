package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTests extends tests.TestBase {

    @Test
    public void homePageVerificationTest() throws InterruptedException {

        // ------ Find list events element ----
        WebElement listEvent
                = driver.findElement(By.id("idtitletypesearchevents"));
        //--Verify that listEvent elements contains 'list events' text
        Assert.assertEquals(listEvent.getText(),"List events",
                "Name of the listEventt element is not 'List evvents'");



//        System.out.println("Home Page Verification:"
//                + listEvent.getText().equals("List events"));
//        //System.out.println(listEvent.getAttribute("class"));

    }

}
