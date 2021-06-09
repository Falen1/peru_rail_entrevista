package PeruRail.tasks;

import PeruRail.pages.PassengersDataPage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class PassengersDataTask extends BaseTask {

	PassengersDataPage passengersDataPage;

	@Step("completo datos del pasajero")
	public void CompletarDatosCabina(DataTable dt) {

		List<Map<String, String>> keys = dt.asMaps(String.class, String.class);
		Iterator iterator = keys.iterator();
		int contador = 1;
		while (iterator.hasNext()) {

			if (contador != 1)
				ClickElementByXpath(
						passengersDataPage.xpathTituloPasajero.replace("[INDICE]", String.valueOf(contador)));

			Map<String, String> stringStringMap = (Map) iterator.next();
			String nombre = (String) stringStringMap.get("nombre");
			String apellido = (String) stringStringMap.get("apellido");
			String nacionalidad = (String) stringStringMap.get("nacionalidad");
			String tipoDocumento = (String) stringStringMap.get("tipo_doc");
			String numeroDocumento = (String) stringStringMap.get("numero_doc");
			String sexo = (String) stringStringMap.get("sexo");
			String telefono = (String) stringStringMap.get("telefono");
			String email = (String) stringStringMap.get("email");
			String recieveOffers = (String) stringStringMap.get("recieve_offers");

			SendKeysByXpath(passengersDataPage.xpathTxtNombre.replace("[INDICE]", String.valueOf(contador)), nombre);
			SendKeysByXpath(passengersDataPage.xpathTxtApellido.replace("[INDICE]", String.valueOf(contador)),
					apellido);

			ClickElementByXpath(passengersDataPage.xpathTxtFecNac.replace("[INDICE]", String.valueOf(contador)));
			ClickElementByXpath(passengersDataPage.xpathFecNacOpcion1);

			SelectComboTextByXpath(
					passengersDataPage.xpathCboNacionalidad.replace("[INDICE]", String.valueOf(contador)),
					nacionalidad);
			SelectComboTextByXpath(passengersDataPage.xpathCboTipoDoc.replace("[INDICE]", String.valueOf(contador)),
					tipoDocumento);

			SendKeysByXpath(passengersDataPage.xpathTxtNumeroDoc.replace("[INDICE]", String.valueOf(contador)),
					numeroDocumento);

			SelectComboTextByXpath(passengersDataPage.xpathCboSexo.replace("[INDICE]", String.valueOf(contador)), sexo);
			SendKeysByXpath(passengersDataPage.xpathTxtTelefono.replace("[INDICE]", String.valueOf(contador)),
					telefono);
			SendKeysByXpath(passengersDataPage.xpathTxtEmail.replace("[INDICE]", String.valueOf(contador)), email);
			SendKeysByXpath(passengersDataPage.xpathTxtConfirmEmail.replace("[INDICE]", String.valueOf(contador)),
					email);

			if (recieveOffers.equals("true")) {
				ClickElementByXpath(
						passengersDataPage.xpathChkRecieveOffers.replace("[INDICE]", String.valueOf(contador)));
			}

			contador++;
		}

	}

	@Step("Doy click a Continue")
	public void Continuar() {
		ClickElement(passengersDataPage.btnContinuar);
	}

}
