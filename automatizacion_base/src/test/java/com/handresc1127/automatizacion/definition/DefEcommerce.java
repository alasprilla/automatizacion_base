package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PageEcommerce;

import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefEcommerce {

	PageEcommerce pageEcommerce;

	@Given("^Estoy en la página de inicio de activa tu sim \"([^\"]*)\"$")
	public void estoy_en_la_página_de_inicio_de_activa_tu_sim (String url) {
		pageEcommerce.open();
		pageEcommerce.irPagina(url);
	}

	@When("^doy clic en \"([^\"]*)\" y escribo el email \"([^\"]*)\"$")
	public void doy_clic_en_y_escribo_el_email(String correoElectronico, String email) {
		pageEcommerce.validarEscribir(correoElectronico, email);
	}
	
	@Given("^deslizo la flecha \"([^\"]*)\" para seguir con el proceso$")
	public void deslizo_la_flecha_para_seguir_con_el_proceso(String slider) {
	    pageEcommerce.deslizarBarra(slider);
	}


}
