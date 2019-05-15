package co.flysafair.stepdefinition;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import co.flysafair.objectrepositiry.HomePage;
import co.flysafair.resources.FunctionalLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends FunctionalLibrary {
	HomePage home = new HomePage();
	@Given("The user is in flight status page")
	
	public void the_user_is_in_flight_status_page() {
		HomePage home = new HomePage();
		click(home.getLnk_flightStatus());
	}
	@Given("The user is in Home page")
	public void the_user_is_in_Home_page() {
		click(home.getLnk_flight());
	}

	@When("The user fill in all the details")
	public void the_user_fill_in_all_the_details() {
		click(home.getLnk_OnewayRadio());
		selectByIndex(home.getLnk_departureCityDrop(), 3);
		selectByIndex(home.getLnk_arrivalCityDrop(), 2);
		click(home.getLnk_adultButton());
		selectByIndex(home.getLnk_children(), 3);
		selectByIndex(home.getLnk_departureCityDrop(), 3);
		webtable("26");
		click(home.getLnk_departureDate());
		//click(home. getLnk_departureDate());
		//String a = getCurrentDateMMMDDYYYY();
		//a(home.getLnk_departureDate(),"05272019");
		
		click(home.getLnk_searchButton());


	}
	
	
}
