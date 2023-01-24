package pageobjects.orangehrmlive;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TimesheetsPendingAction {
    @FindBy(how = How.XPATH,using = "(//button[@type='button'][normalize-space()='View'])[2]")
    public WebElement TimesheetPeriod;


}


