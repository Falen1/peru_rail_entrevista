package PeruRail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;

public class SearchPage extends PageObject {

	public final String rbOpcionTipoViajeXpath = "//input[@name='tipo-de-viaje']/../label";
	public final String rbSoloIdaXpath = "//input[@name='tipo-de-viaje']/../label[text()='One Way']";
	public final String rbIdaVueltaXpath = "//input[@name='tipo-de-viaje']/../label[text()='Round trip']";

	@FindBy(id = "destinoSelect")			public WebElement cboDestino;
	@FindBy(id = "salida")					public WebElement txtFechaSalida;
	@FindBy(id = "regreso")					public WebElement txtFechaRegreso;
	@FindBy(id = "rutaSelect")				public WebElement cboRuta;
	@FindBy(id = "cbTrenSelect")			public WebElement cboTren;
	@FindBy(id = "btn_search")				public WebElement btnBuscar;
	@FindBy(xpath = rbOpcionTipoViajeXpath)	public WebElement rbOpcionTipoViaje;
	@FindBy(xpath = rbSoloIdaXpath) 		public WebElement rbSoloIda;
	@FindBy(xpath = rbIdaVueltaXpath)		public WebElement rbIdaVuelta;


	public String xpathCboRuta = "//select[@id='rutaSelect']";
	public String xpathCboTren = "//select[@id='cbTrenSelect']";
	public String xpathFechaSalida = "(//td[@data-handler='selectDay'])[3]";
	public String xpathFechaIdaVueltaSalida = "//td[@data-handler='selectDay']/a[text()='13']";
	public String xpathFechaIdaVueltaRegreso = "//td[@data-handler='selectDay']/a[text()='20']";
	

}
