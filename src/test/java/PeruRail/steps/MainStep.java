package PeruRail.steps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import PeruRail.tasks.PrincipalTask;

public class MainStep {

	@Steps
	PrincipalTask principalTask;

	@Given("^abro pagina PeruRail$")
	public void abro_pagina_perurail()  {
		principalTask.OpenUrl();
		
	}

}