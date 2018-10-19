package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PageRecargasPaquetes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefRecargasPaquetes {
	
	PageRecargasPaquetes pageRecargasPaquetes;
	
	@Given("^Estoy en la página de inicio de compra paquetes y recargas \"([^\"]*)\"$")
	public void estoy_en_la_página_de_inicio_de_compra_paquetes_y_recargas(String url) {
		pageRecargasPaquetes.open();
		pageRecargasPaquetes.irPagina(url);
	}
	
	@When("^Doy clic en \"([^\"]*)\"$")
	public void doy_clic_en(String objeto) {
		pageRecargasPaquetes.clic(objeto);
	}

	@When("^presiono la tecla \"([^\"]*)\"$")
	public void presiono_la_tecla(String tecla) {
		pageRecargasPaquetes.presionarTecla(tecla);
	}

	@Then("^la página se recarga$")
	public void la_página_se_recarga() {
		pageRecargasPaquetes.validarPagRecargada();
	}


}
