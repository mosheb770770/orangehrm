package sanity;

import extensions.UIAction;
import extensions.Verifications;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

import static utilities.GetData.getData;

public class OrangehrmWeb extends CommonOps  {
    @Test(description = "test01_veryfi_text")
    public void test01(){
        WebFlows.log_in(getData("LoginUser"),getData("LoginPass"));
        UIAction.click(mainmenu.time);
        UIAction.click(timesheetspendingaction.TimesheetPeriod);
        UIAction.click(timesheetfortomtomson.greenbutton);
        Verifications.veryfiTextElements(timesheetfortomtomson.comment,"Leadership Development");}


    @Test(description = "test02_veryfi_Negative_login")
    public void test02(){
        WebFlows.log_in(getData("LoginUser"),getData("LoginPassError"));
        Verifications.veryfiTextElements(login.login_error,"Invalid credentials");}






}
