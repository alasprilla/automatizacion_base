package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PagePagaTuFacturaMovil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefPagaTuFacturaMovil {

	PagePagaTuFacturaMovil pagePagaFactMvl;
	
	@Given("^Dado que estoy en la página de inicio de pago de facturas \"([^\"]*)\"$")
	public void dado_que_estoy_en_la_página_de_inicio_de_pago_de_facturas(String url) {
		pagePagaFactMvl.open();
		pagePagaFactMvl.irPagina(url);
	}

	@When("^Cuando doy clic en el campo \"([^\"]*)\"$")
	public void cuando_doy_clic_en_el_campo(String arg1) {
	    
		
	}

	@When("^escribo el número celular (\\d+)$")
	public void escribo_el_número_celular(int arg1) {
	    
		
	}

	@When("^doy clic en el campo \"([^\"]*)\"$")
	public void doy_clic_en_el_campo(String arg1) {
	    
		
	}

	@When("^escribo el email \"([^\"]*)\"$")
	public void escribo_el_email(String arg1) {
	    
		
	}

	@Then("^El botón \"([^\"]*)\" se deshabilita$")
	public void el_botón_se_deshabilita(String arg1) {
	    
		
	}

	@Then("^mostrará el siguiente mensaje en color rojo \"([^\"]*)\"$")
	public void mostrará_el_siguiente_mensaje_en_color_rojo(String arg1) {
	    
		
	}

	@Then("^El botón \"([^\"]*)\" se habilita$")
	public void el_botón_se_habilita(String arg1) {
	    
		
	}
}
