package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPageByMeri;
import com.cydeo.pages.OnlineStatusPageMagbule;
import com.cydeo.pages.SetStatusPage;
import com.cydeo.utilites.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Set_Status_StepDefinition_Magbule {

    LoginPageByMeri loginPageByMeri = new LoginPageByMeri();

    OnlineStatusPageMagbule onlineStatusPageMagbule = new OnlineStatusPageMagbule();

    SetStatusPage setStatusPage = new SetStatusPage();

    String beforeStatusMessage = "";
    String afterStatusMessage = "";


    /*@Then("user view Set status message at second row of  dropdown menu")
    public void user_view_set_status_message_at_second_row_of_dropdown_menu() {
        String expectedText = "Set status";
        String actualText = onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

        Assert.assertTrue(actualText.equals(expectedText));
    }


     */
    @When("user click to the Set status link text.")
    public void user_click_to_the_set_status_link_text() {
        onlineStatusPageMagbule.SetStatusLinkDropDown.click();
    }

    @Then("user view Online status box.")
    public void user_view_online_status_box() {
        onlineStatusPageMagbule.OnlineStatusBox.isDisplayed();
    }

    @When("User see Online option  at the left top")
    public void user_see_online_option_at_the_left_top() {
        String expectedOnlineOption = "Online";
        String actualOnlineOption = onlineStatusPageMagbule.OnlineOption.getText();
        System.out.println("onlineStatusPageMagbule.OnlineOption.getText() = " + onlineStatusPageMagbule.OnlineOption.getText());


        Assert.assertTrue(actualOnlineOption.equals(expectedOnlineOption));
        onlineStatusPageMagbule.OnlineOption.isDisplayed();

    }

    @When("User see Away option at the right top")
    public void user_see_away_option_at_the_right_top() {
        String expectedOnlineOption = "Away";
        String actualOnlineOption = onlineStatusPageMagbule.AwayOption.getText();


        Assert.assertTrue(actualOnlineOption.equals(expectedOnlineOption));
        onlineStatusPageMagbule.AwayOption.isDisplayed();
    }

    @When("User see Do not disturb Mute all notifications option at the left bottom")
    public void user_see_do_not_disturb_mute_all_notifications_option_at_the_left_bottom() {
        String expectedOnlineOption = "Do not disturb" + "\nMute all notifications";
        String actualOnlineOption = onlineStatusPageMagbule.DoNotDisturbOption.getText();


        Assert.assertEquals(expectedOnlineOption, actualOnlineOption);
        onlineStatusPageMagbule.DoNotDisturbOption.isDisplayed();
    }

    @When("User see Invisible Appear offline option at the right bottom")
    public void user_see_invisible_appear_offline_option_at_the_right_bottom() {
        String expectedOnlineOption = "Invisible" + "\nAppear offline";
        String actualOnlineOption = onlineStatusPageMagbule.Invisible.getText();


        Assert.assertEquals(expectedOnlineOption, actualOnlineOption);
        onlineStatusPageMagbule.Invisible.isDisplayed();
    }

    @Then("verify user see Status message text under Online status options")
    public void verify_user_see_status_message_text_under_online_status_options() {
        String expectedStatusmMsssage = "Status message";
        String actualStatusMessage = setStatusPage.setStatusText.getText();


        Assert.assertTrue(actualStatusMessage.equals(expectedStatusmMsssage));
        setStatusPage.setStatusText.isDisplayed();

    }

    @Then("verify  under the Status message text, user should see the input box with the What's your status?text.")
    public void verify_under_the_status_message_text_user_should_see_the_input_box_with_the_what_s_your_status_text() {
        setStatusPage.inputBox.isDisplayed();
        System.out.println("setStatusPage.inputBox.getText() = " + setStatusPage.inputBox.getText());


        // String expectedInputBoxMessage = "What's your status?";
        // String actualInputBoxMessage =  setStatusPage.inputBox.getText();


        //Assert.assertTrue(setStatusPage.inputBox.getText().contains("What's your status?"));
       // System.out.println("setStatusPage = " + setStatusPage);
    }
        @Then("verify under input box there is In a meeting set status option")
        public void verify_under_input_box_there_is_in_a_meeting_set_status_option() {
            System.out.println("setStatusPage.inAMeeting.getText() = " + setStatusPage.inAMeeting.getText());
            setStatusPage.inAMeeting.isDisplayed();
        }

    @When("user click In a meeting")
    public void user_click_in_a_meeting() {
        setStatusPage.inAMeeting.click();

    }
    @Then("verify user see In a meeting at input box")
    public void verify_user_see_in_a_meeting_at_input_box() {
        System.out.println("setStatusPage.inputBox.getText() = " + setStatusPage.inputBox.getText());
        BrowserUtils.waitFor(3);
        String expectedInput="In a meeting";
        String actualInput=setStatusPage.inputBox.getText();

        Assert.assertTrue(expectedInput.equals(actualInput));

    }

    @Then("verify user se Clear status after text after dropdown menu")
    public void verify_user_se_clear_status_after_text_after_dropdown_menu() {
        System.out.println("setStatusPage.clearStatusAfter.isDisplayed() = " + setStatusPage.clearStatusAfter.isDisplayed());
    }
    @Then("verify after Clear status after text there is input with select option message")
    public void verify_after_clear_status_after_text_there_is_input_with_select_option_message() {
      //  setStatusPage.selectOptionInputBox.isDisplayed();
      //  System.out.println("setStatusPage.selectOptionInputBox.getText() = " + setStatusPage.selectOptionInputBox.getText());
    }


    @When("user click {string}")
    public void user_click(String string) {

        System.out.println("setStatusPage.anhourInAMeeting.getText() = " + setStatusPage.anhourInAMeeting.getText());
       BrowserUtils.waitFor(5);
        setStatusPage.thirtyMinutes.click();


    }
    @Then("verify {string} changed.")
    public void verify_changed(String string) {
       // BrowserUtils.waitFor(5);
     //  System.out.println("setStatusPage.anhourInAMeeting.getText() = " + setStatusPage.anhourInAMeeting.getText());
    }
    @Then("verify user choose from clear after  dropdown menu Today option and it is displayed near In a meeting text")
    public void verify_user_choose_from_clear_after_dropdown_menu_today_option_and_it_is_displayed_near_in_a_meeting_text() {
       setStatusPage.today.click();
//        System.out.println("setStatusPage.anhourInAMeeting.getText() = " + setStatusPage.anhourInAMeeting.getText());
   String expectedText="Today";
   String actualText=setStatusPage.anhourInAMeeting.getText();
        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);



   Assert.assertTrue(expectedText.equals(actualText));
    }


    @When("user click clear status message")
    public void user_click_clear_status_message() {
        setStatusPage.clearStatusMessageBttn.click();

    }
    @Then("verify status message will not change at the profile module dropdown menu")
    public void verify_status_message_will_not_change_at_the_profile_module_dropdown_menu() {
        afterStatusMessage =onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

        System.out.println("beforeStatusMessage = " + beforeStatusMessage);
        System.out.println("afterStatusMessage = " + afterStatusMessage);
        Assert.assertFalse("Status message change test",beforeStatusMessage.equals(afterStatusMessage));
    }

    @When("user click Set status message")
    public void user_click_set_status_message() {
        setStatusPage.setStatusMessageBttn.click();

    }
    @Then("verify status message will be changed at the profile module dropdown menu")
    public void verify_status_message_will_be_changed_at_the_profile_module_dropdown_menu() {
        afterStatusMessage =onlineStatusPageMagbule.SetStatusLinkDropDown.getText();

        System.out.println("beforeStatusMessage = " + beforeStatusMessage);
        System.out.println("afterStatusMessage = " + afterStatusMessage);
        Assert.assertTrue("Status message change test",beforeStatusMessage.equals(afterStatusMessage));

    }

    @Then("verify user can not write on the input box more than {int} char letters and user can't use special char.")
    public void verify_user_can_not_write_on_the_input_box_more_than_char_letters_and_user_can_t_use_special_char(Integer int1) {
        setStatusPage.inputBox.sendKeys("hghgjhgasdfretghyujkilolplkiujhygtresxcvbnmkjuytresawqfghjkloipolkiuytgnkbghjkloiuytrfhhyh");
         }






}
