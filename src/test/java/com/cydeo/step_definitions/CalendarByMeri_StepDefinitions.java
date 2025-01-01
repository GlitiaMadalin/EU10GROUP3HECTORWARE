package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarPageByMeri;
import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CalendarByMeri_StepDefinitions {

    CalendarPageByMeri calendarPageByMeri = new CalendarPageByMeri();
    Faker faker = new Faker();


    @When("User click on calendar button")
    public void user_click_on_calendar_button() {

        calendarPageByMeri.calendarBtn.click();
    }
    @Then("User should see  new event")
    public void user_should_see_new_event() {

        Assert.assertTrue(calendarPageByMeri.newEventBtn.isDisplayed());
    }
    @When("User click to new event button")
    public void user_click_to_new_event_button() {

       calendarPageByMeri.newEventBtn.click();

    }
    @Then("User should see in right side Event title field")
    public void user_should_see_in_right_side_event_title_field() {

        Assert.assertTrue(calendarPageByMeri.eventTitleField.isDisplayed());

    }

    @Then("User enters random text in title field")
    public void user_enters_random_text_in_title_field() {

        calendarPageByMeri.eventTitleField.sendKeys(faker.name().title());
    }

    @Then("User  fills date {string} and time {string} and {string} in both fields")
    public void user_fills_date_and_time_and_both_fields(String date, String time1,String time2) {

        calendarPageByMeri.firstDate.click();
        calendarPageByMeri.firstDate.clear();
        calendarPageByMeri.firstDate.sendKeys("from "+date+" at "+time1);

        BrowserUtils.sleep(2);
        calendarPageByMeri.secondDate.click();
        calendarPageByMeri.secondDate.clear();
        calendarPageByMeri.secondDate.sendKeys("to "+date+" at "+time2);


    }
    @Then("User fill other fields and click save button")
    public void user_fill_other_fields_and_click_save_button() {


        calendarPageByMeri.location.sendKeys(faker.country().name());
        calendarPageByMeri.description.sendKeys(faker.letterify("Some text"));

        BrowserUtils.sleep(2);
        //calendarPageByMeri.status.click();
        //calendarPageByMeri.confirmed.click();
        //calendarPageByMeri.showSharedField.click();
        //calendarPageByMeri.onlyBusy.click();
        calendarPageByMeri.inputCategories.click();
        calendarPageByMeri.categories.click();

        BrowserUtils.sleep(2);
        calendarPageByMeri.saveBtn.click();
        BrowserUtils.sleep(2);
    }

    @Then("User should see  event date {string} and time {string} on the calendar")
    public void user_should_see_event_date_and_time_on_the_calendar(String date, String expectedTime) {



        WebElement actualTime = Driver.getDriver().findElement
                (By.xpath("//td[@data-date='"+ date +"']//div[@class='fc-event-main-frame']//div[.='" + expectedTime + "']"));
        Assert.assertTrue(actualTime.isDisplayed());
        Assert.assertEquals(actualTime.getText(),expectedTime);

        //td[@data-date='2023-03-26']//div[@class='fc-event-main-frame']//div[.='01:00 - 02:00']


    }


    @Then("User should see view button")
    public void user_should_see_view_button() {

        Assert.assertTrue(calendarPageByMeri.viewBtn.isDisplayed());

    }
    @Then("User should be able to change by day,week,month")
    public void user_should_be_able_to_change_by_day_week_month() {

        calendarPageByMeri.viewBtn.click();
        calendarPageByMeri.day.click();
        calendarPageByMeri.week.click();
        calendarPageByMeri.month.click();

    }

    @Then("User click on list option")
    public void user_click_on_list_option() {

        calendarPageByMeri.viewBtn.click();
        calendarPageByMeri.list.click();

    }
    @Then("User should see days of the week in english")
    public void user_should_see_of_the_week_in_english(List<String> expectedDays) {

        List<String> actualWeekDayList = new ArrayList<>();
        for (WebElement actualWeekDay : getActualWeekDays()) {

            String actualWeekDayText = actualWeekDay.getText();
            actualWeekDayList.add(actualWeekDayText);
        }
        Assert.assertEquals(actualWeekDayList,expectedDays);
    }

    public List<WebElement> getActualWeekDays(){

        List<WebElement> listOfWeekDays = Driver.getDriver().findElements(By.cssSelector("a.fc-list-day-side-text"));
        List<WebElement> list = new ArrayList<>();

        for (int i = 0; i < listOfWeekDays.size(); i++) {
            list.add(listOfWeekDays.get(i));
        }

        return list;
    }

    @Then("User should see calendar module")
    public void user_should_see_calendar_module() {

        Assert.assertTrue(calendarPageByMeri.calendarBtn.isDisplayed());
    }

    @Then("User click on that event")
    public void user_click_on_that_event() {

        calendarPageByMeri.event.click();
        BrowserUtils.sleep(2);
    }
    @Then("User  changes title in title field")
    public void user_changes_title_in_title_field() {

        calendarPageByMeri.eventTitleField.clear();
        BrowserUtils.sleep(2);
        calendarPageByMeri.eventTitleField.sendKeys("QA engineer");
    }
    @Then("User clicks update button")
    public void user_click_save_button() {

        calendarPageByMeri.saveBtn.click();

    }

    @Then("user clicks on that event and delete it")
    public void user_clicks_on_that_event_and_delete_it() {

        BrowserUtils.sleep(2);
        calendarPageByMeri.eventTitle.click();
        BrowserUtils.sleep(2);
        calendarPageByMeri.menuBtn.click();

        calendarPageByMeri.delete.click();
    }


}
