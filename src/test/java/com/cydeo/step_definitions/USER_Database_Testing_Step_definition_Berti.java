package com.cydeo.step_definitions;

import com.cydeo.pages.BooKManagementPage_Berti;
import com.cydeo.pages.LoginPageLibrarian;
import com.cydeo.pages.PageBase;
import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.DBUtils;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class USER_Database_Testing_Step_definition_Berti extends PageBase {
    LoginPageLibrarian loginPage = new LoginPageLibrarian();
    BooKManagementPage_Berti booKManagementPage_berti = new BooKManagementPage_Berti();


    // Login and verify the URL
    // Login and verify the URL
    // Login and verify the URL
    @Given("that you are in library and log in as {word}")
    public void that_you_are_in_library_and_log_in_as_librarian(String word) {
        String userName = "";
        String password = "";

        switch (word) {
            case "librarian":
                userName = ConfigurationReader.getProperty("librarian_email");
                password = ConfigurationReader.getProperty("librarian_password");
                break;
            case "student":
                userName = ConfigurationReader.getProperty("student_email");
                password = ConfigurationReader.getProperty("student_password");
                break;

        }
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(userName, password);
    }

    @When("you are at {string}")
    public void you_are_at(String str) {
        if (str.equalsIgnoreCase("users")) {
            users.click();
        } else if (str.equalsIgnoreCase("books")) {
            books.click();
        }

    }

    @Then("you should see {string} into URL")
    public void you_should_see_into_URL(String str) {
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actual.contains(str));
    }

    //Database testing
    //Database testing
    //Database testing

    @When("you can search for users {word}")
    public void you_can_search_for_users_actions(String word) {
        users.click();
        Select dropdown = new Select(booKManagementPage_berti.userGroup);
        for (WebElement option : dropdown.getOptions()) {
            if (option.getText().equalsIgnoreCase(word)) {
                option.click();
            }
        }
    }


    @When("you search for user Id {string}")
    public void you_search_for_user_Id(String id) {
        //How many lines you want to show
        //Select dropdownShew = new Select(booKManagementPage_berti.showUsers);
        //dropdownShew.selectByIndex(4);

        booKManagementPage_berti.searchBox.click();
        booKManagementPage_berti.searchBox.sendKeys(id + Keys.ENTER);
        BrowserUtils.waitFor(3);
        String userId = booKManagementPage_berti.userId.getText();
        Assert.assertEquals(userId, id);
    }

    @Then("print all the information for that row")
    public void print_all_the_information_for_that_row() {
        System.out.println("booKManagementPage_berti.userId.getText() = " + booKManagementPage_berti.userId.getText());
        System.out.println("booKManagementPage_berti.fullName.getText() = " + booKManagementPage_berti.fullName.getText());
        System.out.println("booKManagementPage_berti.email.getText() = " + booKManagementPage_berti.email.getText());
        System.out.println("booKManagementPage_berti.group.getText() = " + booKManagementPage_berti.group.getText());
        System.out.println("booKManagementPage_berti.status.getText() = " + booKManagementPage_berti.status.getText());
    }

    @Then("UI part must match with DataBase for given ID {string}")
    public void ui_part_must_match_with_data_base_for_given_id(String id) {
        String userId = booKManagementPage_berti.userId.getText();
        String fullName = booKManagementPage_berti.fullName.getText();
        String email = booKManagementPage_berti.email.getText();
        String group = booKManagementPage_berti.group.getText();
        String status = booKManagementPage_berti.status.getText();

        DBUtils.createConnection();

        String query = "select id, full_name, email, status, start_date, end_date, address  from users\n" +
                "where id=" + id;
        Map<String, Object> dbData = DBUtils.getRowMap(query);

        Assert.assertEquals(userId, dbData.get("id"));
        Assert.assertEquals(fullName, dbData.get("full_name"));
        Assert.assertEquals(email, dbData.get("email"));
        Assert.assertEquals(group, dbData.get("group"), "group does not match");
        Assert.assertEquals(status, dbData.get("status"));


        //System.out.println("dbData.get(\"id\") = " + dbData.get("id"));
        //System.out.println("dbData.get(\"full_name\") = " + dbData.get("full_name"));
        //System.out.println("dbData.get(\"email\") = " + dbData.get("email"));
        //System.out.println("dbData.get(\"status\") = " + dbData.get("status"));

        //System.out.println("userId = " + userId);
        //System.out.println("fullName = " + fullName);
        //System.out.println("email = " + email);
        //System.out.println("status = " + status);
        //System.out.println("group = " + group);

    }

    @When("search for a user with id {string}")
    public void search_for_a_user_with_id(String id) {
        BrowserUtils.waitFor(3);
        booKManagementPage_berti.searchBox.sendKeys(id + Keys.ENTER);
        BrowserUtils.waitFor(3);
        booKManagementPage_berti.editUser.click();
        BrowserUtils.waitFor(3);
        booKManagementPage_berti.editFullName.clear();
        booKManagementPage_berti.editFullName.sendKeys("Defrim" + Keys.ENTER);
        BrowserUtils.clickWithJS(booKManagementPage_berti.editSaveChanges);

    }

    @When("you click add user")
    public void you_click_add_user() {
        booKManagementPage_berti.addUser.click();
    }

    @When("you fill all necessary fields")
    public void you_fill_all_necessary_fields() {
        BrowserUtils.waitFor(3);
        booKManagementPage_berti.addFullName.sendKeys("Albert");
        booKManagementPage_berti.addEmail.clear();
        BrowserUtils.waitFor(3);
        booKManagementPage_berti.addEmail.sendKeys("Albert@gmail.com");
        booKManagementPage_berti.addPassword.clear();
        BrowserUtils.waitFor(3);
        booKManagementPage_berti.addPassword.sendKeys("12345");
        booKManagementPage_berti.addSaveButton.click();

    }

    @Then("you should see the new added user on the UI")
    public void you_should_see_the_new_added_user_on_the_ui() {


    }


}
