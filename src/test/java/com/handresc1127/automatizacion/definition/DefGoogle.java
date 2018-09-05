package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PageGoogle;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefGoogle {
	PageGoogle pageGoogle;
	
	@Given("^un navegador web se encuentra en la página de Google$")
	public void un_navegador_web_se_encuentra_en_la_página_de_Google(){
		pageGoogle.open();
		pageGoogle.ingresarAlSitio("https://www.google.com.co/");  
	}


	@When("^la frase de búsqueda \"([^\"]*)\" se introduce$")
	public void la_frase_de_búsqueda_se_introduce(String fraseBuscada){
	    pageGoogle.ingresarBusquedaInicial(fraseBuscada);
	}

	@Then("^Resultados para \"([^\"]*)\" se muestran$")
	public void resultados_para_se_muestran(String resultados){
		pageGoogle.presionarBtnBuscar();
		pageGoogle.mostarResultados(resultados);
	}
}
