package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);

}
	@FindBy(xpath = "//a[@id='orderLink']")
	public WebElement orderLink;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]")
	public WebElement showDetails;
	
	@FindBy(xpath ="//button[@id='cancelBtn']")
	public WebElement cancelBtn;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement reasonInput;
	
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement orderCancelBtnReason;
	
	@FindBy(xpath = "//p[contains(text(),'Your Order Has Been Cancelled')")
	public WebElement yourOrderHasBeenCancelled;
	
	@FindBy(xpath = "//button[@id='returnBtn']")
	public WebElement returnButton;
	
	@FindBy(xpath = "//select[@id='dropOffInput']")
	public WebElement dropOffInput;
	
	@FindBy(xpath ="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]")
	public WebElement returnSucess;
	
	@FindBy(css = "#reviewBtn")
	public WebElement reviewButton;
	
	@FindBy(xpath = "//input[@id='headlineInput']")
	public WebElement addReviewheadline;
	
	@FindBy(xpath = "//textarea[@id='descriptionInput']")
	public WebElement reviewDescription;
	
	@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement reviewSubmitButton;
	
	@FindBy(xpath = "//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewAddedSuccess;
	
}