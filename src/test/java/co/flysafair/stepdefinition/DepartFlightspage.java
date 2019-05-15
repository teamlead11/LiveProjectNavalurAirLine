package co.flysafair.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import co.flysafair.objectrepositiry.DepartingFlightsPage;
import co.flysafair.objectrepositiry.FlightStatusPage;
import co.flysafair.resources.FunctionalLibrary;
import cucumber.api.java.en.Then;

public class DepartFlightspage extends FunctionalLibrary{
	@Then("The user should see the list of available flights")
	public void the_user_should_see_the_list_of_available_flights() {
		DepartingFlightsPage DepFlights = new DepartingFlightsPage();
		Assert.assertTrue(DepFlights.getLnk_departingFlights());
}
}