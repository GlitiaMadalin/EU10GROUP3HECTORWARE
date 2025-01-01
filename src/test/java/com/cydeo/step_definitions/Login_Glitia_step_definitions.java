package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.Login_Glitia_pages;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Glitia_step_definitions {


    LoginPage loginPage= new LoginPage();
Login_Glitia_pages loginGlitiaPages= new  Login_Glitia_pages();



    @Given("the user navigates to the URL")
    public void the_user_navigates_to_the_url(){
      String urlLink = ConfigurationReader.getProperty("urlLink");
        Driver.getDriver().get(urlLink);
    }
    @When("Verify login page is displayed")
    public void verify_login_page_is_displayed() {
   //  Assert.assertTrue(loginGlitiaPages.  .....   .isDisplayed());
    }
    @When("Enter invalid Username in username field")
    public void enter_invalid_username_in_username_field() {
      loginGlitiaPages.username.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("Enter valid password in password field")
    public void enter_valid_password_in_password_field() throws InterruptedException {

    loginGlitiaPages.password.sendKeys(ConfigurationReader.getProperty("password"));
    Thread.sleep(2500);
    }
    @When("Click on login button")
    public void click_on_login_button() {
     loginGlitiaPages.lgnBtn.click();
    }
    @Then("Verify the home page")
    public void verify_the_home_page() {
     Assert.assertTrue(loginGlitiaPages.AvatarID.isDisplayed());
        }

}
