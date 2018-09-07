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

	@When("^Cuando doy clic en el campo \"([^\"]*)\" y escribo el número celular (\\d+)$")
	public void cuando_doy_clic_en_el_campo_y_escribo_el_número_celular(String tuLineaTigo, String msisdn) {
		pagePagaFactMvl.clicEn(tuLineaTigo);
		pagePagaFactMvl.escribir(tuLineaTigo, msisdn);
	}

	@When("^doy clic en el campo \"([^\"]*)\" y escribo el email \"([^\"]*)\"$")
	public void doy_clic_en_el_campo_y_escribo_el_email(String correoElectronico, String email) {
		pagePagaFactMvl.escribir(correoElectronico, email);
	}

	@Then("^El botón \"([^\"]*)\" se deshabilita y mostrará el siguiente mensaje en color rojo\"([^\"]*)\"$")
	public void el_botón_se_deshabilita_y_mostrará_el_siguiente_mensaje_en_color_rojo(String btnConsultar, String msgError) {
		pagePagaFactMvl.botonInabilitado();
		pagePagaFactMvl.mensaje();
	}

	@Then("^El botón \"([^\"]*)\" se habilita$")
	public void el_botón_se_habilita(String arg1) {
	    
		
	}
}
