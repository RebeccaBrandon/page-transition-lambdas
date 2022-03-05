package pages;

import org.openqa.selenium.By;

import base.BasePage;

public class GoogleHomePagePopup extends BasePage {

	protected By uniqueLocator() {
		return By.xpath("//*[@id=\"junit\"]");
	}

	private By gotIt() {
		return By.xpath("//*[text()='Got it']");
	};
	
	private By acceptTerms() {
		return By.xpath("//*[text()='I agree']");
	};

	public boolean isGotItVisible()
	{
		return driver().isElementDisplayed(gotIt());
	}

	public boolean isAcceptTermsVisible()
	{
		return driver().isElementDisplayed(acceptTerms());
	}
}