package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PageDefault;
import com.handresc1127.automatizacion.utilities.ActionsUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefDefault {

	PageDefault pagePagaFact;

	@Given("^Estoy en la página de inicio de pago de facturas \"([^\"]*)\"$")
	public void estoy_en_la_página_de_inicio_de_pago_de_facturas(String url) {
		pagePagaFact.openAt(url);
	}

	// Implementación: "ADP-3_HU-001-ValidacionTC"
	@Given("^Estoy en la página de selección de formas de pago con el tipo \"([^\"]*)\" seleccionado$")
	public void estoy_en_la_página_de_selección_de_formas_de_pago_con_el_tipo_seleccionado(String objeto) {
		pagePagaFact.esperarElementos("Formas de pago",">",3);
		pagePagaFact.clic(objeto);
		pagePagaFact.elementoVisible("Forma Pago Seleccionada");
	}

	@When("^Presiono la tecla \"([^\"]*)\"$")
	public void presiono_la_tecla(String tecla) {
		pagePagaFact.presionarTecla(tecla);
	}

	@When("^doy clic en \"([^\"]*)\"$")
	public void doy_clic_en(String objeto) {
		pagePagaFact.clic(objeto);
	}
	
	@When("^doy clic forzado en \"([^\"]*)\"$")
	public void doy_clic_forzado_en(String objeto) {
		pagePagaFact.hardClic(objeto);
	}

	@When("^selecciono \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void selecciono_la_opción_en_el_campo_Tipo_de_documento(String item, String objeto) {
		pagePagaFact.seleccionar(objeto, item);

	}

	@When("^ingreso \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_en_el_campo(String txtIngresado, String objeto) {
		pagePagaFact.validarEscribir(objeto, txtIngresado);
	}

	@When("^doy clic en el botón \"([^\"]*)\"$")
	public void doy_clic_en_el_botón(String objeto) {
		pagePagaFact.clic(objeto);
	}

	//Está funcion puede ser reemplazada por la que compara el atributo
	@Then("^el botón \"([^\"]*)\" esta \"([^\"]*)\"$")
	public void el_botón_esta(String objeto, String estaDeshabilitado) {
		boolean isDisable = false, isEnabled = false;
		if (estaDeshabilitado.equals("deshabilitado")) {
			isDisable = true;
			pagePagaFact.compararAtributo(objeto, "disabled", String.valueOf(isDisable) );
		}else if (estaDeshabilitado.equals("habilitado")){
			isEnabled = true;
			pagePagaFact.compararAtributo(objeto, "enabled",String.valueOf(isEnabled) );	
		}else {
			//Sí entra acá siempre fallará
			pagePagaFact.compararTxt(objeto, estaDeshabilitado);
		}
	}

	@Then("^el campo \"([^\"]*)\" tiene el texto \"([^\"]*)\"$")
	public void el_campo_tiene_el_texto(String objeto, String textoEsperado) {
		pagePagaFact.compararTxt(objeto, textoEsperado);
	}

	@Then("^el campo \"([^\"]*)\" tiene el atributo \"([^\"]*)\" en el valor \"([^\"]*)\"$")
	public void el_campo_tiene_el_atributo_en_el_valor(String objeto, String atributo, String valorEsperado) {
		pagePagaFact.compararAtributo(objeto, atributo, valorEsperado);
	}

	@Then("^El botón \"([^\"]*)\" se habilita$")
	public void el_botón_se_habilita(String btnConsultar) {
		pagePagaFact.compararAtributo(btnConsultar, "class","--active");
	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	// Esto se puede cambiar por otra función que ya existe esperar por un elemento
	@Then("^La página se recarga$")
	public void la_página_se_recarga() {
		pagePagaFact.validarPagRecargada();
	}

	@Then("^mostrará en el valor del campo \"([^\"]*)\" el texto \"([^\"]*)\"$")
	public void mostrará_en_el_valor_del_campo_el_texto(String objeto, String valor) {
		pagePagaFact.compararAtributo(objeto, "value", valor);
	}

	//Esta funcion debe de reemplazarse por las 3 independientes
	@Then("^mostrará el \"([^\"]*)\"$")
	public void mostrará_el(String texto) {
		if (texto.contains("no tiene")) {
			final String objeto="label facturas";
			pagePagaFact.compararTxt(objeto, texto);
			pagePagaFact.compararAtributo(objeto, "color", "rgba(255, 255, 255, 1)");
			pagePagaFact.compararAtributo(objeto, "background-color", "rgba(0, 200, 255, 1)");
		} else {
			pagePagaFact.tieneHijos("list facturas");
		}
	}

	// Implementación: "ADP-26_HU-009_ValidacionEnCampoNumeroDocumento"
	@Then("^llevará al formulario con el objeto \"([^\"]*)\"$")
	public void llevará_al_formulario_con_el_objeto(String objeto){
		pagePagaFact.elementoVisible(objeto);
	}

	// Implementación: "ADP-26_HU-009_ValidacionEnCampoNumeroDocumento"
	@Then("^el campo \"([^\"]*)\" comienza con el texto \"([^\"]*)\"$")
	public void el_campo_comienza_con_el_texto(String objeto, String textoInicial){
		pagePagaFact.compararTextoDeInicio(objeto,textoInicial);
	}

	// Implementación: "ADP-26_HU-009_ValidacionEnCampoNumeroDocumento"
	@Then("^el campo \"([^\"]*)\" no está vacío$")
	public void el_campo_no_está_vacío(String objeto){
		pagePagaFact.compararTextoNoVacio(objeto);
	}
	
	//Ecommerce
	@When("^arrastro el elemento \"([^\"]*)\" hasta el elemento \"([^\"]*)\"$")
	public void arrastro_el_elemento_hasta_el_elemento(String objeto1, String objeto2) {
		pagePagaFact.ArrastrarYSoltar(objeto1,objeto2);
	}
	
	//Ecommerce
	@When("^arrastro el elemento \"([^\"]*)\" hasta la posición \"([^\"]*)\"$")
	public void arrastro_el_elemento_hasta_la_posición(String objeto, String position) {
		pagePagaFact.ArrastrarYSoltarXY(objeto,position);
	}

	@When("^Espero (\\d+) segundos$")
	public void espero_segundos(int sleep) {
	    ActionsUtil.sleepSeconds(sleep);
	}

	@Then("^clasificar el dato \"([^\"]*)\" en \"([^\"]*)\" o en \"([^\"]*)\"$")
	public void clasificar_el_dato_en_o_en(String dataName, String dataClass1, String dataClass2) {
	    pagePagaFact.clasificarDato(dataName, dataClass1,dataClass2);
	}

}
