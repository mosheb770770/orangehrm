package pageobjects.orangehrmlive;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TimesheetforTomTomson {

    @FindBy(how = How.XPATH,using = "//button[@class='oxd-icon-button oxd-icon-button--secondary orangehrm-timesheet-icon-comment']")
    public WebElement greenbutton;

    @FindBy(how = How.XPATH,using = "//textarea[@placeholder='Comment here']")
    public WebElement comment;

}
