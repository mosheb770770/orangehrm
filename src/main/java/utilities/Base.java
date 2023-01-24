package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import pageobjects.orangehrmlive.*;

public class Base {
     protected static WebDriver  driver;

    protected static WebDriverWait wait;

    protected static LoginPage login;

    protected static MainMenu mainmenu;


    protected static TimesheetforTomTomson timesheetfortomtomson;

    protected static TimesheetsPendingAction timesheetspendingaction;

    protected static TopBar topbar;

}
