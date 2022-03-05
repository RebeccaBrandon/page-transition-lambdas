package pageTransitions;

import helpers.PageTransitionHelper;
import helpers.TransitionalWebElementFunction;
import pages.GoogleHomePage;
import pages.GoogleHomePagePopup;

public class ArriveOnGoogleHomepageTransition
{
	public void waitForLoad(GoogleHomePage googleHomePage, GoogleHomePagePopup googleHomePagePopup)
	{
		TransitionalWebElementFunction isQueryVisible = () -> googleHomePage.isQueryVisible();
		TransitionalWebElementFunction isGotItVisible = () -> googleHomePagePopup.isGotItVisible();
		TransitionalWebElementFunction acceptTerms = () -> googleHomePagePopup.isAcceptTermsVisible();		

		PageTransitionHelper.waitForAnyOfThreeElements(
				isQueryVisible,
				isGotItVisible,
				acceptTerms,
			    12000);
	}

}