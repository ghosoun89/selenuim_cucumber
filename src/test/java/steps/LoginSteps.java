package steps;

import com.base.Base;
import com.pages.HomePage;
import com.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class LoginSteps extends Base {
    LoginPage loginPage;
    HomePage homePage;

    @Given("User open the website and go to login page")
    public void user_open_the_website_and_go_to_login_page() {
        launchBrowser();
    }

    @When("User fill email as {string} and password as {string} and click on login")
    public void user_fill_email_and_password_and_click_on_login(String userName, String password) {
        loginPage = new LoginPage();
        homePage = loginPage.performLogin(userName, password);
    }

    @Then("Error message should appear")
    public void error_message_should_appear() {
        Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());
    }

    @Then("User should navigate to home page")
    public void user_should_navigate_to_home_page() {
    homePage.isLogoDisplayed();
    }

}
