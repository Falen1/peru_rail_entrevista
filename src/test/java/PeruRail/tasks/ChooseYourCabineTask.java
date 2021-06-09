package PeruRail.tasks;

import PeruRail.entidad.PriceEntity;
import PeruRail.pages.ChooseYourCabinePage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class ChooseYourCabineTask extends BaseTask {

	ChooseYourCabinePage chooseYourCabinePage;

	@Step("completo datos de cabina")
	public void CompletarDatosCabina(DataTable dt) {

		List<Map<String, String>> keys = dt.asMaps(String.class, String.class);
		Iterator iterator = keys.iterator();

		while (iterator.hasNext()) {

			Map<String, String> stringStringMap = (Map) iterator.next();
			String tipoCabina = (String) stringStringMap.get("tipo_cabina");
			String cantidadCabinas = (String) stringStringMap.get("cantidad_cabinas");
			String adultos = (String) stringStringMap.get("adultos");
			String ninos = (String) stringStringMap.get("ninos");
			
			MoveToElementByXpath(chooseYourCabinePage.xpathLblCabina.replace("[CABINA]", tipoCabina));
			SelectComboValueByXpath(chooseYourCabinePage.xpathCboCabina.replace("[CABINA]", tipoCabina),
					cantidadCabinas);
			SelectComboTextByXpath(chooseYourCabinePage.xpathCantidadAdultos.replace("[CABINA]", tipoCabina), adultos);

			if (!cantidadCabinas.equals("1"))
				SelectComboTextByXpath(chooseYourCabinePage.xpathCantidadNinos.replace("[CABINA]", tipoCabina), ninos);
		}

		String montoTotalDolares = GetTextFromElement(chooseYourCabinePage.lblTotalDolares);

		PriceEntity.set_dolaresAntes(montoTotalDolares);
		
	}

	@Step("Doy click a Continue")
	public void Continuar() {
		ClickElement(chooseYourCabinePage.btnContinuar);
	}

}
