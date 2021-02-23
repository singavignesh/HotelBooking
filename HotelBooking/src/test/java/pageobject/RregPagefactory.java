package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class RregPagefactory extends BaseClass {
	
	public RregPagefactory()
	{
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id = "location")
	private WebElement location;
	
	
	public WebElement getLocation() {
		return location;
	}
	public void setLocation(WebElement location) {
		this.location = location;
	}
	@FindBy(id = "hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}
	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
			}
	
	@FindBy(id = "room_type")
    private WebElement room_type;

	public WebElement getRoom_type() {
		return room_type;
	}
	public void setRoom_type(WebElement room_type) {
		this.room_type = room_type;
	}	
	@FindBy(id = "room_nos")
	private WebElement room_nos;

	public WebElement getRoom_nos() {
		return room_nos;
	}
	public void setRoom_nos(WebElement room_nos) {
		this.room_nos = room_nos;
	}
	@FindBy(id  = "datepick_in")
	private WebElement datepick_in;

	public WebElement getDatepick_in() {
		return datepick_in;
	}
	public void setDatepick_in(WebElement datepick_in) {
		this.datepick_in = datepick_in;
	}
	@FindBy(id  = "datepick_out")
	private WebElement datepick_out;

	public WebElement getDatepick_out() {
		return datepick_out;
	}
	public void setDatepick_out(WebElement datepick_out) {
		this.datepick_out = datepick_out;
	}
	@FindBy(id  = "adult_room")
	private WebElement adult_room;

	public WebElement getAdult_room() {
		return adult_room;
	}
	public void setAdult_room(WebElement adult_room) {
		this.adult_room = adult_room;
	}
	@FindBy(id  = "child_room")
	private WebElement child_room;

	public WebElement getChild_room() {
		return child_room;
	}
	public void setChild_room(WebElement child_room) {
		this.child_room = child_room;
	}
@FindBy(id = "Submit")
private WebElement Submit;

public WebElement getSubmit() {
	return Submit;
}
public void setSubmit(WebElement submit) {
	Submit = submit;
}
	

}
