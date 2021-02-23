package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class PageRepositiory extends BaseClass {
	public PageRepositiory() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	
	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	@FindBy(id = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	

}
