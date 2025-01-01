package com.cydeo.pages;

import com.cydeo.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlitiaOnlineStatusPage2 {
    public GlitiaOnlineStatusPage2() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='user']")
    public static WebElement inUsername;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement inPassword;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement avatarButton;

      //div[@id='expand']

    @FindBy(xpath = "//div[@class='user-status-menu-item']/a")
    public WebElement SetStatusLinkDropDown;

    @FindBy(xpath = "//div[@class='set-status-modal']")
    public WebElement OnlineStatusBox;

    @FindBy(xpath = "//div[@class='set-status-modal__header']/h3")
    public WebElement OnlineTxt;

 //   @FindBy (xpath = "//div[@class='']")
  //  public WebElement OnlineText2;








    //  @FindBy(xpath ="//div[@class='user-status-menu-item']//a")
  //  public WebElement OptionsSetStatus;

   // @FindBy(xpath ="//div[@class='user-status-modal']")
   // public WebElement OnlineStatusBox;


}