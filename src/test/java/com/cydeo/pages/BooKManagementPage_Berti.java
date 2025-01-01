package com.cydeo.pages;


import com.cydeo.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooKManagementPage_Berti {
    public BooKManagementPage_Berti() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_groups")
    public WebElement userGroup;


    @FindBy(xpath = "//*[@id=\"tbl_users_filter\"]/label/input")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='modal-footer']//button[@type='submit']")
    public WebElement editSaveChanges;


    @FindBy(xpath = "//*[@id='tbl_users']/tbody/tr/td[1]")
    public WebElement editUser;

    @FindBy(xpath = "//*[@id=\"users\"]/div[1]/div[1]/span/a")
    public WebElement addUser;

    @FindBy(xpath = "//form[@id='add_user_form']//input[@name='full_name']")
    public WebElement addFullName;

    @FindBy(xpath = "//form[@id='add_user_form']//input[@name='password']")
    public WebElement addPassword;

    @FindBy(xpath = "//form[@id='add_user_form']//input[@name='email']")
    public WebElement addEmail;

    @FindBy(xpath = "//select[@name='user_group_id']")
    public WebElement addUserGroupDropDown;

    @FindBy(xpath = "//div[@class='col-6']//select[@name='status']")
    public WebElement addStatusDropDown;


    @FindBy(xpath = "//form[@id='add_user_form']//input[@name='start_date']")
    public WebElement addStartDate;

    @FindBy(xpath = "//form[@id='add_user_form']//input[@name='end_date']")
    public WebElement addEndDate;

    @FindBy(xpath = "//form[@id='add_user_form']//input[@name='address']")
    public WebElement addAddress;


    @FindBy(xpath = "//div[@class='modal-footer']//button[@type='submit']")
    public WebElement addSaveButton;


    @FindBy(xpath = "//*[@id='tbl_users']/tbody/tr/td[2]")
    public WebElement userId;

    @FindBy(xpath = "//*[@id='tbl_users']/tbody/tr/td[3]")
    public WebElement fullName;

    @FindBy(xpath = "//*[@id='tbl_users']/tbody/tr/td[4]")
    public WebElement email;

    @FindBy(xpath = "//*[@id='tbl_users']/tbody/tr/td[5]")
    public WebElement group;

    @FindBy(xpath = "//*[@id='tbl_users']/tbody/tr/td[6]")
    public WebElement status;

    @FindBy(name = "tbl_users_length")
    public WebElement showUsers;

    @FindBy(xpath = "//input[@class='form-control' and @name='full_name']")
    public WebElement editFullName;

    @FindBy(xpath = "//input[@class='form-control' and @name='email']")
    public WebElement editEmail;

    @FindBy(id = "user_group_id")
    public WebElement editUserGroup;

    @FindBy(id = "status")
    public WebElement editStatus;

    @FindBy(xpath = "//input[@class='form-control' and @name='start_date']")
    public WebElement editStartDate;

    @FindBy(xpath = "//input[@class='form-control' and @name='end_date']")
    public WebElement editEndDate;

    @FindBy(xpath = "//textarea[@class='form-control' and @name='address']")
    public WebElement editAddress;

    public WebElement searchForUsers(String users) {
        String xpath = "//td[4][contains(text(), " + users + ")]/../td/a";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement searchForId(String users) {
        String xpath = "(//td[4][contains(text(), " + users + ")]/../td)[2]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

}
