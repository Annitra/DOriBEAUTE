package Features;

import Tools.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 23.08.2017.
 */
public class SignUp extends Tools {

    public SignUp(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private String url = "http://dori.basheg.org.ua/sign-up/";
    private String name = "FirstName";
    private String surname = "LastName";
    public String eMail = "anuta____07.05@gmail.com";
    private String pass="password";

    @FindBy(id = "reg_billing_first_name")
    private WebElement firstName;

    @FindBy(id = "reg_billing_last_name")
    private WebElement lastName;

    @FindBy(id = "reg_email")
    private WebElement email;

    @FindBy(id = "reg_password")
    private WebElement password;
    @FindBy(id = "reg_password2")
    private WebElement confpassword;
//    @FindBy(css = "div[class='recaptcha-checkbox-checkmark']")
//    private WebElement checkBox;


//    @FindBy(css = "button[type='submit']")
//    private WebElement button;

    public  void personalInfo(){
        driver.navigate().to(url);
        firstName.sendKeys(name);
        lastName.sendKeys(surname);
        email.sendKeys(eMail);
        sleep(5);
    }

    public void loginInfo(){
        password.sendKeys(pass);
        confpassword.sendKeys(pass);

       //button.click();
    }

    public boolean isButton(){

        try {
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            return true;
        }
        catch (org.openqa.selenium.ElementNotVisibleException e ) {
            return false; }

    }

}
