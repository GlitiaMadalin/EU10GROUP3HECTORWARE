package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage {

    public UploadFilePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusBtn;

    @FindBy(xpath = "//li/label")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement newFolderBtn;

    @FindBy(xpath = "//a[@data-templatename='New text document.md']")
    public WebElement newTextDocBtn;

    @FindBy(xpath = "//span[.='dummyfileee']")
    public WebElement file;


}
