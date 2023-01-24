package utilities;

import org.openqa.selenium.support.PageFactory;
import pageobjects.orangehrmlive.*;

import static utilities.Base.*;

public class ManagePages {
    public static void initlogin(){
        login = PageFactory.initElements(driver, LoginPage.class);
    }
    public static void initmainmenu(){
        mainmenu = PageFactory.initElements(driver, MainMenu.class);
    }

    public static void inittimesheetfortomtomson(){timesheetfortomtomson = PageFactory.initElements(driver, TimesheetforTomTomson.class);}
    public static void inittimesheetspendingaction(){timesheetspendingaction = PageFactory.initElements(driver, TimesheetsPendingAction.class);}

    public static void inittopbar(){topbar = PageFactory.initElements(driver, TopBar.class);}




}
