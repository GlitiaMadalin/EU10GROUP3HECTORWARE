package com.cydeo.step_definitions;

import com.cydeo.pages.BookEditPageMeri;
import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.DBUtils;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookEdit_StepDefs_Meri {

    BookEditPageMeri bookEditPageMeri = new BookEditPageMeri();

    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("I login to application as a librarian")
    public void i_login_to_application_as_a_librarian() {

        String email = ConfigurationReader.getProperty("librarian_email");
        String password = ConfigurationReader.getProperty("librarian_password");
        libraryLoginPage.login(email,password);


    }
    @When("I navigate to {string} page")
    public void i_navigate_to_page(String link) {

        switch (link.toLowerCase()){
            case "dashboard":
                bookEditPageMeri.dashboard.click();
                break;
            case "users":
                bookEditPageMeri.users.click();
                break;
            case "books":
                bookEditPageMeri.books.click();
                break;
        }
    }

    @When("l can edit Book")
    public void l_can_edit_Book() {

        for (int i = 0; i < bookEditPageMeri.allEditButtons.size(); i++) {
            WebElement editBtn = bookEditPageMeri.allEditButtons.get(i);
            editBtn.click();
            DBUtils.sleep(2);
            bookEditPageMeri.close.click();
        }
    }

    @Then("Verify that Edit book  have name,author,description,category,ISBN,year fields")
    public void verify_that_Edit_book_have_name_author_description_category_ISBN_year_fields() {

        bookEditPageMeri.firstEditBtn.click();
        bookEditPageMeri.bookName.isDisplayed();
        bookEditPageMeri.author.isDisplayed();
        bookEditPageMeri.description.isDisplayed();
        bookEditPageMeri.categoryElement.isDisplayed();
        bookEditPageMeri.isbn.isDisplayed();
        bookEditPageMeri.year.isDisplayed();

    }

    @When("Verify that year parameter should have only digits")
    public void verify_that_year_parameter_should_have_only_digits() throws InterruptedException {


        bookEditPageMeri.firstEditBtn.click();
        DBUtils.sleep(1);
        bookEditPageMeri.year.clear();
        bookEditPageMeri.year.sendKeys("snbkhg");
        bookEditPageMeri.saveChanges.click();
        Thread.sleep(4);
        Assert.assertTrue(bookEditPageMeri.saveChanges.isDisplayed());
        DBUtils.sleep(4);
        Assert.assertTrue(bookEditPageMeri.editBookInfo.isDisplayed());


    }

    @When("Verify that all categories are in list")
    public void verify_that_all_categories_are_in_list(List<String> expectedCategories) {

        bookEditPageMeri.firstEditBtn.click();

        DBUtils.sleep(2);

        Select select = new Select(bookEditPageMeri.bookCategory);

        List<WebElement> allCategories = select.getOptions();


        System.out.println("expectedCategories = " + expectedCategories);

        List<String> actualCategories = new ArrayList<>();

        for (int i = 0; i < allCategories.size(); i++) {

            actualCategories.add(allCategories.get(i).getText());

        }

        for (int i = 0; i < expectedCategories.size(); i++) {

            Assert.assertEquals(expectedCategories.get(i),actualCategories.get(i));

//            System.out.println("expectedCategories.get(i) = " + expectedCategories.get(i));
//            System.out.println("actualCategories.get(i) = " + actualCategories.get(i));
        }

        System.out.println("actualCategories = " + actualCategories);

    }

    @Then("book categories should match with database")
    public void book_categories_should_match_with_database() {

        String query = "select  name from book_categories";

        List<List<Object>> dbCategories = DBUtils.getQueryResultList(query);


        System.out.println("dbCategories = " + dbCategories);

        bookEditPageMeri.firstEditBtn.click();

        DBUtils.sleep(2);

        Select select = new Select(bookEditPageMeri.bookCategory);

        List<WebElement> allCategories = select.getOptions();

        List<String> actualCategories = new ArrayList<>();

        for (int i = 0; i < allCategories.size(); i++) {
            actualCategories.add(allCategories.get(i).getText());

            Assert.assertEquals(actualCategories.get(i),dbCategories.get(i).toString());

        }
    }


    @When("Librarian can select related category using dropdown")
    public void librarian_can_select_related_category_using_dropdown() {



    }

    @When("Librarian can use show  records dropdown for getting number")
    public void librarian_can_use_show_records_dropdown_for_getting_number() {


    }

    @Then("Librarian can find book by using search box")
    public void librarian_can_find_book_by_using_search_box() {



    }
}
