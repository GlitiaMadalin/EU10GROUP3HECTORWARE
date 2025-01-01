package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user navigates to the URL")
    public void user_navigates_to_the_url() {
        String urlLink = ConfigurationReader.getProperty("urlLink");
        Driver.getDriver().get(urlLink);
    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.LoginButton.click();
    }
    @Then("any user should verify the home page")
    public void any_user_should_verify_the_home_page() {
        String expectedTitle = "Files - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }



}
