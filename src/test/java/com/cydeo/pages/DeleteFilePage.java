package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteFilePage {

    public DeleteFilePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='dummyfileee']")
    public WebElement file;

    @FindBy(xpath = "//li[@class=\"action-0\"]")
    public WebElement addToFavouritesBtn;

    @FindBy(xpath = "//li[@class=\"action-1\"]")
    public WebElement detailsBtn;

    @FindBy(xpath = "//li[@class=\"action-2\"]")
    public WebElement renameBtn;

    @FindBy(xpath = "//li[@class=\"action-3\"]")
    public WebElement moveOrCopyBtn;

    @FindBy(xpath = "//li[@class=\"action-4\"]")
    public WebElement downloadBtn;

    @FindBy(xpath = "//li[@class=\"action-5\"]")
    public WebElement deleteFileBtn;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement trash;


}
