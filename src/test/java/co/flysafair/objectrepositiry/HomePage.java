package co.flysafair.objectrepositiry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.flysafair.resources.FunctionalLibrary;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	@FindBy(xpath="//div[text()='Search your flight']")
	private WebElement searchflight;
	@FindBy(xpath="//div[@id='arprt-lst-cntnt_ORIGIN']//div")
	private WebElement departure;
	@FindBy(xpath="//div[@id='arprt-lst-cntnt_DESTINATION']//div")
	private WebElement destination;
	@FindBy(xpath="//td[@data-month='\"+month+\"' and @data-year='\"+year+\"']//following::a[text()='\"+date+\"']")
	private WebElement fromdate;
	@FindBy(xpath="\"//td[@data-month='\"+month+\"' and @data-year='\"+year+\"']//following::a[text()='\"+date+\"']\"")
	private WebElement todate;
	@FindBy(xpath="//div[@id='lst-cntnt_searcher-passengers-adults']//div")
	private WebElement adults;
	@FindBy(xpath="//div[@id='lst-cntnt_searcher-passengers-children']//div")
	private WebElement minors;
	@FindBy(xpath="//div[@id='lst-cntnt_searcher-passengers-seniors']//div")
	private WebElement seniors;
	@FindBy(xpath="//span[@id='currency-selection']//ul//li")
	private WebElement currency;
	@FindBy(xpath="//a[text()='Search my flight']")
	private WebElement clicksearchflight;
	

}
