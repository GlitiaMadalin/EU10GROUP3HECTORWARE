package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Fitim {

    public LoginPage_Fitim(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id= "user")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginBTN;

    @FindBy (xpath = "//*[@id=\"expand\"]/div[1]/img")
    public WebElement avatarID;


}
