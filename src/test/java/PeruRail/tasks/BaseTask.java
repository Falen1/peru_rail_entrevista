package PeruRail.tasks;

import PeruRail.pages.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTask {

	MainPage mainPage;
	private WebDriverWait wait;

	public void ClickElement(WebElement element) {
		wait = new WebDriverWait(mainPage.getDriver(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void ClickElementByXpath(String xpathString) {
		wait = new WebDriverWait(mainPage.getDriver(), 30);
		wait.until(
				ExpectedConditions.elementToBeClickable(mainPage.getDriver().findElement(By.xpath(xpathString))))
				.click();

	}

	public void SendKeys(WebElement element, String text) {
		wait = new WebDriverWait(mainPage.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
	}

	public void SendKeysByXpath(String xpathString, String text) {
		wait = new WebDriverWait(mainPage.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(mainPage.getDriver().findElement(By.xpath(xpathString))))
				.sendKeys(text);
	}

	public void SelectCombo(WebElement element, String option) {
		wait = new WebDriverWait(mainPage.getDriver(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Select cboDestino = new Select(element);
		cboDestino.selectByVisibleText(option);

	}

	public void SelectComboTextByXpath(String xpathString, String option) {
		wait = new WebDriverWait(mainPage.getDriver(), 30);
		wait.until(
				ExpectedConditions.elementToBeClickable(mainPage.getDriver().findElement(By.xpath(xpathString))))
				.click();
		mainPage.getDriver().findElement(By.xpath(xpathString + "/option[text()='" + option + "']")).click();
	}

	public void SelectComboValueByXpath(String xpathString, String option) {
		wait = new WebDriverWait(mainPage.getDriver(), 30);

		wait.until(
				ExpectedConditions.elementToBeClickable(mainPage.getDriver().findElement(By.xpath(xpathString))))
				.click();
		mainPage.getDriver().findElement(By.xpath(xpathString + "/option[@value='" + option + "']")).click();
	}

	public String GetTextFromElement(WebElement element) {
		wait = new WebDriverWait(mainPage.getDriver(), 30);
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();
	}

	public void WaitForElement(WebElement element) {
		wait = new WebDriverWait(mainPage.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void MoveToElementByXpath(String xpathString) {
		wait = new WebDriverWait(mainPage.getDriver(), 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(mainPage.getDriver().findElement(By.xpath(xpathString))));
		
		Actions actions = new Actions(mainPage.getDriver());
		actions.moveToElement(element);
		
		
		JavascriptExecutor js = (JavascriptExecutor) mainPage.getDriver();
		js.executeScript("window.scrollBy(0,1000)");
	
		
	}
}
