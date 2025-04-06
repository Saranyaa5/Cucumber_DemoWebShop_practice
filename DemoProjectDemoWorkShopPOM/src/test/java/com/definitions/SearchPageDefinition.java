package com.definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;

import org.testng.Assert;

import com.actions.SearchPageActions;
public class SearchPageDefinition {
	SearchPageActions searchPageAction=new SearchPageActions();
@When("the user enters a product name products in the search bar")
public void the_user_enters_a_product_name_products_in_the_search_bar(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	List<List<String>> products = dataTable.asLists(String.class);
    Thread.sleep(2000);

	for (List<String> row : products) {
	    String product = row.get(0);
	    searchPageAction.enterSearchKeyword(product);
	    
	}

}

@Then("the matching products should be displayed")
public void the_matching_products_should_be_displayed() throws InterruptedException {
    Thread.sleep(2000); 
    Assert.assertTrue(searchPageAction.getTitleOfSearch().equals("Search"),"Search is not implemented");
}


@Then("the message {string} should be displayed")
public void the_message_should_be_displayed(String string) {
	Assert.assertTrue(searchPageAction.getSeachResultOfInvalidInput().equals(string),"Search is not implemented");
}
}
