package co.flysafair.stepdefinition;

import co.flysafair.objectrepositiry.HomePage;
import co.flysafair.resources.FunctionalLibrary;
import cucumber.api.java.en.Given;

public class HomePageSteps extends FunctionalLibrary {
	@Given("The user in home booking flight page")
	public void the_user_in_home_booking_flight_page() {
		HomePage h=new HomePage();
	   click(h.getBookinflight());
	   String t1 = getText(h.getBookinflight());
	   System.out.println(t1);
	   
	}
	
	
}
