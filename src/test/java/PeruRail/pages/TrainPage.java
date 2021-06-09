package PeruRail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;

public class TrainPage extends PageObject {

	@FindBy(id = "text_btn_search") 						public WebElement btnBuscar;
	@FindBy(xpath = "//input[@value='Continue']")			public WebElement btnContinuar;
	@FindBy(xpath = "//div[@class='price-dolar']/span[2]")  public WebElement lblTotalTrain;
	
	
	public String xpathLblTrainIda = "(//div[@indTramo='IDA']/div[1][text()='[TREN] ']/../div[contains(@class,'divFila2')])[1]";
	public String xpathLblTrainVuelta = "((//div[@indTramo='RET']/div[1][text()='[TREN]  ']/../div[3])[last()])";
	

	
	
	

}
