package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(id = "user-name")
    @CacheLookup
    WebElement userName;

    @FindBy(id = "user_password")
    @CacheLookup
    WebElement userPassword;

    @FindBy(id = "submit_btn")
    @CacheLookup
    WebElement signInBtn;

    @FindBy(xpath = "//span[text()='Hi, Jhon']")
    @CacheLookup
    WebElement userNameBtn;

    @FindBy(xpath = "//strong[text()='Sign out']")
    @CacheLookup
    WebElement signOutBtn;

    public void setUserName(String uName){
        userName.clear();
        userName.sendKeys(uName);
    }

    public void setUserPassword (String pwd){
        userPassword.clear();
        userPassword.sendKeys(pwd);
    }

    public void clickSignIn(){
        signInBtn.click();

    }

    public void clickSignOut(){
        userNameBtn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        signOutBtn.click();

    }

}
