package PeruRail.tasks;

import PeruRail.pages.SearchPage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class SearchTask extends BaseTask {

	SearchPage busquedaInicialPage;

	@Step("busco viaje solo ida")
	public void BuscarViajeSoloIda(DataTable dt) {

		List<Map<String, String>> keys = dt.asMaps(String.class, String.class);
		Iterator iterator = keys.iterator();

		String destino = null, ruta = null, tren = null;

		while (iterator.hasNext()) {
			Map<String, String> stringStringMap = (Map) iterator.next();
			destino = (String) stringStringMap.get("destino");
			ruta = (String) stringStringMap.get("ruta");
			tren = (String) stringStringMap.get("tren");
		}

		ClickElement(busquedaInicialPage.rbSoloIda);
		SelectCombo(busquedaInicialPage.cboDestino, destino);
		SelectComboTextByXpath(busquedaInicialPage.xpathCboRuta, ruta);

		if (!tren.equals(""))
			SelectComboTextByXpath(busquedaInicialPage.xpathCboTren, tren);

		ClickElement(busquedaInicialPage.txtFechaSalida);
		ClickElementByXpath(busquedaInicialPage.xpathFechaSalida);
	}

	@Step("Doy click a Buscar")
	public void Buscar() {
		ClickElement(busquedaInicialPage.btnBuscar);
	}

}
