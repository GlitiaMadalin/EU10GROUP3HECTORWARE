package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookEditPageMeri {

    public BookEditPageMeri() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title'][.='Users']")
    public WebElement users;

    @FindBy(xpath = "//span[@class='title'][.='Dashboard']")
    public WebElement dashboard;

    @FindBy(xpath = "//span[@class='title'][.='Books']")
    public WebElement books;
    @FindBy(name = "name")
    public WebElement bookName;

    @FindBy(name = "isbn")
    public WebElement isbn;

    @FindBy(name = "year")
    public WebElement year;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement author;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(id = "book_group_id")
    public WebElement categoryElement;

    @FindBy(id = "book_categories")
    public WebElement mainCategoryElement;

    @FindBy(xpath = "//a[contains(@onclick,'Books.edit_book')]")
    public List<WebElement> allEditButtons;


    @FindBy(xpath = "//a[contains(@onclick,'Books.edit_book(3647)')]")
    public WebElement firstEditBtn;

    @FindBy (xpath = "//button[.='Close']")
    public WebElement close;

    @FindBy(id = "book_group_id")
    public WebElement bookCategory;

    @FindBy(xpath = "//button[.='Save changes']")
    public WebElement saveChanges;

    @FindBy (xpath = "//h5[.='Edit Book Information']")
    public WebElement editBookInfo;


}
