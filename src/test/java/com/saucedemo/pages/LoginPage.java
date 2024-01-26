package com.saucedemo.pages;

import com.saucedemo.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    public WebElement usernameInputBox;
    @FindBy(id = "password")
    public WebElement passwordInputBox;
    @FindBy(id = "login-button")
    public WebElement login_button;
    @FindBy(xpath = "//span[@class='title']")
    public WebElement homePageTitle;
    public void login(){
        usernameInputBox.sendKeys(ConfigurationReader.get("username"));
        passwordInputBox.sendKeys(ConfigurationReader.get("password"));
        login_button.click();
    }
    public void VerifyIsUserLogin(String product){
        Assert.assertEquals(homePageTitle.getText(),product);
    }
}
