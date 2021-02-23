package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
		
	public static void initdriver(String browser) {
	if (browser.equals("Crhome"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void loadUrl (String url) {
		driver.get(url);
	
	}
	public static void type(WebElement element, String data) {
		element.sendKeys(data);
			}
public static void submit (WebElement element) {
	element.click();
}
public static void select (WebElement element, int data) {
	Select n = new Select(element); 
	n.selectByIndex(data);
		
	}


}
