package PeruRail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;

public class ChooseYourCabinePage extends PageObject {

	@FindBy(id = "continuar_bae")	public WebElement btnContinuar;
	@FindBy(id = "priceUSD") 		public WebElement lblTotalDolares;
	
	public String xpathLblCabina = "//h3[text()='[CABINA]']";
	public String xpathCboCabina = "//h3[text()='[CABINA]']/../../div[@class='calculo-cabina']/div/div/select";
	public String xpathCantidadAdultos ="//h3[text()='[CABINA]']/../../div[@class='calculo-cabina']/div/div/div/div/div/div[contains(@class,'adults')]/select";
	public String xpathCantidadNinos ="//h3[text()='[CABINA]']/../../div[@class='calculo-cabina']/div/div/div/div/div/div[contains(@class,'children')]/select";

}
