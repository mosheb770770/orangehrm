package workflows;

import extensions.UIAction;
import io.qameta.allure.Step;
import utilities.CommonOps;


public class WebFlows extends CommonOps {
    @Step("WebFlows_Login")
    public static void log_in(String user,String pass){
        UIAction.sendkeys(login.username,user);
        UIAction.sendkeys(login.password,pass);
        UIAction.click(login.login_button);
    }


    @Step("WebFlows_Logout")
    public static void log_out(){
        UIAction.click(topbar.userdropdown);
        UIAction.click(topbar.Logout_button);
    }



}
