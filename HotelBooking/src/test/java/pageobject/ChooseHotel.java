package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class ChooseHotel extends BaseClass {
	public ChooseHotel() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}
	public void setRadiobutton_0(WebElement radiobutton_0) {
		this.radiobutton_0 = radiobutton_0;
	}
	@FindBy(id = "continue")
	private WebElement Continue;
	public WebElement getContinue() {
		return Continue;
	}
	public void setContinue(WebElement continue1) {
		Continue = continue1;
	}


}
