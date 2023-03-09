package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allIcon);
		logger.info("user clicked on All section");
 }

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) throws InterruptedException {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);

		List<WebElement> actualSideBar = factory.homePage().sideBarElements;

		for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
			logger.info(actualSideBar.get(i).getText() + " is equal to " + expectedSideBar.get(0).get(i));
			Thread.sleep(5000);
			logger.info("SideBar oprtions are present in Department");
}
	}
	@When("User on {string}")
	public void userOnElectronics(String department) throws InterruptedException {
		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				Thread.sleep(5000);
				try {
					logger.info(option.getText() + " is present ");
				} catch (StaleElementReferenceException e) {

				}
				break;
			}
		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarOptionElements;

		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + " is present ");
				}
			}

		}

	}
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String select) throws InterruptedException {
		selectByVisibleText(factory.homePage().allDepartmentDropDown, select);
		logger.info("User changed the categoty to " + select);
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String productValue) {
		sendText(factory.homePage().searchBar,productValue);
		logger.info("User searched for an item" + productValue);
		  
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("User clicked on Search icon");
	}
	@When("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().objectToClick);
	  //  click(factory.homePage().smartPlug);
		logger.info("User clicked on item");
	}
	@When("User select quantity ‘{int}’")
	public void userSelectQuantity(Integer int1) {
	    selectByIndex(factory.homePage().addQuantity,int1);
	    logger.info("User select quantity" + int1);
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
	    click(factory.homePage().addToCart);
	    logger.info("User click add to cart button");
	}
	@Then("the cart icon quantity should change to ‘{int}’")
	public void theCartIconQuantityShouldChangeTo(Integer int1) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantiyUpdate));
		logger.info("the cart icon quantity should change to " + int1);
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	   click(factory.homePage().cartClickButton);
	   logger.info("User clicked on cart option");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.homePage().checkoutButton);
	    logger.info("User clicked checkout button");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	    click(factory.homePage().addAddressBtn);
	    logger.info("User clicked on add new address link for shipping address");
	}
	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> newAddressInfo = dataTable.asMaps(String.class, String.class);
		selectByValue(factory.accountPage().countrySelect,newAddressInfo.get(0).get("country"));
		
		sendText(factory.accountPage().fullNameInputAdress,newAddressInfo.get(0).get("fullName"));
		
		sendText(factory.accountPage().phoneNumberInputAddress,newAddressInfo.get(0).get("phoneNumber"));
		
		sendText(factory.accountPage().streetInputAddress,newAddressInfo.get(0).get("streetAddress"));
		
		sendText(factory.accountPage().apartmentInputAddress,newAddressInfo.get(0).get("apt"));
		
		sendText(factory.accountPage().cityInputAddress,newAddressInfo.get(0).get("city"));
		selectByValue(factory.accountPage().stateAddressInput,newAddressInfo.get(0).get("state"));
		sendText(factory.accountPage().zipCodeInputAddress,newAddressInfo.get(0).get("zipCode") );
		logger.info("User filled new address form");
	}
	
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	    click(factory.homePage().addPaymentBtn);
	    logger.info("User clicked add a credit or debit card for payment method");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    click(factory.homePage().placeOrderBtn);
	    logger.info("User clicked on place your order");
	}
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	   waitTillDisappears(factory.homePage().orderPlacedSuccessfully);
	   logger.info("A message with 'order placed, thanks' should be displayed");
	}
	
}
