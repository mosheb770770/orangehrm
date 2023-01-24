package pageobjects.orangehrmlive;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;


public class LoginPage extends CommonOps {
    @FindBy(how = How.XPATH,using = "//input[@name='username']")
    public  WebElement username;

    @FindBy(how = How.XPATH,using = "//input[@name='password']")
    public  WebElement password;
    @FindBy(how = How.XPATH,using = "//button[@type='submit']")
    public WebElement login_button;

    @FindBy(how = How.XPATH,using = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    public WebElement login_error;


}
