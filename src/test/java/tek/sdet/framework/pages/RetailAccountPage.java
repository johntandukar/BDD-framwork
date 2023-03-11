package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
}
	@FindBy(xpath="//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement profilePhoneNumberField;
	
	@FindBy(xpath ="//button[text() = 'Update']")
	public WebElement profileUpdateButton;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;
	
	@FindBy(id ="previousPasswordInput")
	public WebElement previousPasswordInput;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordInput;
	 @FindBy(id ="confirmPasswordInput")
	 public WebElement confirmPasswordInput;
	 
	 @FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	 public WebElement changePasswordButton;
	 
	 @FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
	 public WebElement addAPaymentMethod;
	 
	 @FindBy(id = "cardNumberInput")
	 public WebElement cardNumberInput;
	 
	 @FindBy(id = "nameOnCardInput")
	 public WebElement nameOnCardInput;
	 
	 @FindBy(id = "expirationMonthInput")
	 public WebElement expirationMonthInput;
	 
	 @FindBy(id = "expirationYearInput")
	 public WebElement expirationYearInput;
	 
	 @FindBy(xpath = "//input[@id='securityCodeInput']")
	 public WebElement securityCodeInput;
	 
	 @FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	 public WebElement paymentSubmitBtn;
	 
	 @FindBy(xpath = "//button[contains(text(),'Edit')]")
	 public WebElement editButtonCreditCard;
	 
	 @FindBy(xpath = "//button[contains(text(),'remove')]")
	 public WebElement removeCreditCard;
	 
	 @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
	 public WebElement accountPaymentEdit;
	 
	 @FindBy(xpath = "//div[@class='account__address-new']")
	 public WebElement addAddress;
	 
	 @FindBy(id = "countryDropdown")
	 public WebElement countrySelect;
	 
	 @FindBy(id ="fullNameInput")
	 public WebElement fullNameInputAdress;
	 
	 @FindBy(id = "phoneNumberInput")
	 public WebElement phoneNumberInputAddress;
	 
	 @FindBy(id = "streetInput")
	 public WebElement streetInputAddress;
	 
	 @FindBy(id = "apartmentInput")
	 public WebElement apartmentInputAddress;
	 
	 @FindBy(id = "cityInput")
	 public WebElement cityInputAddress;
	 
	 @FindBy(xpath ="//select[@name='state']")
	 public WebElement stateAddressInput;
	 
	 @FindBy(id = "zipCodeInput")
	 public WebElement zipCodeInputAddress;
	 
	 @FindBy(id = "addressBtn")
	 public WebElement addressBtn;
	 
	 @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/button[1]")
	 public WebElement editAddressButton;
	 
	 @FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	 public WebElement addressAddedSuccesfully;
	
	 @FindBy(xpath = "//button[@id='addressBtn']")
	 public WebElement updateYourAddress;
	 
	 @FindBy(xpath = "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressUpdatedSuccessfully;

	 @FindBy(xpath ="//button[contains(text(),'Remove')]")
	 public WebElement addressRemoveButton;
	 
	 @FindBy(xpath = "//h1[contains(text(),'Your Addresses')]")
	 public WebElement addAdressText;
	 
	 
	@FindBy(xpath = "//div[contains(text(),'Password Updated Successfully')]")
	public WebElement passwordUpdatedSuccessfully;
	
	@FindBy(xpath = "//h1[contains(text(),'Cards & Accounts')]")
	public WebElement pageAfterPaymentRemoved;
	 
	 
}