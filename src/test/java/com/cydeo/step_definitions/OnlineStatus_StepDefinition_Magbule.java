package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.LoginPageByMeri;
import com.cydeo.pages.OnlineStatusPageMagbule;
import com.cydeo.utilites.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnlineStatus_StepDefinition_Magbule {

    LoginPageByMeri loginPageByMeri = new LoginPageByMeri();

    OnlineStatusPageMagbule onlineStatusPageMagbule = new OnlineStatusPageMagbule();

    String beforeOnlineStatus = "";
    String afterOnlineStatus = "";


    @Given("user navigates to the URL {string}")
    public void user_navigates_to_the_url(String string) {

        loginPageByMeri.login("Employee33", "Employee123");

    }

    @When("user click to the avatar")
    public void user_click_to_the_avatar() {

        onlineStatusPageMagbule.avatarButton.click();

    }

    @Then("verify user view Set status message at second row of  dropdown menu")
    public void verify_user_view_set_status_message_at_second_row_of_dropdown_menu() {
        String expectedText = "Set status";
        String actualText = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

        Assert.assertTrue(actualText.equals(expectedText));
    }


    @When("Click to the Set status link text.")
    public void click_to_the_set_status_link_text() throws InterruptedException {

        onlineStatusPageMagbule.SetStatusLinkDropDown.click();
        Thread.sleep(3000);


    }

    @Then("verify user view Online status box.")
    public void verify_user_view_online_status_box() {
        onlineStatusPageMagbule.OnlineStatusBox.isDisplayed();
    }

    @When("User see Online status text.")
    public void user_see_online_status_text() {
        System.out.println("onlineStatusPageMagbule.OnlineStatusText.getText() = " + onlineStatusPageMagbule.OnlineStatusText.getText());
        // Assert.assertTrue(onlineStatusPageMagbule.OnlineStatusBox.getText().contains("Online status"));


    }

    @When("User see Online option need to be at the left top")
    public void user_see_online_option_need_to_be_at_the_left_top() {
        String expectedOnlineOption = "Online";
        String actualOnlineOption = onlineStatusPageMagbule.OnlineOption.getText();


        Assert.assertTrue(actualOnlineOption.equals(expectedOnlineOption));
        onlineStatusPageMagbule.OnlineOption.isDisplayed();
    }

    @When("User see Away option need to be at the right top")
    public void user_see_away_option_need_to_be_at_the_right_top() {
        String expectedOnlineOption = "Away";
        String actualOnlineOption = onlineStatusPageMagbule.AwayOption.getText();


        Assert.assertTrue(actualOnlineOption.equals(expectedOnlineOption));
        onlineStatusPageMagbule.AwayOption.isDisplayed();

    }

    @When("User see Do not disturb Mute all notifications option need to be at the left bottom")
    public void user_see_do_not_disturb_mute_all_notifications_option_need_to_be_at_the_left_bottom() {
        String expectedOnlineOption = "Do not disturb" + "\nMute all notifications";
        String actualOnlineOption = onlineStatusPageMagbule.DoNotDisturbOption.getText();


        Assert.assertEquals(expectedOnlineOption, actualOnlineOption);
        onlineStatusPageMagbule.DoNotDisturbOption.isDisplayed();
    }

    @When("User see Invisible Appear offline option need to be at the right bottom")
    public void user_see_invisible_appear_offline_option_need_to_be_at_the_right_bottom() {
        String expectedOnlineOption = "Invisible" + "\nAppear offline";
        String actualOnlineOption = onlineStatusPageMagbule.Invisible.getText();


        Assert.assertEquals(expectedOnlineOption, actualOnlineOption);
        onlineStatusPageMagbule.Invisible.isDisplayed();
    }


    @Then("verify user click the Online option.")
    public void verify_user_click_the_online_option() {
        BrowserUtils.waitFor(2);
        onlineStatusPageMagbule.OnlineOption.click();


    }

    @Then("verify user click the Away option.")
    public void verify_user_click_the_away_option() {
        onlineStatusPageMagbule.AwayOption.click();
        BrowserUtils.waitFor(2);
    }

    @Then("verify user click the Do not disturb option.")
    public void verify_user_click_the_do_not_disturb_option() {
        onlineStatusPageMagbule.DoNotDisturbOption.click();
        BrowserUtils.waitFor(2);

    }

    @Then("verify user click the Invisible option.")
    public void verify_user_click_the_invisible_option() {
        onlineStatusPageMagbule.Invisible.click();
        BrowserUtils.waitFor(2);

    }


    @Then("verify user see Online text under drop down menu")
    public void verify_user_see_online_text_under_drop_down_menu() {
        BrowserUtils.waitFor(2);

        onlineStatusPageMagbule.AnySpaceOnPage.click();
        String expectedText = "Online";
        String actualText = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();
        System.out.println("actualText = " + actualText);

        Assert.assertTrue(actualText.equals(expectedText));


    }

    @Then("verify user see Away text under drop down menu")
    public void verify_user_see_away_text_under_drop_down_menu() {

        onlineStatusPageMagbule.AnySpaceOnPage.click();


        String expectedText = "Away";
        String actualText = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

        Assert.assertTrue(actualText.equals(expectedText));
    }

    @Then("verify user see Do not disturb text under drop down menu")
    public void verify_user_see_do_not_disturb_text_under_drop_down_menu() {
        onlineStatusPageMagbule.AnySpaceOnPage.click();


        String expectedText = "Do not disturb";
        String actualText = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

        Assert.assertTrue(actualText.equals(expectedText));
    }


    @Then("verify user see Invisible text under drop down menu")
    public void verify_user_see_invisible_text_under_drop_down_menu() {
        onlineStatusPageMagbule.AnySpaceOnPage.click();


        String expectedText = "Invisible";
        String actualText = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

        Assert.assertTrue(actualText.equals(expectedText));
    }

    @Then("user should see Online status")
    public void user_should_see_online_status() {
        // onlineStatusPageMagbule.SetStatusLinkDropDown.isDisplayed();

        System.out.println("beforeOnlineStatus = " + beforeOnlineStatus);

        Assert.assertTrue(onlineStatusPageMagbule.SetStatusLinkDropDown.isDisplayed());
        beforeOnlineStatus = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

    }

    @When("user click on Online status")
    public void user_click_on_online_status() {
        onlineStatusPageMagbule.SetStatusLinkDropDown.click();
        beforeOnlineStatus = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();
        System.out.println("beforeOnlineStatus = " + beforeOnlineStatus);


    }

    @When("user click on Away option")
    public void user_click_on_Away_option() {
        onlineStatusPageMagbule.AwayOption.click();


    }

    @Then("user should see Online status is changed")
    public void user_should_see_online_status_is_changed() {
        onlineStatusPageMagbule.AnySpaceOnPage.click();
        BrowserUtils.waitFor(2);

        BrowserUtils.clickWithJS(onlineStatusPageMagbule.avatarButton);
        afterOnlineStatus = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

        System.out.println("beforeOnlineStatus = " + beforeOnlineStatus);
        System.out.println("afterOnlineStatus = " + afterOnlineStatus);

        Assert.assertTrue("Online status change test",!(beforeOnlineStatus.equals(afterOnlineStatus)));
        //Assert.assertFalse("Online status change test",beforeOnlineStatus.equals(afterOnlineStatus));



        //onlineStatusPageMagbule.SetStatusLinkDropDown.isDisplayed();


    }
/*
    @Then("user click on <currentStatus>")
    public void user_click_on_current_status() {
       onlineStatusPageMagbule.SetStatusLinkDropDown.click();

    }
    @Then("user click on <afterStatus> option")
    public void user_click_on_after_status_option() {
        onlineStatusPageMagbule.OnlineOption.click();

    }
    */



    /*@Then("verify user should see <currentStatus> is changed")
    public void verify_user_should_see_current_status_is_changed() {
        Assert.assertFalse("Online status change test",beforeOnlineStatus.equals(afterOnlineStatus));
        System.out.println("beforeOnlineStatus = " + beforeOnlineStatus);
        System.out.println("afterOnlineStatus = " + afterOnlineStatus);
    }

     */


    @Then("verify user click <afterStatus>the option.")
    public void verify_user_click_after_status_the_option() {
        onlineStatusPageMagbule.AwayOption.click();
    }
    @Then("verify user should see <currentStatus> is changed")
    public void verify_user_should_see_current_status_is_changed(io.cucumber.datatable.DataTable dataTable) {

        /*List<String> expectedStatusOptions = new ArrayList<>(Arrays.asList("Set status",
                "Online","Away","Do not disturb",
                "Invisible"));

        List<String> actualStatusOption = new ArrayList<>();
        Select status = new Select(onlineStatusPageMagbule.SetStatusLinkDropDown);
        for (WebElement eachOption : status.getOptions()) {
            actualStatusOption.add(eachOption.getText());
        }
        System.out.println(expectedStatusOptions);
        System.out.println(actualStatusOption);

         */
        onlineStatusPageMagbule.AnySpaceOnPage.click();
        BrowserUtils.waitFor(2);

        BrowserUtils.clickWithJS(onlineStatusPageMagbule.avatarButton);
        afterOnlineStatus = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

        System.out.println("beforeOnlineStatus = " + beforeOnlineStatus);
        System.out.println("afterOnlineStatus = " + afterOnlineStatus);
        Assert.assertFalse("Online status change test",beforeOnlineStatus.equals(afterOnlineStatus));
    }
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }




