package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocators {

	@FindBy(xpath="//input[@id='small-searchterms']")
	public WebElement searchbar;
	
//	@FindBy(xpath="//select[@id='small-searchterms']//option[4]")
//	public WebElement selectsort;
	
	@FindBy(xpath = "//div[@class='page-title']//h1")
	public WebElement searchTitle;
	
	@FindBy(css = "strong.result")
	public WebElement InvalidsearchResult;
	
	@FindBy(id="products-orderby")
    public WebElement sortDropdown;
	
	 @FindBy(css = "div.product-grid")
	 public WebElement productGrid;

	 @FindBy(css = "div.product-item span.actual-price")
	 public List<WebElement> productPrices;

}
