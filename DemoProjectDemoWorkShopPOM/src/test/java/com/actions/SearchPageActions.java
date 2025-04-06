package com.actions;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	
	 public void selectSortOption(String visibleText) {
	        Select sortSelect = new Select(searchPageLocators.sortDropdown);
	        sortSelect.selectByVisibleText(visibleText);
	    }

	 
	 public List<Double> getAllProductPrices() {
	        List<Double> prices = new ArrayList<>();
	        for (WebElement priceElement : searchPageLocators.productPrices) {
	            String priceText = priceElement.getText().replace("$", "").trim();
	            prices.add(Double.parseDouble(priceText));
	        }
	        return prices;
	    }
	    
	    public boolean arePricesSortedLowToHigh() {
	        List<Double> prices = getAllProductPrices();
	        for (int i = 0; i < prices.size() - 1; i++) {
	            if (prices.get(i) > prices.get(i + 1)) {
	                return false;
	            }
	        }
	        return true;
	    }
	
	
}
