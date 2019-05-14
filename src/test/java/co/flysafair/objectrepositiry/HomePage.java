package co.flysafair.objectrepositiry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.flysafair.resources.FunctionalLibrary;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	@FindBy(xpath="//span[text()='BOOK A FLIGHT']")
	private WebElement bookinflight;
	public WebElement getBookinflight() {
		return bookinflight;
	}

}
