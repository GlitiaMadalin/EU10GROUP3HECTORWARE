package com.cydeo.step_definitions;

import com.cydeo.pages.DeleteFilePage;
import com.cydeo.pages.MoveOrCopyFilePage;
import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class MoveOrCopyFile_StepDefinitions {

    // Created an object of delete file page to use the Assertion methods for a dropdown since they are the same btns.
    DeleteFilePage deleteFilePage = new DeleteFilePage();
    MoveOrCopyFilePage moveOrCopyFilePage = new MoveOrCopyFilePage();
    Actions actions = new Actions(Driver.getDriver());



    @When("user right clicks to a targeted file")
    public void user_right_clicks_to_a_targeted_file() {
        actions.contextClick(moveOrCopyFilePage.file).perform();
    }
    @When("user sees a dropdown")
    public void user_sees_a_dropdown() {
        Assert.assertTrue(deleteFilePage.addToFavouritesBtn.isDisplayed());
        Assert.assertTrue(deleteFilePage.detailsBtn.isDisplayed());
        Assert.assertTrue(deleteFilePage.renameBtn.isDisplayed());
        Assert.assertTrue(deleteFilePage.moveOrCopyBtn.isDisplayed());
        Assert.assertTrue(deleteFilePage.downloadBtn.isDisplayed());
        Assert.assertTrue(deleteFilePage.deleteFileBtn.isDisplayed());
    }
    @When("user clicks to Move or copy button")
    public void user_clicks_to_move_or_copy_button() {
        moveOrCopyFilePage.moveOrCopyButton.click();
    }
    @When("user sees target folders are displayed")
    public void user_sees_target_folders_are_displayed() {
        Assert.assertTrue(moveOrCopyFilePage.targetFolderText.isDisplayed());
    }
    @When("user clicks to desired target folder")
    public void user_clicks_to_desired_target_folder() {
        moveOrCopyFilePage.targetFolder.click();
    }
    @When("user sees two options on the right bottom of the segment Copy to {string} Move to {string}")
    public void user_sees_two_options_on_the_right_bottom_of_the_segment_copy_to_move_to(String copy, String move) {
        Assert.assertTrue(moveOrCopyFilePage.copyToBtn.isDisplayed());
        Assert.assertTrue(moveOrCopyFilePage.moveToBtn.isDisplayed());
    }
    @When("user clicks to Copy to {string} button")
    public void user_clicks_to_copy_to_button(String copy) {
        moveOrCopyFilePage.copyToBtn.click();
    }
    @Then("user confirms file is copied to folder")
    public void user_confirms_file_is_copied_to_folder() {
        BrowserUtils.sleep(2);
        moveOrCopyFilePage.notesUI.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(moveOrCopyFilePage.file.isDisplayed());
    }


    @And("user clicks to Move to {string} button")
    public void userClicksToMoveToButton(String move) {
        moveOrCopyFilePage.moveToBtn.click();
    }

    @Then("user confirms file has moved to folder")
    public void userConfirmsFileHasMovedToFolder() {
        BrowserUtils.sleep(2);
        moveOrCopyFilePage.notesUI.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(moveOrCopyFilePage.file.isDisplayed());
    }

    @And("user confirms file is displayed")
    public void userConfirmsFileIsDisplayed() {
        moveOrCopyFilePage.notesUI.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(moveOrCopyFilePage.file.isDisplayed());
    }


    @And("user clicks to Home button that is displayed on top left")
    public void userClicksToHomeButtonThatIsDisplayedOnTopLeft() {
        moveOrCopyFilePage.homeBtn.click();
    }

    @Then("user clicks to move button that is displayed on right bottom corner")
    public void userClicksToMoveButtonThatIsDisplayedOnRightBottomCorner() {
        moveOrCopyFilePage.moveBtn.click();
    }

    @Then("user confirms file is displayed on the All files page")
    public void userConfirmsFileIsDisplayedOnTheAllFilesPage() {
        Assert.assertTrue(moveOrCopyFilePage.file.isDisplayed());
    }
}
