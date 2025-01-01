package com.cydeo.pages;

import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageByMeri {
    public LoginPageByMeri() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='user']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    public  WebElement inputPassword;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;


    public void login(String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("urlLink"));
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }
}
