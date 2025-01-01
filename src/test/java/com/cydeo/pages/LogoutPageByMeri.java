package com.cydeo.pages;

import com.cydeo.utilites.ConfigurationReader;
import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageByMeri {

    public LogoutPageByMeri() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    public  WebElement inputPassword;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;
    @FindBy (xpath = "//img[@src='/index.php/avatar/Employee1/32?v=78']")
    public WebElement accountBtn;

    @FindBy (xpath = "//li[@data-id='logout']")
    public WebElement logoutBtn;


}
