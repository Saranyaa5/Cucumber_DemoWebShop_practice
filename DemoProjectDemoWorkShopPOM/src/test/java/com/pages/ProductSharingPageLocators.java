package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSharingPageLocators {

	@FindBy(css = "div.product-grid div.item-box:first-child .product-title a")
	public WebElement firstProduct;
	
	@FindBy(css = "#product-details-form>div>div.product-essential>div.overview>div.email-a-friend>input")
    public WebElement emailFriendButton;
	
	@FindBy(xpath="//input[@id='FriendEmail']")
	public WebElement emailFrindInput;
	
	@FindBy(xpath="//input[@id='YourEmailAddress']")
	public WebElement senderEmail;
	
	@FindBy(xpath="//input[@name='send-email']")
	public WebElement senderEmailButton;
	
	@FindBy(xpath="//*[contains(text(),'Your message has been sent.')]")
	//@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]")
	public WebElement Emailsentmessage;
	
}
