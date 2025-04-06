package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPageLocators;
import com.utilities.HelperClass;

public class LoginPageAction {
LoginPageLocators loginPageLocators=null;

String  stremail,strpassword;
 public LoginPageAction(){
	 loginPageLocators = new LoginPageLocators();
     PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
  
}
 public void clickHomePageLogin() {
	 	loginPageLocators.loginPageButton.click();
	 }
 
 public void setEmail(String stremail) {
	 loginPageLocators.emailField.sendKeys(stremail);
 }
 public void setPassword(String strpassword) {
	 loginPageLocators.passwordField.sendKeys(strpassword);
 }
 public void clickLogin() {
 	loginPageLocators.loginButton.click();
 }
 
 public boolean checkLoginSuccess() {
	return loginPageLocators.logoutButton.isDisplayed();
 }
 public void login() {
 	File file=new File("C:\\Users\\saran\\git\\PracticeDemoWebShop\\DemoProjectDemoWorkShopPOM\\src\\test\\resources\\inputdata.properties");
 
 FileInputStream fileInput = null;
 try {
     fileInput = new FileInputStream(file);
 } catch (FileNotFoundException e) {
     e.printStackTrace();
     return;
 }

 Properties prop = new Properties();
 
 try {
     prop.load(fileInput);
     fileInput.close();
 }
 catch (IOException e) {
     e.printStackTrace();
 
 }
 
 stremail=prop.getProperty("email");
 
 strpassword=prop.getProperty("password");
 
		 this.setEmail(stremail);
	
	this.setPassword(strpassword);
	
	
}
}


