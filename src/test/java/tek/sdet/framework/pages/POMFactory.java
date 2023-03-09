package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory  extends BaseSetup{
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetailAccountPage accountPage;
	private RetailOrderPage orderPage;
	
	public POMFactory() {
		this.accountPage =new RetailAccountPage();
		this.homePage = new RetailHomePage();
		this.orderPage = new RetailOrderPage();
		this.signInPage = new RetailSignInPage();
		
		
	}
	 public RetailHomePage homePage() {
		 return this.homePage;
	 }
	 public RetailSignInPage signInPage() {
		 return this.signInPage;
	 }
	 public RetailAccountPage accountPage() {
		 return this.accountPage;
	 }
	 public RetailOrderPage orderPage() {
		 return this.orderPage;
	 }
}
