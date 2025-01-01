package com.cydeo.step_definitions;

import com.cydeo.pages.ContactsPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Contacts_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    ContactsPage contactsPage = new ContactsPage();

    @Given("login to the {string}")
    public void login_to_the(String string) {
        String urlLink = ConfigurationReader.getProperty("urlLink");
        Driver.getDriver().get(urlLink);
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.LoginButton.click();

    }

    @When("Navigate to Contacts module on the left side of the page")
    public void navigate_to_contacts_module_on_the_left_side_of_the_page() {

        contactsPage.contactsButton.click();

    }
    @When("Click New contact button")
    public void click_new_contact_button() {

        contactsPage.newContactButton.click();

    }
    @When("Enter {string} in to Name inbox")
    public void enter_in_to_name_inbox(String name) {

        contactsPage.name.click();
        contactsPage.name.sendKeys(Keys.DELETE + "Cedric Diggory");


    }
    @When("Enter {string} in to Company inbox")
    public void enter_in_to_company_inbox(String string) {

        contactsPage.company.sendKeys("Amazon");

    }
    @When("Enter {string} in to Title inbox")
    public void enter_in_to_title_inbox(String string) {

        contactsPage.title.sendKeys("Mr");

    }
    @When("Click any empty area on the page")
    public void click_any_empty_area_on_the_page() {

        contactsPage.emptyArea.click();

    }
   @Then("Verify new contact is shown in contact list")
    public void verify_new_contact_is_shown_in_contact_list() {

       Assert.assertTrue(contactsPage.contactList.getText().contains("Cedric Diggory"));

    }

    @When("Enter invalid {string} in to Name inbox")
    public void enter_invalid_in_to_name_inbox(String string) {
        contactsPage.name.click();
        contactsPage.name.sendKeys(Keys.DELETE + "Cedric_Diggory123asdfg");

    }
    @When("Enter invalid {string} in to Company inbox")
    public void enter_invalid_in_to_company_inbox(String string) {
        contactsPage.company.sendKeys("!#Amaz12390on@");
    }
    @When("Enter invalid {string} in to Title inbox")
    public void enter_invalid_in_to_title_inbox(String string) {
        contactsPage.title.sendKeys("&*Mr()67940302");
    }
    @Then("Verify Invalid Name, Invalid Company or Invalid Title error message occurs")
    public void verify_invalid_name_invalid_company_or_invalid_title_error_message_occurs() {
Assert.assertTrue(contactsPage.page.getText().contains("Invalid Name, Invalid Company or Invalid Title"));
    }

    @When("click {string}")
    public void click(String string) {
        contactsPage.cedric.click();
    }
    @When("edit {string} with entering valid name")
    public void edit_with_entering_valid_name(String string) {
        contactsPage.contactName.click();
        contactsPage.contactName.sendKeys(Keys.CONTROL, "a");
        contactsPage.contactName.sendKeys("Sirius Black");
    }
    @When("edit {string} with entering valid company")
    public void edit_with_entering_valid_company(String string) {
        contactsPage.contactCom.click();
        contactsPage.contactCom.sendKeys(Keys.CONTROL, "a");
        contactsPage.contactCom.sendKeys("Amazon");
    }
    @When("edit {string} with entering valid title")
    public void edit_with_entering_valid_title(String string)  {
        contactsPage.contactTitle.click();
        contactsPage.contactTitle.sendKeys(Keys.CONTROL, "a");
        contactsPage.contactTitle.sendKeys("Wz");


    }


    @Then("Verify edited contact is shown in contact list")
    public void verify_edited_contact_is_shown_in_contact_list()  {

       Assert.assertTrue(contactsPage.contactList.getText().contains("Sirius Black"));
    }

    @When("edit name with entering invalid name")
    public void edit_name_with_entering_invalid_name() {
        contactsPage.contactName.click();
        contactsPage.contactName.sendKeys(Keys.CONTROL, "a");
        contactsPage.contactName.sendKeys("@#$_Sirius! Bl45890ack");
    }
    @When("edit company with entering invalid company")
    public void edit_company_with_entering_invalid_company() {
        contactsPage.contactCom.click();
        contactsPage.contactCom.sendKeys(Keys.CONTROL, "a");
        contactsPage.contactCom.sendKeys("Ama_?zo//n45346453");
    }
    @When("edit title with entering invalid title")
    public void edit_title_with_entering_invalid_title() {
        contactsPage.contactTitle.click();
        contactsPage.contactTitle.sendKeys(Keys.CONTROL, "a");
        contactsPage.contactTitle.sendKeys("W^&*z!@#<>7842384298");
    }

    @Then("click on edited contact")
    public void click_on_edited_contact() {
       contactsPage.contactName.click();
    }

    @Then("Verify name is shown on detail information page")
    public void verify_name_is_shown_on_detail_information_page() {

        Assert.assertTrue(contactsPage.contactName.isDisplayed());
    }

    @Then("Verify company is shown on detail information page")
    public void verify_company_is_shown_on_detail_information_page() {
        Assert.assertTrue(contactsPage.contactCom.isDisplayed());
    }

    @Then("Verify title is shown on detail information page")
    public void verify_title_is_shown_on_detail_information_page() {
       Assert.assertTrue(contactsPage.contactTitle.isDisplayed());
    }

    @Then("Click on created contact")
    public void click_on_created_contact() {
        contactsPage.createdContact.click();
    }
    @Then("Verify contact's name is shown on detail information page")
    public void verify_contact_s_name_is_shown_on_detail_information_page() {
       Assert.assertTrue(contactsPage.name.isDisplayed());
    }
    @Then("Verify contact's company is shown on detail information page")
    public void verify_contact_s_company_is_shown_on_detail_information_page() {
       Assert.assertTrue(contactsPage.company.isDisplayed());
    }
    @Then("Verify contact's title is shown on detail information page")
    public void verify_contact_s_title_is_shown_on_detail_information_page() {
       Assert.assertTrue(contactsPage.title.isDisplayed());
    }

    @Given("Click on any contact")
    public void click_on_any_contact() {
        contactsPage.createdContact.click();
    }
    @Then("Verify selected contact's  page is opened")
    public void verify_selected_contact_s_page_is_opened() {
       Assert.assertTrue(contactsPage.contactsPage.isDisplayed());
    }
    @Then("Click the three dots on the right side of the page")
    public void click_the_three_dots_on_the_right_side_of_the_page() {
        contactsPage.threeDots.click();
    }

    @Then("Verify three dots button has three options: Download, Generate QR Code and Delete")
    public void verify_three_dots_button_has_three_options_download_generate_qr_code_and_delete() {
    Assert.assertTrue(contactsPage.downloadOption.isDisplayed());
    Assert.assertTrue(contactsPage.generateOption.isDisplayed());

    Assert.assertTrue(contactsPage.deleteOption.isDisplayed());
    }
    @Then("Click Delete")
    public void click_delete() {
       contactsPage.deleteOption.click();
    }

    @Then("Verify No contact selected page is opened")
    public void verifyNoContactSelectedPageIsOpened() {
        Assert.assertTrue(contactsPage.noContactPage.isDisplayed());
    }
   @Then("Verify contact has been removed from the contact list")
    public void verify_contact_has_been_removed_from_the_contact_list() {
       Assert.assertTrue(contactsPage.createdContact.isEnabled());
    }


    






}
