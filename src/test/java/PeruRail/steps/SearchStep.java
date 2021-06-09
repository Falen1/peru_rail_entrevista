package PeruRail.steps;

import PeruRail.tasks.SearchTask;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import cucumber.api.DataTable;

public class SearchStep {

	@Steps
	SearchTask searchTask;

	@Given("^busco viaje solo ida$")
	public void busco_viaje_ida(DataTable dt) {

		searchTask.BuscarViajeSoloIda(dt);
		searchTask.Buscar();

	}


}