package com.cydeo.step_definitions;

import com.cydeo.pages.DeleteFilePage;
import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DeleteFile_StepDefinitions {

    Actions actions = new Actions(Driver.getDriver());
    DeleteFilePage deleteFilePage = new DeleteFilePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3);

    @Given("user should be able to right click to a targeted file")
    public void user_should_be_able_to_right_click_to_a_targeted_file() {
        actions.contextClick(deleteFilePage.file).perform();
    }
    @Given("user should see the dropdown")
    public void user_should_see_the_dropdown() {
        Assert.assertTrue(deleteFilePage.addToFavouritesBtn.isDisplayed());
        Assert.assertTrue(deleteFilePage.detailsBtn.isDisplayed());
        Assert.assertTrue(deleteFilePage.renameBtn.isDisplayed());
        Assert.assertTrue(deleteFilePage.moveOrCopyBtn.isDisplayed());
        Assert.assertTrue(deleteFilePage.downloadBtn.isDisplayed());
        Assert.assertTrue(deleteFilePage.deleteFileBtn.isDisplayed());
    }
    @Given("user should click to delete file button")
    public void user_should_click_to_delete_file_button() {
        deleteFilePage.deleteFileBtn.click();
        //wait.until(ExpectedConditions.invisibilityOf(deleteFilePage.file));
    }
    @And("user should click to Deleted files button")
    public void userShouldClickToDeletedFilesButton() {
        deleteFilePage.trash.click();
        Driver.getDriver().navigate().refresh();
    }


    @Then("user should confirm deleted file is displayed in Deleted files page")
    public void userShouldConfirmDeletedFileIsDisplayedInDeletedFilesPage() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(deleteFilePage.file.isDisplayed());
    }

}
