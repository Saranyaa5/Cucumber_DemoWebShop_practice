package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

    @FindBy(linkText = "Log in")
    public WebElement loginPageButton;

    @FindBy(id = "Email")
    public WebElement emailField;

    @FindBy(id = "Password")
    public WebElement passwordField;

    @FindBy(css = ".button-1.login-button")
    public WebElement loginButton;
    
    @FindBy(linkText="Log out")
    public WebElement logoutButton;
    
}
