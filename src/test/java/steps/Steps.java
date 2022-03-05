package steps;

import helpers.AppConfig;
import io.cucumber.java.en.Given;
import pageTransitions.ArriveOnGoogleHomepageTransition;
import pages.GoogleHomePage;
import pages.GoogleHomePagePopup;

public class Steps {
	
	public GoogleHomePage googleHomePage;
	public GoogleHomePagePopup googleHomePagePopup;
	public AppConfig appConfig;
	
	public Steps(GoogleHomePage googleHomePage, GoogleHomePagePopup googleHomePagePopup, AppConfig appConfig)
	{
		this.googleHomePage = googleHomePage;
		this.googleHomePagePopup = googleHomePagePopup;
		this.appConfig = appConfig;
	}
	
	@Given("I load the Google homepage")
	public void i_open_a_browser() {
		
		googleHomePage.goToUrl(appConfig.getSetting("googleUrl"));
		ArriveOnGoogleHomepageTransition transition = new ArriveOnGoogleHomepageTransition();
		transition.waitForLoad(googleHomePage, googleHomePagePopup);
	}
}