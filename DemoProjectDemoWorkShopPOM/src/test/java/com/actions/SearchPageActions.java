package com.actions;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.pages.SearchPageLocators;
import com.utilities.HelperClass;

public class SearchPageActions {
	SearchPageLocators searchPageLocators=null;
	
	public SearchPageActions(){
		searchPageLocators = new SearchPageLocators();
		PageFactory.initElements(HelperClass.getDriver(),searchPageLocators );
		
	}
	
	public void enterSearchKeyword(String searchKey) {
	    searchPageLocators.searchbar.sendKeys(searchKey, Keys.ENTER);
	}
	
	public String getTitleOfSearch() {
	    return searchPageLocators.searchTitle.getText();
	}
	
	public String getSeachResultOfInvalidInput() {
	    return searchPageLocators.InvalidsearchResult.getText();
	}
	
	


	
	
}
