package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocators {

	@FindBy(xpath="//input[@id='small-searchterms']")
	public WebElement searchbar;
	
	@FindBy(xpath="//select[@id='small-searchterms']//option[4]")
	public WebElement selectsort;
	
	@FindBy(xpath = "//div[@class='page-title']//h1")
	public WebElement searchTitle;
	
	@FindBy(css = "strong.result")
	public WebElement InvalidsearchResult;

}
