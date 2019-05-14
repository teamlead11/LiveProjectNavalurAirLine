package co.flysafair.objectrepositiry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.flysafair.resources.FunctionalLibrary;

public class FlightStatusPage {

	public FlightStatusPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	@FindBy(xpath="(//div[@id='book'])[1]//ul")
	private WebElement flighttype;
	@FindBy(xpath="(//div[@class='city-code'])[1]")
	private WebElement Departclick;
	@FindBy(xpath="//div[@id='destinations-list-outbound']//li//div")
	private WebElement DepartinSelect;
	@FindBy(xpath="//div[@id='destinations-list-inbound']//div")
	private WebElement DepartoutSelect;
	@FindBy(xpath="(//table[@class='ui-datepicker-calendar'])[1]")
	private WebElement DateSelect;
	@FindBy(xpath="//button[text()='Done']")
	private WebElement DateDoneClick;
	@FindBy(xpath="(//div[text()='Passengers'])[1]")
	private WebElement PassengerCount;
	@FindBy(xpath="(//i[@class='fa fa-minus'])[1]")
	private WebElement MinusClick;
	@FindBy(xpath="(//i[@class='fa fa-plus'])[1]")
	private WebElement PlusClick;
	@FindBy(xpath="(//button[@class='btn btn-viablue find-flight-btn'])[1]")
	private WebElement FindFlight;
	public WebElement getFlighttype() {
		return flighttype;
	}
	public WebElement getDepartclick() {
		return Departclick;
	}
	public WebElement getDepartinSelect() {
		return DepartinSelect;
	}
	public WebElement getDepartoutSelect() {
		return DepartoutSelect;
	}
	public WebElement getDateSelect() {
		return DateSelect;
	}
	public WebElement getDateDoneClick() {
		return DateDoneClick;
	}
	public WebElement getPassengerCount() {
		return PassengerCount;
	}
	public WebElement getMinusClick() {
		return MinusClick;
	}
	public WebElement getPlusClick() {
		return PlusClick;
	}
	public WebElement getFindFlight() {
		return FindFlight;
	}


}
