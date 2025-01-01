package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='contacts']")
    public WebElement contactsButton;

    @FindBy(id = "new-contact-button")
    public WebElement newContactButton;

    @FindBy(id = "contact-fullname")
    public WebElement name;

    @FindBy(id = "contact-org")
    public WebElement company;

    @FindBy(id = "contact-title")
    public WebElement title;

    @FindBy(xpath = "//header[@class='contact-header']")
    public WebElement emptyArea;

    @FindBy(xpath = "/html/body/div[3]/main/div/div[1]")
    public WebElement contactList;

    @FindBy(xpath = "//div[@class='app-content-details']")
    public WebElement page;

    @FindBy(xpath = "/html/body/div[3]/main/div/div[1]/div[1]/div[1]/div")
    public WebElement cedric;

    @FindBy(id = "contact-fullname")
    public WebElement contactName;

    @FindBy(id = "contact-org")
    public WebElement contactCom;

    @FindBy(id = "contact-title")
    public WebElement contactTitle;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public WebElement createdContact;

    @FindBy(xpath = "//div[@class='app-content-details']")
    public WebElement contactsPage;

    @FindBy(xpath = "//div[@class='action-item header-menu']/div/div/button")
    public WebElement threeDots;

    @FindBy(xpath = "/html/body/div[6]/div/div[1]/div[1]/div/ul/li[1]/a")
    public WebElement downloadOption;

    @FindBy(xpath = "/html/body/div[6]/div/div[1]/div[1]/div/ul/li[2]/button")
    public WebElement generateOption;

    @FindBy(xpath = "/html/body/div[6]/div/div[1]/div[1]/div/ul/li[3]/button")
    public WebElement deleteOption;

    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/div")
    public WebElement noContactPage;
}
