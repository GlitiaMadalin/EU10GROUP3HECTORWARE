package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPageByMeri;
import com.cydeo.pages.LogoutPageByMeri;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class LogoutByMeri_StepDefinitions {

    LogoutPageByMeri logoutPageByMeri = new LogoutPageByMeri();
    LoginPageByMeri loginPageByMeri = new LoginPageByMeri();

    @Given("User is on home page")
    public void user_is_on_home_page() {
       loginPageByMeri.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }
    @When("user click on Account dropdown button")
    public void user_click_on_account_dropdown_button() {
        logoutPageByMeri.accountBtn.click();
    }
    @When("user clicks on logout action")
    public void user_clicks_on_logout_action() {
       logoutPageByMeri.logoutBtn.click();
    }
    @Then("user go to the login page")
    public void user_go_to_the_login_page() {

        String expectedTitle = "Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
