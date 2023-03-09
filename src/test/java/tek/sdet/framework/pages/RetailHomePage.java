package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	@FindBy(xpath = "//select[@id='search']")
	public WebElement allDepartmentDropDown;
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton;
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	@FindBy(id = "cartBtn")
	public WebElement cartButton;
	@FindBy(xpath = "//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	@FindBy(xpath = "//a[text()='Account']")
	public WebElement accountOptions;
	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;

	@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;

	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;

	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computersSideBar;

	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;

	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sportsSideBar;

	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automativeSideBar;

	@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;

	@FindBy(xpath = "//select[@id='search']")
	public WebElement searchHomeBar;
	
	@FindBy(xpath = " //h1[@id='contentHeader']")
	public WebElement contentHeader;
	
	@FindBy(xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement smartPlug;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	public WebElement addQuantity;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	public WebElement addToCart;
	
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQuantiyUpdate;
	
	@FindBy(xpath = "//p[contains(text(),'Cart')]")
	public WebElement cartClickButton;
	
	@FindBy(xpath = "//button[@id='proceedBtn']")
	public WebElement checkoutButton;
	
	@FindBy(xpath = "//button[@id='addAddressBtn']")
	public WebElement addAddressBtn;
	
	@FindBy(xpath = "//button[@id='addPaymentBtn']")
	public WebElement addPaymentBtn;
	
	@FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = " //div[contains(text(),'Order Placed Successfully')]")
	public WebElement orderPlacedSuccessfully;
	
	@FindBy(xpath ="//p[contains(text(),'Apex Legends - 1,000 Apex Coins')]")
	public WebElement apexLegends;
	
	@FindBy(css = "div.main-container div:nth-child(1) div.bg-gray-100 div.products > div.products__layout")
	public WebElement objectToClick;
}
