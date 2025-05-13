package TestExecution;

import BrowserFactory.ChromeDriverManager;
import Pages.Homepage;
import Pages.Resultpage;
import org.testng.annotations.Test;

public class TestCase_1 extends ChromeDriverManager {

    @Test
    public void Entervalueandcheckoutput() throws InterruptedException {
        Homepage homepage = new Homepage(getDriver());// pass initialized driver
        Resultpage resultpage = new Resultpage(getDriver());
        homepage.EnterInputandSubmit("abcabcbb");
        resultpage.VerifyResult();
    }

}
