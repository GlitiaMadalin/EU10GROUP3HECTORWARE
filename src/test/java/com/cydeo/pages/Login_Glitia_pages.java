package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Glitia_pages {

    public Login_Glitia_pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(id="user")
public WebElement username;

@FindBy(id ="password")
public WebElement password;

@FindBy(id="submit-form")
public  WebElement lgnBtn;

@FindBy (xpath = "//*[@id=\"expand\"]/div[1]/img")
public WebElement AvatarID;

}