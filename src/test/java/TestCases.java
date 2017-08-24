import Features.SignUp;
import org.openqa.selenium.ElementNotVisibleException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by User on 23.08.2017.
 */
public class TestCases  extends Chrome{

    @Test(description = "Try sign up without CAPTCHA")
    public void withoutCaptcha(){
        SignUp signUp = new SignUp(driver);
        signUp.personalInfo();
        signUp.loginInfo();
        Assert.assertFalse(signUp.isButton());
    }
}
