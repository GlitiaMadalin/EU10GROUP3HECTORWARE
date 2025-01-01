package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.TalkPageByAnda;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Talk_StepDefinitions_Anda {
    LoginPage loginPage = new LoginPage();
    TalkPageByAnda talkPageByAnda = new TalkPageByAnda();


    @Given("login to the hectorware")
    public void login_to_the_hectorware() {
        String urlLink = ConfigurationReader.getProperty("urlLink");
        Driver.getDriver().get(urlLink);
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.LoginButton.click();
    }

    @Given("navigate to talk module")
    public void navigate_to_talk_module() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(talkPageByAnda.Talkbutton).perform();
    }

    @Given("click the talk module")
    public void click_the_talk_module() {
        talkPageByAnda.Talkbutton.click();
    }

    @Then("Click plus sign in order to create a new conversation")
    public void click_plus_sign_in_order_to_create_a_new_conversation() {
        talkPageByAnda.PlusSignButton.click();
    }


    @Given("Click the conversation name box")
    public void click_the_conversation_name_box() {
talkPageByAnda.ConversationNameBox.click();
    }

    @Given("Write a conversation name")
    public void write_a() throws InterruptedException {
       talkPageByAnda.ConversationNameBox.sendKeys("QA Engineers 1#");

       Thread.sleep(3000);
    }



    @And("write an invalid conversation name")
    public void writeAnInvalidConversationName() {
        talkPageByAnda.ConversationNameBox.sendKeys("QA the best group in company");
    }

    @Then("verify that the message-Incorrect conversation length- is appeared in the table")
    public void verifyThatTheMessageIncorrectConversationLengthIsAppearedInTheTable() {

        Assert.assertTrue(talkPageByAnda.ConversationNameModal.getText().contains("Incorrect conversation length"));
    }

    @Then("Click the three dots button in the conversation named Andas Conversation")
    public void clickTheThreeDotsButtonInTheConversationNamed() throws InterruptedException {

talkPageByAnda.ConversationThreeDotsButton.click();
        Thread.sleep(3000);
    }



    @Then("verify that  Delete a conversation option is displayed")
    public void verifyThatDeleteAConversationOptionIsDisplayed() {

Assert.assertTrue(talkPageByAnda.DeleteConversationBox.getText().contains("Delete conversation"));
    }

    @Then("Click delete conversation button")
    public void clickDeleteConversationButton() throws InterruptedException {
        talkPageByAnda.DeleteConversationBox.click();
        Thread.sleep(3000);
    }


    @And("user  click the yes button to confirm that he wants to delete the conversation")
    public void userClickTheYesButtonToConfirmThatHeWantsToDeleteTheConversation() {
        talkPageByAnda.DeleteConversationYesButton.click();

    }

    @Then("verify that the conversation is deleted")
    public void verifyThatTheConversationIsDeleted() {
        Assert.assertFalse(talkPageByAnda.AndasConversationBox.isDisplayed());
    }
}
