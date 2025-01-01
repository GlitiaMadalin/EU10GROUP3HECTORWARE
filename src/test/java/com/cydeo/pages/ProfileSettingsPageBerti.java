package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import okhttp3.internal.http2.Settings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfileSettingsPageBerti {
    public ProfileSettingsPageBerti() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='expand']/div[1]/img")
    public WebElement profileModule;

    @FindBy(xpath = "//*[@id='expanddiv']/ul/li[2]/a")
    public WebElement settings;

    @FindBy(xpath = "//*[@id='displayname']")
    public WebElement fullName;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='address']")
    public WebElement address;

    @FindBy(xpath = "//*[@id='website']")
    public WebElement website;

    @FindBy(xpath = "//*[@id='twitter']")
    public WebElement twitter;

    @FindBy(xpath = "//*[@id='languageinput']")
    public WebElement languageDropDown;

    @FindBy(xpath = "//*[@id='localeinput']")
    public WebElement localeDropDown;

    @FindBy(xpath = "//*[@id='nextcloud']/div")
    public WebElement dashboard;

    @FindBy(xpath = "//*[@id=\"displayavatar\"]/p/em")
    public WebElement kot;

    public void goToProfileModule(){
        profileModule.click();
        settings.click();
    }
    public void getBackAndForwardIntoProfileModule(){
        dashboard.click();
        profileModule.click();
        settings.click();
    }


}
