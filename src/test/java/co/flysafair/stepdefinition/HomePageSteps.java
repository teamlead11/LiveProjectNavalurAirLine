package co.flysafair.stepdefinition;

import co.flysafair.objectrepositiry.HomePage;
import co.flysafair.resources.FunctionalLibrary;
import cucumber.api.java.en.Given;

public class HomePageSteps extends FunctionalLibrary {
	@Given("The user is in flight status page")
	public void the_user_is_in_flight_status_page() {
		HomePage home = new HomePage();
		click(home.getLnk_flightStatus());
	}

}
