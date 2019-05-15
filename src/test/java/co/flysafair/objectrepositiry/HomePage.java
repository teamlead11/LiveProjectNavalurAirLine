package co.flysafair.objectrepositiry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.flysafair.resources.FunctionalLibrary;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
/*	@FindBy(xpath = "(//a[@aria-controls='flight']")
	private WebElement lnk_flight;

	public WebElement getLnk_flight() {
		return lnk_flight;
	}*/
	@FindBy(xpath = "(//a[text()='Flight Status'])[1]")
	private WebElement lnk_flightStatus;

	public WebElement getLnk_flightStatus() {
		return lnk_flightStatus;
	}
	@FindBy(xpath = "//input[@id='rdOneway']")
	private WebElement lnk_OnewayRadio;

	public WebElement getLnk_OnewayRadio() {
		return lnk_OnewayRadio;
	}
	@FindBy(xpath = "//input[@id='rdRoundTrip']")
	private WebElement lnk_TwowayRadio;

	public WebElement getLnk_TwowayRadio() {
		return lnk_TwowayRadio;
	}
	@FindBy(id = "departureCityDrop")
	private WebElement lnk_departureCityDrop;

	public WebElement getLnk_departureCityDrop() {
		return lnk_departureCityDrop;
	}
	@FindBy(id = "arrivalCityDrop")
	private WebElement lnk_arrivalCityDrop;

	public WebElement getLnk_arrivalCityDrop() {
		return lnk_arrivalCityDrop;
	}
	@FindBy(xpath = "//input[@id='departureDate']")
	private WebElement lnk_departureDate;

	public WebElement getLnk_departureDate() { 
		return lnk_departureDate;
	}
	

	@FindBy(xpath = "//input[@id='returnDate']")
	private WebElement lnk_returnDate;

	public WebElement getLnk_returnDate() {
		return lnk_returnDate;
	}
	@FindBy(xpath = "//select [@id='infants']")
	private WebElement lnk_infants;

	public WebElement getlnk_infants() {
		return lnk_infants;
	}
	@FindBy(xpath = "//select [@id='children']")
	private WebElement lnk_children;

	public WebElement getLnk_children() {
		return lnk_children;
	}
	@FindBy(name = "searchButton")
	private WebElement lnk_searchButton;

	public WebElement getLnk_searchButton() {
		return lnk_searchButton;
	}
	@FindBy(xpath = "//div[contains(@class, 'button active' )]")
	private WebElement lnk_adultButton;

	public WebElement getLnk_adultButton() {
		return lnk_adultButton;
	}
	@FindBy(xpath = "//option[@value='26']")
	private WebElement lnk_dateCalender;

	public WebElement getLnk_dateCalender() {
		return lnk_dateCalender;
	}
}
