
package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPageAli {
    public SettingsPageAli(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id= "user")
    public WebElement username;



    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-wrapper")
    public  WebElement LoginButton;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement avatarButton;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement SetStatus;

    @FindBy(xpath = "//a[@href='/index.php/settings/user']")
    public WebElement SettingsButton;

    @FindBy(xpath = "//img[@src='/apps/settings/img/help.svg?v=01656a04']")
    public WebElement HelpButton;

    @FindBy(id = "displayname")
    public WebElement fullName;




}

