package pageexecution;

import pageobject.ChooseHotel;
import pageobject.PageRepositiory;
import pageobject.PaymentDetails;
import pageobject.RregPagefactory;
import utils.BaseClass;

public class PageExecution extends BaseClass{
	
	public static void main(String[] args) {
	
		initdriver("chrome");
		loadUrl("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		PageRepositiory h1 = new PageRepositiory();
		type(h1.getUsername(),"singavignesh");
		type(h1.getPassword(),"nithya04");
		submit(h1.getLogin());
		RregPagefactory h2 = new RregPagefactory();
		select(h2.getLocation(),5);
		select(h2.getHotels(),2);
		select(h2.getRoom_type(),4);
		select(h2.getRoom_nos(),10);
		type(h2.getDatepick_in(),"29/07/2020");
		type(h2.getDatepick_out(),"30/07/2020");
		select(h2.getAdult_room(),4);
		select(h2.getChild_room(),2);
		submit(h2.getSubmit());
	    ChooseHotel h3 = new ChooseHotel();
	    submit(h3.getRadiobutton_0());
	    submit(h3.getContinue());
	    PaymentDetails h4 = new PaymentDetails();
	    type(h4.getFirst_name(), "singavignesh");
	    type(h4.getLast_name(),"kalaiselvan");
	    type(h4.getAddress(),"Chennai");
	    type(h4.getCc_num(), "0123456789111213");
	    select(h4.getCc_type(),4);
	    select(h4.getCc_exp_month(),2);
	    select(h4.getCc_exp_year(),10);
	    type(h4.getCc_cvv(),"042");
	    submit(h4.getBook_now());
	    
	    
		
	

}
}