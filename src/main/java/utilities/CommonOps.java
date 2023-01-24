package utilities;

import org.sikuli.script.Screen;
import org.testng.annotations.*;
import workflows.WebFlows;
import java.io.IOException;
import java.lang.reflect.Method;
import static utilities.GetData.getData;
import static utilities.InitBrowser.initBrowser;

public class CommonOps extends Base {


    @BeforeClass
    public  void startSession() throws IOException {
        initBrowser(getData("BrowserType"));
    }
   @AfterMethod
    public void logout(){
            WebFlows.log_out();
    }

    @AfterClass
    public void closeSession() throws IOException {
            driver.close();

    }


}
