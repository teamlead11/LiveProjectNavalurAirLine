package co.flysafair.stepdefinition;

import co.flysafair.resources.FunctionalLibrary;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	@Before
	public static void beforeMethod() {
		FunctionalLibrary.driverInit("Chrome");
	}

	@After
	public static void aftermethod() {
		FunctionalLibrary.closeBrowser();
		FunctionalLibrary.quitBrowser();
	}

}
