package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class TalkPageByAnda {

    public TalkPageByAnda(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//ul[@id='appmenu']//li[4]/a")
    public WebElement Talkbutton;

    @FindBy (xpath = "//button[@class='toggle has-tooltip']")
    public WebElement PlusSignButton;

@FindBy (xpath = "//input[@placeholder='Conversation name']")
    public WebElement ConversationNameBox;


@FindBy (xpath = "//div[@class='new-group-conversation talk-modal']")
    public WebElement ConversationNameModal;


@FindBy (xpath = "//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement ConversationThreeDotsButton;




@FindBy(xpath = "//li[@class='action critical']//button//span[2]")
    public WebElement DeleteConversationBox;

@FindBy(xpath = "//a[@aria-label='Conversation, Andas Conversation']")
    public WebElement AndasConversationBox;

@FindBy(xpath = "//a[@id='conversation_qgrbvuao']")
    public WebElement AndasConversationBox2;

@FindBy(xpath = "//div[@class='oc-dialog-buttonrow twobuttons']//button[2]")
    public WebElement DeleteConversationYesButton;
}
