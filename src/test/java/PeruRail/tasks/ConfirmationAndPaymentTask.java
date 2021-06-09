package PeruRail.tasks;

import PeruRail.pages.ConfirmationAndPaymentPage;

import static org.junit.Assert.assertTrue;

import net.thucydides.core.annotations.Step;

public class ConfirmationAndPaymentTask extends BaseTask {

	ConfirmationAndPaymentPage confirmationAndPaymentPage;

	@Step("obtener monto en resumen de compra")
	public String ObtenerMontoResumenCompra() {
		WaitForElement(confirmationAndPaymentPage.rbVisa);
		ClickElement(confirmationAndPaymentPage.btnResumenCompra);
		String montoTotalUSD = GetTextFromElement(confirmationAndPaymentPage.lblTotalUSD);
		
		return montoTotalUSD;	
	}
	
	
	
	@Step("comparando montos, Anterior: {0} - Actual: {1}")
	public boolean CompararMontosObtenidos(String montoTotalCabinas, String montoTotalResumenCompra) {
		
		return montoTotalCabinas.equals(montoTotalResumenCompra);	
	}
	
	
	

}
