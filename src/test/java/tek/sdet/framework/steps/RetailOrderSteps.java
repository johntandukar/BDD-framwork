package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	private POMFactory factory = new POMFactory();
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
	   click(factory.orderPage().orderLink);
	}
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	   click(factory.orderPage().showDetails);
	}
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	   click(factory.orderPage().cancelBtn);
	}
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String value) {
	    selectByVisibleText(factory.orderPage().reasonInput,value);
	}
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	    click(factory.orderPage().orderCancelBtnReason);
	}
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		isElementDisplayed(factory.orderPage().yourOrderHasBeenCancelled);
		logger.info("user is login into account page");
	}
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().returnButton);
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String value) {
		    selectByVisibleText(factory.orderPage().reasonInput,value);
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String value) {
	    selectByVisibleText(factory.orderPage().dropOffInput,value);
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	    click(factory.orderPage().orderCancelBtnReason);
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String value) {
		isElementDisplayed(factory.orderPage().returnSucess);
		logger.info("A cancellation message is displayed");
	}  
	@And("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.orderPage().reviewButton);
	}
	@And("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String head, String description) throws InterruptedException {
	    sendText(factory.orderPage().addReviewheadline,head);
	    sendText(factory.orderPage().reviewDescription,description);
	    Thread.sleep(2000);
	    
	}
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() throws InterruptedException {
	    click(factory.orderPage().reviewSubmitButton);
	    Thread.sleep(2000);
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String expectedMessage) {
	//waitTillDisappears(factory.orderPage().reviewAddedSuccess);	
		//Assert.assertEquals(isElementDisplayed(factory.orderPage().reviewAddedSuccess));
		Assert.assertEquals(expectedMessage, factory.orderPage().reviewAddedSuccess.getText());
	}

}
	


