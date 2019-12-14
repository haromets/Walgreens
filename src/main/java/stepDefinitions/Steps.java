package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPage;
import org.junit.Assert;

public class Steps {

    public WebDriver driver;
    public LoginPage loginPage;



    @Given("User Launch Chrome browser")
    public void user_Launch_Chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);

    }

    @When("User opens URL {string}")
    public void user_opens_URL(String url) {
        driver.get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_Email_as_and_Password_as(String email, String pwd) {
        loginPage.setUserName(email);
        loginPage.clickSignIn();
        loginPage.setUserPassword(pwd);
    }

    @When("Click on SignIn button")
    public void click_on_SignIn_button() {
        loginPage.clickSignIn();
    }

    @Then("User Page Title should be {string}")
    public void user_Page_Title_should_be(String title) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(title, driver.getTitle());
    }

    @When("User click on Log out link")
    public void user_click_on_Log_out_link() {
        loginPage.clickSignOut();
    }

    @Then("Log out Page Title should be {string}")
    public void log_out_Page_Title_should_be(String title) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(title, driver.getTitle());
    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }
}
