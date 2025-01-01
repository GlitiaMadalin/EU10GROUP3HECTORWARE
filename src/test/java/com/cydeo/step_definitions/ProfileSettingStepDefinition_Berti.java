package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.ProfileSettingsPageBerti;
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
import java.util.Objects;

public class ProfileSettingStepDefinition_Berti {
    ProfileSettingsPageBerti profileSettingsPageBerti = new ProfileSettingsPageBerti();
    LoginPage loginPage = new LoginPage();

    @Given("that you are in hectorWare")
    public void that_you_are_in_hector_ware() {
        loginPage.logIn();
        BrowserUtils.waitForPageToLoad(10);
    }

    //Language dropdown verification
    //Language dropdown verification
    @When("you click profile module")
    public void you_click_profile_module() {
        profileSettingsPageBerti.goToProfileModule();
    }

    @When("when you click setting under profile module")
    public void when_you_click_setting_under_profile_module() {
        profileSettingsPageBerti.settings.click();
    }

    @Then("you should see all the options of dropdown")
    public void you_should_see_all_the_options_of_dropdown() {
        List<String> expectedLanguageOptions = new ArrayList<>(Arrays.asList("English (US)", "English (US)", "Español (España)", "Français", "Deutsch (Persönlich: Du)",
                "Deutsch (Förmlich: Sie)", "Japanese (日本語)", "Русский", "Nederlands", "Italiano", "Português Brasileiro", "Português", "Dansk", "Svenska", "Türkçe",
                "简体中文", "한국어", "Afrikaans", "Asturianu", "Bahasa Indonesia", "Brezhoneg", "Català", "Eesti", "English (British English)", "Español (Argentina)",
                "Español (Chile)", "Español (Colombia)", "Español (Costa Rica)", "Español (Dominican Republic)", "Español (Ecuador)", "Español (El Salvador)", "Español (Guatemala)",
                "Español (Honduras)", "Español (Latin America)", "Español (México)", "Español (Nicaragua)", "Español (Panama)", "Español (Paraguay)", "Español (Peru)",
                "Español (Puerto Rico)", "Español (Uruguay)", "Esperanto", "Euskara", "Galego", "Latviešu", "Lietuvių", "Magyar", "Norsk bokmål", "Polski", "Română",
                "Shqip", "Slovenčina", "Slovenščina", "Tiếng Việt", "suomi", "Íslenska", "čeština", "Ελληνικά", "Български", "Македонски", "Српски", "Українська",
                "עברית", "فارسى", "ქართული", "正體中文（臺灣）", "hr"));
        List<String> actualLanguageOptions = new ArrayList<>();
        Select language = new Select(profileSettingsPageBerti.languageDropDown);
        for (WebElement eachOption : language.getOptions()) {
            actualLanguageOptions.add(eachOption.getText());
        }
        System.out.println(expectedLanguageOptions);
        System.out.println(actualLanguageOptions);
        Assert.assertEquals(actualLanguageOptions, expectedLanguageOptions);
    }

    //      #Full name verification
    //      #Full name verification
    @When("you write {string} input on the full name field")
    public void you_write_input_on_the_full_name_field(String string) {
        BrowserUtils.waitForPageToLoad(10);
        profileSettingsPageBerti.fullName.clear();
        profileSettingsPageBerti.fullName.sendKeys(string);
        profileSettingsPageBerti.phoneNumber.click();
        BrowserUtils.waitFor(3);
    }

    @Then("you should see the {string} on the full name")
    public void you_should_see_the_on_the_full_name(String expected) {
        profileSettingsPageBerti.getBackAndForwardIntoProfileModule();
        BrowserUtils.waitForPageToLoad(10);
        String actualFullName = profileSettingsPageBerti.fullName.getAttribute("value");
        Assert.assertEquals(actualFullName, expected);
    }

    @Given("that you are in profile module information")
    public void thatYouAreInProfileModuleInformation() {
        profileSettingsPageBerti.goToProfileModule();
    }

    //      #EMAIL VERIFICATION
    //      #EMAIL VERIFICATION

    @When("going form email to dashboard and again to profile module")
    public String going_from_email_to_dashboard_and_again_to_profile_module() {
        profileSettingsPageBerti.getBackAndForwardIntoProfileModule();
        BrowserUtils.waitForPageToLoad(10);
        return profileSettingsPageBerti.email.getAttribute("value");
    }

    @When("you write {string} input on email field")
    public void you_write_input_on_email_field(String string) {
        BrowserUtils.waitForPageToLoad(10);
        profileSettingsPageBerti.email.clear();
        profileSettingsPageBerti.email.sendKeys(string);
        profileSettingsPageBerti.phoneNumber.click();
        BrowserUtils.waitFor(3);
    }

    @Then("you should see the {string} on the email field")
    public void you_should_see_the_on_the_email_field(String expected) {
        Assert.assertEquals(going_from_email_to_dashboard_and_again_to_profile_module(), expected);
    }


    @Then("you should not see the {string} on the email field")
    public void you_should_not_see_the_on_the_email_field(String expected) {
        Assert.assertEquals(going_from_email_to_dashboard_and_again_to_profile_module(), expected);
    }

    //      #Phone number VERIFICATION
    //      #Phone number VERIFICATION

    @When("going form phone number to dashboard and again to profile module")
    public String going_from_phone_number_to_dashboard_and_again_to_profile_module() {
        profileSettingsPageBerti.getBackAndForwardIntoProfileModule();
        BrowserUtils.waitForPageToLoad(10);
        return profileSettingsPageBerti.phoneNumber.getAttribute("value");

    }

    @When("you write {string} input on phone number field")
    public void you_write_input_on_phone_number_field(String string) {
        BrowserUtils.waitForPageToLoad(10);
        profileSettingsPageBerti.phoneNumber.clear();
        profileSettingsPageBerti.phoneNumber.sendKeys(string);
        profileSettingsPageBerti.email.click();
        BrowserUtils.waitFor(3);
    }

    @Then("you should see the {string} on the phone number field")
    public void you_should_see_the_on_the_phone_number_field(String expected) {
        Assert.assertEquals(going_from_phone_number_to_dashboard_and_again_to_profile_module(), expected);
    }

    @Then("you should not see the {string} on the phone number field")
    public void you_should_not_see_the_on_the_phone_number_field(String expected) {
        Assert.assertTrue(!Objects.equals(going_from_phone_number_to_dashboard_and_again_to_profile_module(), expected));
    }

    //      #Address VERIFICATION
    //      #Address VERIFICATION

    @When("going form ADDRESS to dashboard and again to profile module")
    public String going_from_ADDRESS_to_dashboard_and_again_to_profile_module() {
        profileSettingsPageBerti.getBackAndForwardIntoProfileModule();
        BrowserUtils.waitForPageToLoad(10);
        return profileSettingsPageBerti.address.getAttribute("value");

    }

    @When("you write {string} input on ADDRESS field")
    public void you_write_input_on_ADDRESS_field(String string) {
        BrowserUtils.waitForPageToLoad(10);
        profileSettingsPageBerti.address.clear();
        profileSettingsPageBerti.address.sendKeys(string);
        profileSettingsPageBerti.email.click();
        BrowserUtils.waitFor(3);
    }

    @Then("you should see the {string} on the ADDRESS field")
    public void you_should_see_the_on_the_ADDRESS_field(String expected) {
        Assert.assertEquals(going_from_ADDRESS_to_dashboard_and_again_to_profile_module(), expected);
    }

    @Then("you should not see the {string} on the ADDRESS field")
    public void you_should_not_see_the_on_the_ADDRESS_field(String expected) {
        Assert.assertTrue(!Objects.equals(going_from_ADDRESS_to_dashboard_and_again_to_profile_module(), expected));
    }

    //      #Website VERIFICATION
    //      #Website VERIFICATION

    @When("going form WEBSITE to dashboard and again to profile module")
    public String going_from_WEBSITE_to_dashboard_and_again_to_profile_module() {
        profileSettingsPageBerti.getBackAndForwardIntoProfileModule();
        return profileSettingsPageBerti.website.getAttribute("value");

    }

    @When("you write {string} input on WEBSITE field")
    public void you_write_input_on_WEBSITE_field(String string) {
        profileSettingsPageBerti.website.clear();
        profileSettingsPageBerti.website.sendKeys(string);
        profileSettingsPageBerti.email.click();
    }

    @Then("you should see the {string} on the WEBSITE field")
    public void you_should_see_the_on_the_WEBSITE_field(String expected) {
        Assert.assertEquals(going_from_WEBSITE_to_dashboard_and_again_to_profile_module(), expected);
    }

    @Then("you should not see the {string} on the WEBSITE field")
    public void you_should_not_see_the_on_the_WEBSITE_field(String expected) {
        Assert.assertTrue(!Objects.equals(going_from_WEBSITE_to_dashboard_and_again_to_profile_module(), expected));
    }


    //All fields VERIFICATIONS
    //All fields VERIFICATIONS

    @Given("a list of web elements from profile module")
    public List<WebElement> a_list_of_web_elements_from_profile_module() {
        List<WebElement> listOfWebElements = new ArrayList<>();
        listOfWebElements.add(profileSettingsPageBerti.fullName);
        listOfWebElements.add(profileSettingsPageBerti.email);
        listOfWebElements.add(profileSettingsPageBerti.phoneNumber);
        listOfWebElements.add(profileSettingsPageBerti.address);
        listOfWebElements.add(profileSettingsPageBerti.website);
        listOfWebElements.add(profileSettingsPageBerti.twitter);
        return listOfWebElements;
    }

    @When("you write {string}, {string}, {string}, {string}, {string}, {string} input on ALL fields")
    public void you_write_input_on_all_fields(String Full_name, String Email, String Phone_number, String Address, String Website, String Twitter) {
        List<String> listString = new ArrayList<>();
        listString.add(Full_name);
        listString.add(Email);
        listString.add(Phone_number);
        listString.add(Address);
        listString.add(Website);
        listString.add(Twitter);
        for (int i = 0; i < a_list_of_web_elements_from_profile_module().size(); i++) {

            a_list_of_web_elements_from_profile_module().get(i).clear();
            a_list_of_web_elements_from_profile_module().get(i).sendKeys(listString.get(i));
            profileSettingsPageBerti.kot.click();
            profileSettingsPageBerti.getBackAndForwardIntoProfileModule();
            String expected = a_list_of_web_elements_from_profile_module().get(i).getAttribute("value");
            String actual = listString.get(i);
            Assert.assertEquals(expected, actual);

        }

    }

}



