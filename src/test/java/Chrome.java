import com.google.common.base.Preconditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 23.08.2017.
 */
public class Chrome {
    WebDriver driver;

    @BeforeTest
    protected void startChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
//        options.addArguments("--kiosk");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    void AfterM(ITestResult testResult){
        System.out.println(testResult.getMethod().getDescription());
        System.out.println(testResult.isSuccess());
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
