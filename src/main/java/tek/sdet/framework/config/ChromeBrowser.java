package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser implements Browser {
	public WebDriver openBrowser(String url) {
		//System.setProperty("webdriver.chrome.driver","./src/test/resources/driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get(url);
		return driver;
	}	
}
