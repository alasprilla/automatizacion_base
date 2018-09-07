package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PagePagaTuFacturaMovil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefPagaTuFacturaMovil {

	PagePagaTuFacturaMovil pagePagaFactMvl;
	
	@Given("^estoy en la página de inicio de pago de facturas \"([^\"]*)\"$")
	public void estoy_en_la_página_de_inicio_de_pago_de_facturas(String url)  {
		pagePagaFactMvl.open();
		pagePagaFactMvl.irAlaPagina(url);
	}

	@When("^ingreso el número celular \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_el_número_celular_en_el_campo(String numcelular,String campo) {
		pagePagaFactMvl.seleccionCelular();
		pagePagaFactMvl.escribirCelular(numcelular);
	}

	@When("^ingreso el correo \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_el_correo_en_el_campo(String correo,String campocorreo)  {
		pagePagaFactMvl.seleccionCorreo();
		pagePagaFactMvl.escribirCorreo(correo);
	}

	@Then("^mostrará el siguiente mensaje en letras blancas con fondo rojo \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void mostrará_el_siguiente_mensaje_en_letras_blancas_con_fondo_rojo(String objeto,String txtmensaje) {
		pagePagaFactMvl.compararMensaje(objeto,txtmensaje);
		//pagePagaFactMvl.compararAtributos();
	}

	@Then("^mostrará el siguiente mensaje en letras blancas con fondo azul \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void mostrará_el_siguiente_mensaje_en_letras_blancas_con_fondo_azul(String objeto,String txtmensaje) {
		pagePagaFactMvl.compararMensaje(objeto,txtmensaje);
		//pagePagaFactMvl.compararAtributos();
	}

	@Then("^llevará al formulario donde se selecciona el tipo de pago$")
	public void llevará_al_formulario_donde_se_selecciona_el_tipo_de_pago()  {
		pagePagaFactMvl.presionBotonConfirmar();
	}

}
