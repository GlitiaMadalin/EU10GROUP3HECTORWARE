






package com.cydeo.step_definitions;

import com.cydeo.pages.SettingsPageAli;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class SettingsStepDefinitionsAli {
    SettingsPageAli settings= new SettingsPageAli();

    @When("User logs in with valid credential")
    public void user_logs_in_with_valid_credentions() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login");

        settings.username.sendKeys(ConfigurationReader.getProperty("username"));
        settings.password.sendKeys(ConfigurationReader.getProperty("password"));
        settings.LoginButton.click();

    }


    @When("User clicks on Avatar on the rights side of the top")
    public void user_clicks_on_avatar_on_the_rights_side_of_the_top() {
        settings.avatarButton.click();

    }
    @Then("User sees dropdown with Set status,Settings,about,help,Log out inside")
    public void userSeesDropdownWithSetStatusSettingsAboutHelpLogOutInside() {
        settings.SetStatus.isDisplayed();
        settings.SettingsButton.isDisplayed();
        settings.HelpButton.isDisplayed();
    }

    @Then("User Clicks on Settings button")
    public void userClicksOnSettingsButton() {
        settings.SettingsButton.click();
    }


    @When("User enters a valid full name Ali Yerligul")
    public void userEnters() {

        settings.fullName.clear();
        settings.fullName.sendKeys("Ali Yerligul");

    }

    @Then("user sees Ali Yerligul after refreshing")
    public void userSeesExpected()  {
        Driver.getDriver().navigate().refresh();


        Assert.assertEquals("Ali Yerligul",settings.fullName.getAttribute("value"));
    }


    @When("User enters aliyerligulaliyerligulaliyerligul")

    public void aliyerligulaliyerligulaliyerligul() throws InterruptedException {
        settings.fullName.clear();
        settings.fullName.sendKeys("aliyerligulaliyerligulaliyerligul");
        Thread.sleep(8000);
        Driver.getDriver().navigate().refresh();
    }

    @Then("User should not see the entered invalid full name")// case of no error it is a bug
    public void userShouldGetInvalidMessageAsWarning() {
        String notExpectedFullName = "aliyerligulaliyerligulaliyerligul";
        String actualFullName=settings.fullName.getAttribute("value");
        Assert.assertEquals(actualFullName,notExpectedFullName);
    }
}