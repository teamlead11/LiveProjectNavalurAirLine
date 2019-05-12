package co.flysafair.objectrepositiry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.flysafair.resources.FunctionalLibrary;

public class FlightStatusPage {

	public FlightStatusPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Flight Number']")
	private WebElement txt_flightNumber;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement btn_search;

	@FindBy(xpath = "//table[@class='table status-table status-table-desktop']")
	private WebElement tbl_flightSearchResult;

	public WebElement getTxt_flightNumber() {
		return txt_flightNumber;
	}

	public WebElement getBtn_search() {
		return btn_search;
	}

	public WebElement getTbl_flightSearchResult() {
		return tbl_flightSearchResult;
	}

}
