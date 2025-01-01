package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarPageBerti;
import com.cydeo.utilites.BrowserUtils;
import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CalendarStep_Definitions_Berti {
    CalendarPageBerti calendarPageBerti = new CalendarPageBerti();

    @When("you click calendar button")
    public void you_click_calendar_button() {
        calendarPageBerti.calendarBtn.click();
    }

    @Then("you should print all new calendars name")
    public void you_should_print_all_new_calendars_name() {
        calendarPageBerti.calendarBtn.click();
        BrowserUtils.waitForPageToLoad(10);
        for (WebElement menuItem : calendarPageBerti.getMenuItems()) {
            System.out.println(menuItem.getText());
        }
    }

    @When("you give {string} I should click on that calendar and rename it to {string}")
    public void you_give_here_and_i_should_click_on_that_calendar_and_rename_it_to(String nameOfDropdown, String rename) throws InterruptedException {
        BrowserUtils.waitForPageToLoad(10);
        for (int i = 2; i < 20; i++) {
            if (nameOfDropdown.equals("Edit name")) {
                WebElement dropDown = Driver.getDriver().findElement(By.xpath("//*[@id=\"menu-jkvxx\"]/li[" + i + "]/button/span[2]"));
                dropDown.click();
                dropDown.clear();
                dropDown.sendKeys(rename);
                Thread.sleep(5);
            }
        }

    }

    @When("you give {string} here and I should click on the three dots on the left")
    public void you_give_here_and_i_should_click_on_the_three_dots_on_the_left(String calendarName) throws InterruptedException {
        BrowserUtils.waitFor(10);
        for (WebElement menuItem : calendarPageBerti.getMenuItems()) {
            int count = 1;
            if (menuItem.getText().equals(calendarName)) {
                count++;
                WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"app-navigation-vue\"]/ul/div/li[" + count + "]/div/div/div/div/button"));
                JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
                // Click the element using JavaScript
                js.executeScript("arguments[0].click();", element);
                Thread.sleep(3);
            }
        }
    }


    @When("you give {string} here and I should click on that calendar")
    public void you_give_here_and_I_should_click_on_that_calendar(String calendarName) {
        BrowserUtils.waitFor(10);
        for (WebElement menuItem : calendarPageBerti.getMenuItems()) {
            if (menuItem.getText().equals(calendarName)) {
                menuItem.click();
            }
        }
    }


    @When("Checking")
    public void checking() throws InterruptedException {
        calendarPageBerti.showByDayWeekDropDown.click();
        Thread.sleep(5);

    }

}
