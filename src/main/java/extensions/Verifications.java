package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import utilities.CommonOps;


public class Verifications extends CommonOps  {

    //receives an element and a string makes a comparison between them//
    public static void veryfiTextElements(WebElement elem,String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Assert.assertEquals(elem.getAttribute("value"), expected);

    }









}
