package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.WebSetup;
import java.time.Duration;

public class BasePage {
	public WebDriver getWebDriver() {
		return WebSetup.getInstance().initDriver();
	}
	
	public void loadPage(String base_url) {
		getWebDriver().get(base_url);
	}

	public WebElement waitForElementToBeVisible(By webElement, int timeOutInSeconds) {
		//ExtentTestManager.getTest().info("Waiting for elements to be present " + webElement.toString());
		WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(timeOutInSeconds));
		return (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));
	}
	
	public void clickElement(WebElement element) {
		element.click();
	}

	public void sendKeysToElement(WebElement element, String keys) {
		element.clear();
		element.sendKeys(keys);
	}
	
	public String getElementText(WebElement element) {
		return element.getText();
	}

}
