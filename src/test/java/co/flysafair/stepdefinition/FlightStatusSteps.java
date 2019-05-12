package co.flysafair.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import co.flysafair.objectrepositiry.FlightStatusPage;
import co.flysafair.resources.FunctionalLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightStatusSteps extends FunctionalLibrary {

	@When("The user search with flight number {string}")
	public void the_user_search_with_flight_number(String flightNumber) {
		FlightStatusPage flightstatus = new FlightStatusPage();
		setText(flightstatus.getTxt_flightNumber(), flightNumber);
		click(flightstatus.getBtn_search());

	}

	@Then("The user should see only one search result")
	public void the_user_should_see_only_one_search_result() {
		FlightStatusPage flightstatus = new FlightStatusPage();
		List<WebElement> results = flightstatus.getTbl_flightSearchResult().findElements(By.tagName("tr"));
		Assert.assertEquals(1, results.size());
	}
}
