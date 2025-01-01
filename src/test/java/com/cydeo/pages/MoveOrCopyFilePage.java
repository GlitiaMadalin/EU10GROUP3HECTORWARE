package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveOrCopyFilePage {

    public MoveOrCopyFilePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='dummyfileee']")
    public WebElement file;

    @FindBy(xpath = "//a[@class='menu-option option-movecopy']")
    public WebElement moveOrCopyButton;

    @FindBy(xpath = "//h2[.='Choose target folder']")
    public WebElement targetFolderText;

    @FindBy(xpath = "//span[@class='nametext']//span[.='Notes']")
    public WebElement targetFolder;

    @FindBy(xpath = "//button[.='Copy to Notes']")
    public WebElement copyToBtn;

    @FindBy(xpath = "//button[.='Move to Notes']")
    public WebElement moveToBtn;

    @FindBy(xpath = "//span[@class='nametext']/span[.='Notes']")
    public WebElement notesUI;

    @FindBy(xpath = "//div[@class='crumb'][1]")
    public WebElement homeBtn;

    @FindBy(xpath = "//button[.='Move']")
    public WebElement moveBtn;







}
