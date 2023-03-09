package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOptions);
		logger.info("user clicked on Account option");

	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
		logger.info("user updated Name and Phone values ");
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");

	}

	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}
	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> changePassword = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput,changePassword.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput,changePassword.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput,changePassword.get(0).get("confirmPassword"));
		logger.info("user filled the new password information form");
	}
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
	    click(factory.accountPage().changePasswordButton);
	    logger.info("user clicked on change password");
	    
	}
	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		isElementDisplayed(factory.accountPage().passwordUpdatedSuccessfully);
		logger.info("user is login into account page");
	}
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	   click(factory.accountPage().addAPaymentMethod);
	   logger.info("User clicked on payment method link");
	}
	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> creditCardInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput,creditCardInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput,creditCardInfo.get(0).get("nameOnCard"));
		selectByValue(factory.accountPage().expirationMonthInput,creditCardInfo.get(0).get("expirationMonth"));
		selectByValue(factory.accountPage().expirationYearInput,creditCardInfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeInput,creditCardInfo.get(0).get("securityCode") );
		logger.info("User fill Debit or credit card information");
	}
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	   click(factory.accountPage().paymentSubmitBtn);
	   logger.info("User click on Add your card button");
	}
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
		logger.info("user is login into account page");
	}
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() throws InterruptedException{
		click(factory.accountPage().accountPaymentEdit);
		Thread.sleep(4000);
	   click(factory.accountPage().editButtonCreditCard);
	   Thread.sleep(4000);   
	   clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
	   logger.info("User click on Edit option of card section");
	   Thread.sleep(5000);
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> creditCardInfo = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput,creditCardInfo.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput,creditCardInfo.get(0).get("nameOnCard"));
		//clearTextUsingSendKeys(factory.accountPage().expirationMonthInput);
		selectByValue(factory.accountPage().expirationMonthInput,creditCardInfo.get(0).get("expirationMonth"));
		//clearTextUsingSendKeys(factory.accountPage().expirationYearInput);
		selectByValue(factory.accountPage().expirationYearInput,creditCardInfo.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput,creditCardInfo.get(0).get("securityCode") );
		logger.info("user edit information with below data");
		Thread.sleep(5000);
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	    click(factory.accountPage().paymentSubmitBtn);
	    logger.info("user click on Update Your Card button");
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
		logger.info("user is login into account page");
	}


	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() throws InterruptedException {
		click(factory.accountPage().accountPaymentEdit);
		Thread.sleep(4000);
		click(factory.accountPage().removeCreditCard);
		logger.info("User click on remove option of card section");
		Thread.sleep(4000);
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().pageAfterPaymentRemoved));
		logger.info("user is login into account page");
	}
	
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
	    click(factory.accountPage().addAddress);
	    logger.info("User click on Add address option");
	}
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> newAddressInfo = dataTable.asMaps(String.class, String.class);
		selectByValue(factory.accountPage().countrySelect,newAddressInfo.get(0).get("country"));
		Thread.sleep(2000);
		clearTextUsingKeys(factory.accountPage().fullNameInputAdress);
		sendText(factory.accountPage().fullNameInputAdress,newAddressInfo.get(0).get("fullName"));
		Thread.sleep(1000);
		clearTextUsingKeys(factory.accountPage().phoneNumberInputAddress);
		sendText(factory.accountPage().phoneNumberInputAddress,newAddressInfo.get(0).get("phoneNumber"));
		Thread.sleep(5000);
		clearTextUsingKeys(factory.accountPage().streetInputAddress);
		sendText(factory.accountPage().streetInputAddress,newAddressInfo.get(0).get("streetAddress"));
		clearTextUsingKeys(factory.accountPage().apartmentInputAddress);
		sendText(factory.accountPage().apartmentInputAddress,newAddressInfo.get(0).get("apt"));
		clearTextUsingKeys(factory.accountPage().cityInputAddress);
		sendText(factory.accountPage().cityInputAddress,newAddressInfo.get(0).get("city"));
		Thread.sleep(5000);
		selectByValue(factory.accountPage().stateAddressInput,newAddressInfo.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeInputAddress);
		sendText(factory.accountPage().zipCodeInputAddress,newAddressInfo.get(0).get("zipCode") );
		logger.info("user fill new address form with below information");
	}
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	    click(factory.accountPage().addressBtn);
	    logger.info("User clicked Add Your Address button");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.accountPage().addressAddedSuccesfully);
		Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccesfully.getText());
		
	}
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddressButton);
	    logger.info("User click on edit address option");

	}
	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().updateYourAddress);
	    logger.info("User clicked update Your Address button");
	}
	
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillDisappears(factory.accountPage().addressUpdatedSuccessfully);
		
	}
	
	
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() throws InterruptedException {
	    click(factory.accountPage().addressRemoveButton);
	    Thread.sleep(2000);
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addAdressText));
		logger.info("Address details has been removed");
		/*Assert.assertTrue(isElementDisplayed(factory.accountPage().addAdressText));
		logger.info("user is login into account page");*/
	}


	
}
