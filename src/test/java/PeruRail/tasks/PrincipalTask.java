package PeruRail.tasks;

import PeruRail.pages.MainPage;
import net.thucydides.core.annotations.Step;

public class PrincipalTask  {

	MainPage mainPage;
	
	@Step("Ir a URL de PeruRail")
	public void OpenUrl() {
		mainPage.open();
		
	} 
	


}
