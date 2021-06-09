package PeruRail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;

public class PassengersDataPage extends PageObject {

	@FindBy(id = "btnContinuarPas")
	public WebElement btnContinuar;

	public String xpathTxtNombre = "//input[@id='txt_nombre[suite][cab1][[INDICE]]']";
	public String xpathTxtApellido = "//input[@id='txt_apellido[suite][cab1][[INDICE]]']";
	public String xpathTxtFecNac = "//input[@id='txt_fecha_nacimiento[suite][cab1][[INDICE]]']";
	public String xpathFecNacOpcion1 = "//td[@data-handler='selectDay']/a[text()='1']";
	
	public String xpathCboNacionalidad = "//select[@id='sel_nacion[suite][cab1][[INDICE]]']";
	public String xpathCboTipoDoc = "//select[@id='sel_tpdoc[suite][cab1][[INDICE]]']";
	public String xpathTxtNumeroDoc = "//input[@id='txt_nroid[suite][cab1][[INDICE]]']";
	public String xpathCboSexo = "//select[@id='sel_sexo[suite][cab1][[INDICE]]']";
	public String xpathTxtTelefono = "//input[@id='txt_telefono[suite][cab1][[INDICE]]']";
	public String xpathTxtEmail = "//input[@id='txt_mail[suite][cab1][[INDICE]]']";
	public String xpathTxtConfirmEmail = "//input[@id='txt_mail_conf[suite][cab1][[INDICE]]']";
	public String xpathChkRecieveOffers = "//input[@id='chk_ofertas[suite][cab1][[INDICE]]']";
	
	public String xpathTituloPasajero = "//div[contains(text(),'PASSENGER [INDICE]')]";

}
