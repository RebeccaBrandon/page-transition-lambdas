package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class GoogleHomePage extends BasePage {

	protected By uniqueLocator() {
		return By.id("q");
	}

	private By query() {
		return uniqueLocator();
	};

	public boolean isQueryVisible()
	{
		return driver().isElementDisplayed(query());
	}
}