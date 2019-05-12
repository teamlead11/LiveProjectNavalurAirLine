package co.flysafair.objectrepositiry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.flysafair.resources.FunctionalLibrary;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	@FindBy(xpath = "(//a[text()='Flight Status'])[1]")
	private WebElement lnk_flightStatus;

	public WebElement getLnk_flightStatus() {
		return lnk_flightStatus;
	}

}
