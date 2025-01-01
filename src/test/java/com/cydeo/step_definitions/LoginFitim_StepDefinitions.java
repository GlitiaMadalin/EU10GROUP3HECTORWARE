package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage_Fitim;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginFitim_StepDefinitions {

    LoginPage_Fitim loginPage_fitim = new LoginPage_Fitim();
    @Given("user visit Hectorware")
    public void user_visit_hectorware() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlLink"));
    }
    @When("user enters valid username in username box")
    public void user_enters_valid_username_in_username_box() {
    loginPage_fitim.username.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters valid password in password box")
    public void user_enters_valid_password_in_password_box() {
    loginPage_fitim.password.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
    loginPage_fitim.loginBTN.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(loginPage_fitim.avatarID.isDisplayed());
    }
}
