package co.flysafair.objectrepositiry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.flysafair.resources.FunctionalLibrary;

public class DepartingFlightsPage {
	public DepartingFlightsPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	@FindBy(xpath = "//div[contains(@class, 'availability-day' )]")
	private boolean lnk_departingFlights;

	public  boolean getLnk_departingFlights() {
		return lnk_departingFlights;
	}
}
