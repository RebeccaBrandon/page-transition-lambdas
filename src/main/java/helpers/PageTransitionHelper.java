package helpers;

import java.util.List;

import org.openqa.selenium.TimeoutException;

public class PageTransitionHelper {
	public static void waitForEitherElement(TransitionalWebElementFunction webElement,
			TransitionalWebElementFunction webElement2, int millisecondsWait) {

		long t = System.currentTimeMillis();
		while (t > System.currentTimeMillis() - millisecondsWait) {

			if (isWebElementVisible(webElement) || isWebElementVisible(webElement2)) {
				return;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

		throw new TimeoutException("Timed out waiting for either element for " + millisecondsWait);
	}
	
	public static void waitForAnyOfThreeElements(
			TransitionalWebElementFunction webElement,
			TransitionalWebElementFunction webElement2,
			TransitionalWebElementFunction webElement3,
			int millisecondsWait) {

		long t = System.currentTimeMillis();
		while (t > System.currentTimeMillis() - millisecondsWait) {

			if (isWebElementVisible(webElement) || 
					isWebElementVisible(webElement2) ||
					isWebElementVisible(webElement3)) {
				return;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

		throw new TimeoutException("Timed out waiting for one of three elements for " + millisecondsWait);
	}

	public static void waitForAnyElement(List<TransitionalWebElementFunction> webElements, int millisecondsWait) {

		long t = System.currentTimeMillis();
		while (t > System.currentTimeMillis() - millisecondsWait) {

			for (int i = 0; i < webElements.size(); i++) {
			
				if (isWebElementVisible(webElements.get(i))) {
					return;
				}
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

		throw new TimeoutException("Timed out waiting for any element of " + webElements.size() + " for " + millisecondsWait);
	}

	private static boolean isWebElementVisible(TransitionalWebElementFunction webElement) {
		try {
			return webElement != null && webElement.isVisible();
		} catch (org.openqa.selenium.NoSuchElementException ex) {
			return false;
		}
	}
}