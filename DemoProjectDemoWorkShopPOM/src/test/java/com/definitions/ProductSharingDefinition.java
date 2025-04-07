package com.definitions;

import com.actions.ProductSharingAction;
import com.utilities.ExcelReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class ProductSharingDefinition {
	private static final Logger logger = LogManager.getLogger(LoginDefinition.class);
    private final ProductSharingAction sharingAction = new ProductSharingAction();
    private static final String EXCEL_PATH = "src/test/resources/SharingEmailInput.xlsx";
    private static final String SHEET_NAME = "EmailData";

    @When("the user clicks the first product in the sorted list")
    public void the_user_clicks_the_first_product_in_the_sorted_list() {
        sharingAction.clickFirstProduct();
    }

    @When("the user clicks the email a friend button")
    public void the_user_clicks_the_email_a_friend_button() {
        sharingAction.clickEmailAFriend();
    }

    @When("the user enters friend details from {int}")
    public void the_user_enters_friend_details_from(Integer rowNumber) {
       logger.info("filling the email of the send and receiver");
        int rowIndex = rowNumber - 1;
        
        Map<String, String> rowData = ExcelReader.getRowData(EXCEL_PATH, SHEET_NAME, rowIndex);
        
        String friendEmail = rowData.get("FriendEmail");
        String senderEmail = rowData.get("SenderEmail");

        System.out.println("Using test data from row " + rowNumber + ":");
        System.out.println("Friend Email: " + friendEmail);
        System.out.println("Sender Email: " + senderEmail);

        sharingAction.enterFriendEmail(friendEmail);
        sharingAction.enterSenderEmail(senderEmail);
    }

    @When("clicks the Send email button")
    public void clicks_the_send_email_button() {
        sharingAction.clickSendEmailButton();
    }
    
    @Then("the user should see the email send successfull message")
    public void the_user_should_see_the_email_send_successfull_message() {
    	//sharingAction.EmailsuccessMessage();
    	Assert.assertTrue(sharingAction.EmailsuccessMessage(),"email sent not successfull");
    }
}