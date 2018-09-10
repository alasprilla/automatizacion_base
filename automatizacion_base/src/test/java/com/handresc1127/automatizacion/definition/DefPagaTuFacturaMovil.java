package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PagePagaTuFacturaMovil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefPagaTuFacturaMovil {

	PagePagaTuFacturaMovil pagePagaFactMvl;

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

	@Then("^El botón \"([^\"]*)\" se deshabilita y mostrará el siguiente mensaje en color rojo \"([^\"]*)\"$")
	public void el_botón_se_deshabilita_y_mostrará_el_siguiente_mensaje_en_color_rojo(String btnConsultar,
			String msgError) {
		pagePagaFactMvl.mensaje(msgError);
		pagePagaFactMvl.colorTextoMensaje("color", "rgba(240, 30, 70, 1)");
		pagePagaFactMvl.botonInabilitado(btnConsultar, "disabled", "true");
	}

	@Then("^El botón \"([^\"]*)\" se habilita$")
	public void el_botón_se_habilita(String btnConsultar) {
		pagePagaFactMvl.botonInabilitado(btnConsultar, "class",
				"btn btn_send button js-form-submit form-submit button--secondary button--active");
	}
	@Given("^estoy en la página de inicio de pago de facturas \"([^\"]*)\"$")
	public void estoy_en_la_página_de_inicio_de_pago_de_facturas(String url)  {
		pagePagaFactMvl.open();
		pagePagaFactMvl.irAlaPagina(url);
	}

	@When("^ingreso el número celular \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_el_número_celular_en_el_campo(String numcelular,String campo) throws AWTException  {
		pagePagaFactMvl.seleccionCelular();
		pagePagaFactMvl.escribirCelular(numcelular);
	}

	@When("^ingreso el correo \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_el_correo_en_el_campo(String correo,String campocorreo) throws AWTException   {
		pagePagaFactMvl.seleccionCorreo();
		pagePagaFactMvl.escribirCorreo(correo);
	}

	@Then("^mostrará el siguiente mensaje en letras blancas con fondo rojo \"([^\"]*)\"$")
	public void mostrará_el_siguiente_mensaje_en_letras_blancas_con_fondo_rojo(String txtmensaje) {
		pagePagaFactMvl.presionBotonConfirmar();
		pagePagaFactMvl.compararMensaje(txtmensaje);
	    pagePagaFactMvl.compararAtributo("background","rgb(240, 30, 70)");
	}

	@Then("^mostrará el siguiente mensaje en letras blancas con fondo azul \"([^\"]*)\"$")
	public void mostrará_el_siguiente_mensaje_en_letras_blancas_con_fondo_azul(String txtmensaje) {
		pagePagaFactMvl.presionBotonConfirmar();
		pagePagaFactMvl.compararMensaje(txtmensaje);
		pagePagaFactMvl.compararAtributo("background","rgb(0, 200, 255)");
	}

	@Then("^llevará al formulario donde se selecciona el tipo de pago$")
	public void llevará_al_formulario_donde_se_selecciona_el_tipo_de_pago()  {
		pagePagaFactMvl.presionBotonConfirmar();
	}
}
