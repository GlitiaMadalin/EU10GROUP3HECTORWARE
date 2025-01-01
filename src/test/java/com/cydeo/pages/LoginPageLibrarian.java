package com.cydeo.pages;


import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLibrarian {
    public LoginPageLibrarian() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement email;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(tagName = "button")
    public WebElement signIn;

    public void login(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        signIn.click();
    }
}
