package com.actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.ProductSharingPageLocators;
import com.utilities.HelperClass;

public class ProductSharingAction {
	ProductSharingPageLocators productSharingPageLocators=null;
	
	
	public ProductSharingAction() {
		productSharingPageLocators=new ProductSharingPageLocators();
		PageFactory.initElements(HelperClass.getDriver(),productSharingPageLocators);
	}
	public void clickFirstProduct() {
		productSharingPageLocators.firstProduct.click();
	}
	
	public void clickEmailAFriend() {
		productSharingPageLocators.emailFriendButton.click();
	}
	public void enterFriendEmail(String email) {
        productSharingPageLocators.emailFrindInput.sendKeys(email);
    }
    
	public void enterSenderEmail(String email) {
	    WebElement element = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeClickable(productSharingPageLocators.senderEmail));
	    
	    element.sendKeys(Keys.CONTROL + "a");
	    element.sendKeys(Keys.BACK_SPACE);
	    element.sendKeys(email);
	}
    
    public void clickSendEmailButton() {
        productSharingPageLocators.senderEmailButton.click();
    }
    public boolean EmailsuccessMessage() {
    	return productSharingPageLocators.Emailsentmessage.isDisplayed();
    }
	
}
