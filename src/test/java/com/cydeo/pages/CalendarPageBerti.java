package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CalendarPageBerti {
    public CalendarPageBerti() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//li[7]/a")
    public WebElement calendarBtn;

    @FindBy(css = "button[class$=\"datepicker-label\"]")
    public WebElement calendarShow;

    @FindBy(css = "button[class*=\"previous\"]")
    public WebElement leftArrowCalendarShow;

    @FindBy(xpath = "//button[@title=\"Next day\"]")
    public WebElement rightArrowCalendarShow;

    @FindBy(css = "button[class$=\"today\"]")
    public WebElement todayDate;

    @FindBy(css = "button[class*=\"primary\"]")
    public WebElement newEvent;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/header/div[2]/div/div/div/button")
    public WebElement showByDayWeekDropDown;

    @FindBy(css = "span[title=\"Personal\"]")
    public WebElement personalAppNavigationEntryTitle;

    @FindBy(css = "button[class$=\"undefined\"]")
    public WebElement sharePersonal;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[2]/a/span")
    public WebElement newCalendar;



    public List<WebElement> getMenuItems() {
        List<WebElement> listOfWebElements = Driver.getDriver().findElements(By.cssSelector("a.app-navigation-entry-link"));
        List<WebElement> list = new ArrayList<>();
        for (int i = 0; i < listOfWebElements.size(); i+=2) {
            list.add(listOfWebElements.get(i));
        }
        return list;
    }


}
