package PeruRail.steps;

import static org.junit.Assert.assertTrue;

import PeruRail.entidad.PriceEntity;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import PeruRail.tasks.ChooseYourCabineTask;
import PeruRail.tasks.ConfirmationAndPaymentTask;
import PeruRail.tasks.PassengersDataTask;
import PeruRail.tasks.TrainTask;
import cucumber.api.DataTable;

public class TicketStep {

	@Steps
	ChooseYourCabineTask chooseYourCabineTask;
	@Steps
	PassengersDataTask passengersDataTask;
	@Steps
	ConfirmationAndPaymentTask confirmationAndPaymentTask;

	@Steps
	TrainTask trainTask;

	@Given("^completo datos de cabina$")
	public void completar_datos_cabina(DataTable dt) {
		chooseYourCabineTask.CompletarDatosCabina(dt);
		chooseYourCabineTask.Continuar();
	}

	@Given("^completo los datos de los pasajeros$")
	public void completo_los_datos_de_los_pasajeros(DataTable dt) throws InterruptedException {
		passengersDataTask.CompletarDatosCabina(dt);
		passengersDataTask.Continuar();
	}

	@Given("^verifico los montos obtenidos$")
	public void verifico_los_montos_obtenidos() throws InterruptedException {
		String montoTotalUSDResumenCompra = confirmationAndPaymentTask.ObtenerMontoResumenCompra();
		Boolean bIsCorrect = confirmationAndPaymentTask.CompararMontosObtenidos(PriceEntity.get_dolaresAntes(),
				montoTotalUSDResumenCompra);
		assertTrue("Montos incorrectos", bIsCorrect);
	}


}