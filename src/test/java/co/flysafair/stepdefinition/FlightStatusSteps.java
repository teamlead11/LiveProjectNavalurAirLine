package co.flysafair.stepdefinition;

import co.flysafair.objectrepositiry.FlightStatusPage;
import co.flysafair.resources.FunctionalLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightStatusSteps extends FunctionalLibrary {
	@When("ther user click the trip way")
	public void ther_user_click_the_trip_way() {

		FlightStatusPage f = new FlightStatusPage();
		click(f.getFlighttype());
		//click(f.getDepartclick());
	}

	@When("the user enter valid origin and destination detail {string},{string}")
	public void the_user_enter_valid_origin_and_destination_detail(String string, String string2) {
		FlightStatusPage f = new FlightStatusPage();
		selectByText(f.getDepartinSelect(), string);
		selectByText(f.getDepartoutSelect(), string2);

	}

	@When("the user enter valid Date to travel")
	public void the_user_enter_valid_Date_to_travel() {
		FlightStatusPage f = new FlightStatusPage();
		webtable("26");
		click(f.getDateDoneClick());

	}

	@When("the user select the count of passenger")
	public void the_user_select_the_count_of_passenger() {
		FlightStatusPage f = new FlightStatusPage();
		click(f.getPassengerCount());
		click(f.getPlusClick());

	}

	@Then("the user click the find flight button to view list of flight")
	public void the_user_click_the_find_flight_button_to_view_list_of_flight() {
		FlightStatusPage f = new FlightStatusPage();
		click(f.getFindFlight());
	}

}
