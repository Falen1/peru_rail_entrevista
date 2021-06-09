package PeruRail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;

public class ConfirmationAndPaymentPage extends PageObject {

	@FindBy(xpath = "//section[@id='compra']/a")	public WebElement btnResumenCompra;
	@FindBy(id = "priceUSDrc")						public WebElement lblTotalUSD;
	@FindBy(id = "visa")							public WebElement rbVisa;

}
