package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPageByMeri;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginByMeri_StepDefinition {

    LoginPageByMeri loginPageByMeri = new LoginPageByMeri();
    @Given("User go to the url")
    public void user_go_to_the_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlLink"));
    }
    @When("User enter valid username")
    public void user_enter_valid_username() {
        loginPageByMeri.inputUsername.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("User enter valid password")
    public void user_enter_valid_password() {
        loginPageByMeri.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        loginPageByMeri.loginButton.click();
    }
    @Then("User user should verify home page")
    public void user_user_should_verify_home_page() {
        String expectedTitle = "Files - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
