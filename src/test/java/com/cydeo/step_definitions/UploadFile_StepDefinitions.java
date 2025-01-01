package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.UploadFilePage;
import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class UploadFile_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    UploadFilePage uploadFilePage = new UploadFilePage();

    @Given("user logged in to an account")
    public void user_logged_in_to_an_account() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login?clear=1");
        loginPage.username.sendKeys("Employee1");
        loginPage.password.sendKeys("Employee123");
        loginPage.LoginButton.click();
    }
    @Given("user should verify the plus button is displayed")
    public void user_should_verify_the_plus_button_is_displayed() {
        Assert.assertTrue(uploadFilePage.plusBtn.isDisplayed());
    }
    @Then("user should click to plus button")
    public void user_should_click_to_plus_button() {
        uploadFilePage.plusBtn.click();
    }

    @Then("user sees dropdown and confirms required texts are displayed")
    public void userSeesDropdownAndConfirmsRequiredTextsAreDisplayed() {
        Assert.assertTrue(uploadFilePage.uploadFileBtn.isDisplayed());
        Assert.assertTrue(uploadFilePage.newFolderBtn.isDisplayed());
        Assert.assertTrue(uploadFilePage.newTextDocBtn.isDisplayed());
    }


    @Given("user should select a file to upload by clicking to Upload file button")
    public void userShouldSelectAFileToUploadByClickingToUploadFileButton() {
        uploadFilePage.uploadFileBtn.sendKeys("\"C:\\Users\\DT User\\Desktop\\dummyfileee.txt\"");
    }

    @Then("user verifies uploaded file is displayed")
    public void userVerifiesUploadedFileIsDisplayed() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.sleep(2);
        Assert.assertTrue(uploadFilePage.file.isDisplayed());
        Driver.closeDriver();
    }


}
