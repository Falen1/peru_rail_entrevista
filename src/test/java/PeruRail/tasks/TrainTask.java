package PeruRail.tasks;

import PeruRail.entidad.PriceEntity;
import cucumber.api.DataTable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.thucydides.core.annotations.Step;
import PeruRail.pages.TrainPage;

public class TrainTask extends BaseTask {

	TrainPage trainPage;
	
	@Step("Selecciono el tren de ida y vuelta")
	public void SeleccionarTrenIdaVuelta(DataTable dt) throws InterruptedException {
		List<Map<String, String>> keys = dt.asMaps(String.class, String.class);
		Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			Map<String, String> stringStringMap = (Map) iterator.next();
			String trenIda = (String) stringStringMap.get("tren_ida");
			String trenVuelta = (String) stringStringMap.get("tren_vuelta");
			ClickElementByXpath(trainPage.xpathLblTrainIda.replace("[TREN]", trenIda));
			ClickElementByXpath(trainPage.xpathLblTrainVuelta.replace("[TREN]", trenVuelta));
		}
		String montoTotalTrain = GetTextFromElement(trainPage.lblTotalTrain).replace("USD", "").trim();
		PriceEntity.set_dolaresAntes(montoTotalTrain);
		ClickElement(trainPage.btnContinuar);
	}
	
	
	

}
