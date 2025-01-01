package com.cydeo.step_definitions;

import com.cydeo.pages.GlitiaOnlineStatusPage2;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class GlitiaOnlineStatusPage_step_definitions2 {

    // LoginPage loginPage = new LoginPage();

    GlitiaOnlineStatusPage2 glitiaOnlineStatusPage2 = new GlitiaOnlineStatusPage2();


    //-1---------------------------------------

    @Given("user navigates to the URL HECTORWARE-QA")
    public void user_navigates_to_the_url_hectorware_qa() {

        Driver.getDriver().get(ConfigurationReader.getProperty("urlLink"));
    }

    @When("user verifies login page is displayed")
    public void user_verifies_login_page_is_displayed() {
        System.out.println("User verifies login page is displayed");

    }

   @And("user enters valid username ")
   public void userEntersValidUsername() {

       glitiaOnlineStatusPage2.inUsername.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @And("user enter valid password")
    public void userEnterValidPassword() {
        glitiaOnlineStatusPage2.inPassword.sendKeys(ConfigurationReader.getProperty("password"));

    }

   @And("user clicks on login buttonn")
   public void userClicksOnLoginButtonn() {
    glitiaOnlineStatusPage2.loginButton.click();
   }

    @When("user hover the profile name")
    public void user_hover_the_profile_name() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(glitiaOnlineStatusPage2.avatarButton).perform();
    }


    @When("user click on profile name")
    public void user_click_on_profile_name() throws InterruptedException {
     glitiaOnlineStatusPage2.avatarButton.click();
     Thread.sleep(3000);
    }

    @Then("user verifies to see profile name and Status menu")
    public void user_verifies_to_see_profile_name_and_status_menu() {

    }


    //2- --------------------------------------------------------


    @When("user Click on Online option")
    public void user_click_on_online_option() throws InterruptedException {
        glitiaOnlineStatusPage2.SetStatusLinkDropDown.click();
       // Thread.sleep(3000);
    }



    @And("user click Set status messages")
    public void userClickSetStatusMessages() throws InterruptedException {
        glitiaOnlineStatusPage2.OnlineStatusBox.isDisplayed();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Is ok!");
        }

    }


    @Then("user verifies to see status is changed Online.")
    public void userVerifiesToSeeStatusIsChangedOnline() throws InterruptedException {
        String expectedOnlineStatusText = "Online";

        String actualOnlineStatusText = glitiaOnlineStatusPage2.OnlineTxt.getText();



        glitiaOnlineStatusPage2.OnlineTxt.isDisplayed();

    }

    //3. ------------------------------------------------


    @When("user click on Status menu")
    public void user_click_on_status_menu() {
    glitiaOnlineStatusPage2.SetStatusLinkDropDown.click();
    }


    @When("user verifies to see  status  with  input box")
    public void user_verifies_to_see_status_with_input_box() {

    }

    @When("user verifies to see all the {int} options")
    public void user_verifies_to_see_all_the_options(Integer int1) {

        String expectedOnlineOpt1 ="Online";
        String actualOnlineOpt1 = glitiaOnlineStatusPage2.OnlineTxt.getText();

        Assert.assertTrue(expectedOnlineOpt1.equals(actualOnlineOpt1));
        glitiaOnlineStatusPage2.OnlineTxt.isDisplayed();


    }

    @When("user verifies to see Clear status message and Set status message tabs")
    public void user_verifies_to_see_clear_status_message_and_set_status_message_tabs() {
      String expectedOnlineStatusText = "Online status";
      String actualOnlineStatus = glitiaOnlineStatusPage2.OnlineTxt.getText();
    }

    @When("user enter a text in input box")
    public void user_enter_a_text_in_input_box() {

    }

    @And("user Click on Set status messages")
    public void userClickOnSetStatusMessages() {

    }

    @When("user verify if is displayed")
    public void user_verify_if_is_displayed() {
/*
        String expectedOnlineTxt = "Online status";
        String actualOnlineTxt = GlitiaOnlineStatusPage2.Ost.getText();

   Assert.assertTrue(actualOnlineTxt.equals(actualOnlineTxt));
  GlitiaOnlineStatusPage2.Ost.isDisplayed();

*/
    }
    @When("user lick one of the {int} options")
    public void user_lick_one_of_the_options(Integer int1) {

    }

    @When("user click on Clear status message")
    public void user_click_on_clear_status_message() {

    }

    @Then("can user verify to see Status is changed")
    public void can_user_verify_to_see_status_is_changed() {


    }


    @And("user click on Set status message")
    public void userClickOnSetStatusMessage() {
    }

    @And("user click on status menu")
    public void userClickOnStatusMenu() {

    }





}