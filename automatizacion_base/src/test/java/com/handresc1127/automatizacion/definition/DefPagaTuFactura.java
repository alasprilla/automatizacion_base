package com.handresc1127.automatizacion.definition;

import java.awt.AWTException;

import com.handresc1127.automatizacion.pageobjects.PagePagaTuFactura;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefPagaTuFactura {

	PagePagaTuFactura pagePagaFact;

	@When("^Cuando doy clic en el campo \"([^\"]*)\" y escribo el número celular (\\d+)$")
	public void cuando_doy_clic_en_el_campo_y_escribo_el_número_celular(String tuLineaTigo, String msisdn) {
		pagePagaFact.clic(tuLineaTigo);
		pagePagaFact.escribir(tuLineaTigo, msisdn);
	}

	@When("^doy clic en el campo \"([^\"]*)\" y escribo el email \"([^\"]*)\"$")
	public void doy_clic_en_el_campo_y_escribo_el_email(String correoElectronico, String email) {
		pagePagaFact.escribir(correoElectronico, email);
	}

	@Then("^El botón \"([^\"]*)\" se deshabilita y mostrará el siguiente mensaje en color rojo \"([^\"]*)\"$")
	public void el_botón_se_deshabilita_y_mostrará_el_siguiente_mensaje_en_color_rojo(String btnConsultar,
			String msgError) {
		pagePagaFact.mensaje(msgError);
		pagePagaFact.colorTextoMensaje("color", "rgba(240, 30, 70, 1)");
		pagePagaFact.botonInabilitado(btnConsultar, "disabled", "true");
	}

	@Then("^botón \"([^\"]*)\" se deshabilita y muestra el siguiente mensaje en color rojo \"([^\"]*)\"$")
	public void botón_se_deshabilita_y_muestra_el_siguiente_mensaje_en_color_rojo(String btnConsultar,
			String msgErrorCel) {
		pagePagaFact.mensajeC(msgErrorCel);
		pagePagaFact.colorTextoMensaje("color", "rgba(240, 30, 70, 1)");
		pagePagaFact.botonInabilitado(btnConsultar, "disabled", "true");
	}

	@Then("^El botón \"([^\"]*)\" se habilita$")
	public void el_botón_se_habilita(String btnConsultar) {
		pagePagaFact.botonInabilitado(btnConsultar, "class",
				"btn btn_send button js-form-submit form-submit button--secondary button--active");
	}

	@Given("^estoy en la página de inicio de pago de facturas \"([^\"]*)\"$")
	public void estoy_en_la_página_de_inicio_de_pago_de_facturas(String url) {
		pagePagaFact.open();
		pagePagaFact.irPagina(url);
	}

	@When("^ingreso el número celular \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_el_número_celular_en_el_campo(String numcelular, String campo) throws AWTException {
		pagePagaFact.clic(campo);
		pagePagaFact.escribirCelular(numcelular);
	}

	@When("^ingreso el correo \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_el_correo_en_el_campo(String correo, String campoCorreo) throws AWTException {
		pagePagaFact.clic(campoCorreo);
		pagePagaFact.escribirCorreo(correo);
	}

	@Then("^mostrará el siguiente mensaje en letras blancas con fondo rojo \"([^\"]*)\"$")
	public void mostrará_el_siguiente_mensaje_en_letras_blancas_con_fondo_rojo(String txtmensaje) {
		pagePagaFact.presionBotonConfirmar();
		pagePagaFact.compararMensaje(txtmensaje);
		pagePagaFact.compararAtributo("background", "rgb(240, 30, 70)");
	}

	@Then("^mostrará el siguiente mensaje en letras blancas con fondo azul \"([^\"]*)\"$")
	public void mostrará_el_siguiente_mensaje_en_letras_blancas_con_fondo_azul(String txtmensaje) {
		pagePagaFact.presionBotonConfirmar();
		pagePagaFact.compararMensaje(txtmensaje);
		pagePagaFact.compararAtributo("background", "rgb(0, 200, 255)");
	}

	@Then("^llevará al formulario donde se selecciona el tipo de pago$")
	public void llevará_al_formulario_donde_se_selecciona_el_tipo_de_pago() {
		pagePagaFact.presionBotonConfirmar();
	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@When("^Cuando doy clic en el campo \"([^\"]*)\" y presiono la tecla \"([^\"]*)\"$")
	public void cuando_doy_clic_en_el_campo_y_presiono_la_tecla(String tuLineaTigo, String tecla) {
		pagePagaFact.clic(tuLineaTigo);
		pagePagaFact.presionarTecla(tecla);

	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@Then("^La página se recarga$")
	public void la_página_se_recarga() {

	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@Then("^El último caracter se borra$")
	public void el_último_caracter_se_borra() {
		pagePagaFact.compararTextoFinal();
	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@Then("^Entonces el primer caracter se borra$")
	public void entonces_el_primer_caracter_se_borra() {
		pagePagaFact.compararTextoInicial();
	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@When("^Presiono la tecla \"([^\"]*)\" y presiono la tecla \"([^\"]*)\"$")
	public void presiono_la_tecla_y_presiono_la_tecla(String tecla1, String tecla2) {
		pagePagaFact.presionarTecla(tecla1);
		pagePagaFact.presionarTecla(tecla2);
	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@Then("^Entonces el último caracter se borra$")
	public void entonces_el_último_caracter_se_borra() {
		pagePagaFact.compararTextoFinal();
	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	@When("^Presiono la tecla \"([^\"]*)\"$")
	public void presiono_la_tecla(String tecla) {
		pagePagaFact.presionarTecla(tecla);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//******** HOGAR
	
	@When("^doy clic en la opción \"([^\"]*)\"$")
	public void doy_clic_en_la_opción(String opcionPagaTuFactura) {
		pagePagaFact.clic(opcionPagaTuFactura);
	}

	@When("^selecciono la opción \"([^\"]*)\" en el campo Tipo de documento$")
	public void selecciono_la_opción_en_el_campo_Tipo_de_documento(String tipoDocumento) {
		pagePagaFact.seleccionar(tipoDocumento);
	}

	@When("^ingreso \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_en_el_campo(String txtIngresado, String objeto) {
		pagePagaFact.ingresar(objeto, txtIngresado);

	}

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

	@Then("^mostrará en el campo \"([^\"]*)\" el texto \"([^\"]*)\"$")
	public void mostrará_en_el_campo_el_texto(String objeto, String valor) {
		pagePagaFact.compararAtributo(objeto, "value", valor);
	}

	@When("^doy clic en el botón \"([^\"]*)\"$")
	public void doy_clic_en_el_botón(String objeto) {
		pagePagaFact.clic(objeto);
	}

	@Then("^mostrará el \"([^\"]*)\"$")
	public void mostrará_el(String texto) {
		if (texto.contains("no tiene")) {
			pagePagaFact.compararTxt("label facturas", texto);
			// Letra blanca
			pagePagaFact.compararAtributo("label facturas", "color", "rgba(255, 255, 255, 1)");
			// Fondo azul
			pagePagaFact.compararAtributo("label facturas", "background-color", "rgba(0, 200, 255, 1)");

			// #Si no tiene el msj esta en letras blancas con fondo azul
		} else {
			pagePagaFact.tieneHijos("list facturas");
		}

	}

}
