package pageobjects.orangehrmlive;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopBar {
    @FindBy(how = How.XPATH,using = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    public WebElement userdropdown;

    @FindBy(how = How.XPATH,using = "//a[normalize-space()='Logout']")
    public  WebElement Logout_button;



}
