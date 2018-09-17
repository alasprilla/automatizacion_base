package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PagePagaTuFactura;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefPagaTuFactura {

	PagePagaTuFactura pagePagaFact;

	@Given("^Estoy en la página de inicio de pago de facturas \"([^\"]*)\"$")
	public void estoy_en_la_página_de_inicio_de_pago_de_facturas(String url) {
		pagePagaFact.open();
		pagePagaFact.irPagina(url);
	}

	@When("^doy clic en el campo \"([^\"]*)\" y escribo el email \"([^\"]*)\"$")
	public void doy_clic_en_el_campo_y_escribo_el_email(String correoElectronico, String email) {
		// pagePagaFact.clic(correoElectronico);
		pagePagaFact.validarEscribir(correoElectronico, email);
	}

	@When("^ingreso el número celular \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_el_número_celular_en_el_campo(String msisdn, String campoMsisdn) {
		pagePagaFact.clic(campoMsisdn);
		pagePagaFact.validarEscribir(campoMsisdn, msisdn);
	}

	@When("^ingreso el correo \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_el_correo_en_el_campo(String correo, String campoCorreo) {
		// pagePagaFact.clic(campoCorreo);
		pagePagaFact.validarEscribir(campoCorreo, correo);
	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@When("^Presiono la tecla \"([^\"]*)\"$")
	public void presiono_la_tecla(String tecla) {
		pagePagaFact.presionarTecla(tecla);
	}

	@When("^doy clic en \"([^\"]*)\"$")
	public void doy_clic_en(String objeto) {
		pagePagaFact.clic(objeto);
	}

	@When("^selecciono \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void selecciono_la_opción_en_el_campo_Tipo_de_documento(String item, String objeto) {
		pagePagaFact.seleccionar(objeto, item);
	}

	@When("^ingreso \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_en_el_campo(String txtIngresado, String objeto) {
		// pagePagaFact.escribir(objeto, txtIngresado);
		pagePagaFact.validarEscribir(objeto, txtIngresado);
	}

	@When("^doy clic en el botón \"([^\"]*)\"$")
	public void doy_clic_en_el_botón(String objeto) {
		pagePagaFact.clic(objeto);
	}

/*	@Then("^El botón \"([^\"]*)\" se deshabilita y mostrará el siguiente \"([^\"]*)\" en color rojo \"([^\"]*)\"$")
	public void el_botón_se_deshabilita_y_mostrará_el_siguiente_en_color_rojo(String btnConsultar, String campoClick,
			String msgError) {
		//pagePagaFact.compararTxt(campoClick, msgError)
		//pagePagaFact.compararAtributo(campoClick, "color", "rgba(240, 30, 70, 1)")
		//pagePagaFact.botonInabilitado(btnConsultar, "disabled", "true");
	}*/
	
	@Then("^el botón \"([^\"]*)\" esta \"([^\"]*)\"$")
	public void el_botón_esta(String objeto, String estaDeshabilitado) {
		String isDisable="false";
		if(estaDeshabilitado.equals("deshabilitado")) isDisable="true";
		pagePagaFact.compararAtributo(objeto, "disabled", isDisable);
	}
	
	@Then("^el campo \"([^\"]*)\" tiene el texto \"([^\"]*)\"$")
	public void el_campo_tiene_el_texto(String objeto, String textoEsperado) {
		pagePagaFact.compararTxt(objeto, textoEsperado);
	}
	
	@Then("^el campo \"([^\"]*)\" tiene el atributo \"([^\"]*)\" en el valor \"([^\"]*)\"$")
	public void el_campo_tiene_el_atributo_en_el_valor(String objeto,String atributo, String valorEsperado) {
		pagePagaFact.compararAtributo(objeto, atributo, valorEsperado);
	}
	
	@Then("^El botón \"([^\"]*)\" se habilita$")
	public void el_botón_se_habilita(String btnConsultar) {
		pagePagaFact.compararAtributo(btnConsultar, "class", 
				"btn btn_send button js-form-submit form-submit button--secondary button--active");
	}

	@Then("^mostrará el siguiente \"([^\"]*)\" en letras blancas con fondo rojo \"([^\"]*)\"$")
	public void mostrará_el_siguiente_en_letras_blancas_con_fondo_rojo(String msgFactura, String txtmensaje) {
		pagePagaFact.presionBotonConfirmar();
		pagePagaFact.compararTxt(msgFactura, txtmensaje);
		pagePagaFact.compararAtributo(msgFactura, "background", "rgb(240, 30, 70)");
	}

	@Then("^mostrará el siguiente \"([^\"]*)\" en letras blancas con fondo azul \"([^\"]*)\"$")
	public void mostrará_el_siguiente_en_letras_blancas_con_fondo_azul(String msgFactura, String txtmensaje) {
		pagePagaFact.presionBotonConfirmar();
		pagePagaFact.compararTxt(msgFactura, txtmensaje);
		pagePagaFact.compararAtributo(msgFactura, "background", "rgb(0, 200, 255)");
	}

	@Then("^llevará al formulario donde se selecciona el tipo de pago$")
	public void llevará_al_formulario_donde_se_selecciona_el_tipo_de_pago() {
		pagePagaFact.presionBotonConfirmar();
	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@Then("^La página se recarga$")
	public void la_página_se_recarga() {
		pagePagaFact.validarPagRecargada();
	}

	/*
	@Then("^el texto que se intenta ingresar no se mostrará$")
	public void el_texto_que_se_intenta_ingresar_no_se_mostrará() {
		pagePagaFact.compararTxt("número de documento", "");
	}

	@Then("^mostrará el siguiente mensaje en color rojo \"([^\"]*)\"$")
	public void mostrará_el_siguiente_mensaje_en_color_rojo(String txtEsperado) {
		pagePagaFact.compararTxt("label error documento", txtEsperado);
		pagePagaFact.compararAtributo("label error documento", "color", "rgba(240, 30, 70, 1)");
	}

	@Then("^mostrará el mensaje en color rojo \"([^\"]*)\"$")
	public void mostrará_el_mensaje_en_color_rojo(String txtEsperado) {
		pagePagaFact.compararTxt("label error celular", txtEsperado);
		pagePagaFact.compararAtributo("label error celular", "color", "rgba(240, 30, 70, 1)");
	}
	*/

	@Then("^mostrará en el valor del campo \"([^\"]*)\" el texto \"([^\"]*)\"$")
	public void mostrará_en_el_valor_del_campo_el_texto(String objeto, String valor) {
		pagePagaFact.compararAtributo(objeto, "value", valor);
	}

	@Then("^mostrará el \"([^\"]*)\"$")
	public void mostrará_el(String texto) {
		if (texto.contains("no tiene")) {
			pagePagaFact.compararTxt("label facturas", texto);
			pagePagaFact.compararAtributo("label facturas", "color", "rgba(255, 255, 255, 1)");
			pagePagaFact.compararAtributo("label facturas", "background-color", "rgba(0, 200, 255, 1)");
		} else {
			pagePagaFact.tieneHijos("list facturas");
		}

	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@Then("^Entonces el primer caracter se borra$")
	public void entonces_el_primer_caracter_se_borra() {
		pagePagaFact.compararTextoInicial();
	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@Then("^El último caracter se borra$")
	public void el_último_caracter_se_borra() {
		pagePagaFact.compararTextoFinal();
	}
	
	// Implementación: " ADP-21_HU-006-ValidacionNumeroDocumento"
	@Then("^El último caracter del campo número de documento se borra$")
	public void el_último_caracter_del_campo_número_de_documento_se_borra()  {
		pagePagaFact.compararDocFinal();
	}
	
	// Implementación: " ADP-21_HU-006-ValidacionNumeroDocumento"
	@Then("^Entonces el primer caracter del campo número de documento se borra$")
	public void entonces_el_primer_caracter_del_campo_número_de_documento_se_borra()  {
		pagePagaFact.compararDocInicial();
	}

}
