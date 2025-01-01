package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.joda.time.Minutes;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SetStatusPage {

    public SetStatusPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/div/div/div[3]/h3")
    public WebElement setStatusText;

    @FindBy(css = "#body-user > div.modal-mask > div.modal-wrapper.modal-wrapper--normal > div > div > div.set-status-modal__custom-input > form > input[type=text]")
    public WebElement inputBox;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/div/div/div[5]/div[1]/span[2]")
    public WebElement inAMeeting;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/div/div/div[5]/div[2]/span[2]")
    public WebElement commuting;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/div/div/div[5]/div[3]/span[2]")
    public WebElement workingRemotely;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/div/div/div[5]/div[4]/span[2]")
    public WebElement outSick;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/div/div/div[5]/div[4]/span[2]")
    public WebElement vacationing;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/div/div/div[6]/span")
    public WebElement clearStatusAfter;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/div/div/div[6]/div/div[2]/input")
    public WebElement selectOptionInputBox;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/div/div/div[7]/button[1]")
    public WebElement clearStatusMessageBttn;

    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div/div[7]/button[2]")
    public WebElement setStatusMessageBttn;


    @FindBy(xpath = "//*[@id=\"body-user\"]/div[8]/div[2]/div/div/div[5]/div[1]/span[3]")
    public WebElement anHour;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[5]/div[2]/div/div/div[6]/div/div[3]/ul/li[2]/span/div/span[1]")
    public WebElement thirtyMinutes;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[5]/div[2]/div/div/div[5]/div[1]/span[3]")
    public WebElement anhourInAMeeting;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[5]/div[2]/div/div/div[6]/div/div[2]/span")
    public WebElement today;
}
