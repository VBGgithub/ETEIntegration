package TestPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void function() {
		System.setProperty("webdriver.chrome.driver",
				"I:\\IMP Backup\\05_Vrinda Office data\\Cogniwise\\Training\\Drivers\\chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://www.google.com");
		browser.quit();
	}
}
