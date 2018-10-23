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

	@When("^Ingreso \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_en_el_campo(String txtIngresado, String objeto) {
		pageRecargasPaquetes.escribir(objeto, txtIngresado);
	}


	@Then("^el último caracter se borra$")
	public void el_último_caracter_se_borra() {
		pageRecargasPaquetes.compararTextoFinal();
	}
	
	@Then("^el primer caracter se borra$")
	public void el_primer_caracter_se_borra() {
		pageRecargasPaquetes.compararTextoInicial();
	}
	
	@When("^El campo \"([^\"]*)\" tiene el texto \"([^\"]*)\"$")
	public void el_campo_tiene_el_texto(String objeto, String textoEsperado) {
		pageRecargasPaquetes.compararTxt(objeto, textoEsperado);
	}
	
	@Then("^Mostrará en el valor del campo \"([^\"]*)\" el texto \"([^\"]*)\"$")
	public void mostrará_en_el_valor_del_campo_el_texto(String objeto, String valor) {
		pageRecargasPaquetes.compararAtributo(objeto, "value", valor);
	}

	@Then("^El botón \"([^\"]*)\" esta \"([^\"]*)\"$")
	public void el_botón_esta(String objeto, String estaDeshabilitado) {
		boolean isDisable = false, isEnabled = false;
		if (estaDeshabilitado.equals("deshabilitado")) {
			isDisable = true;
			pageRecargasPaquetes.compararAtributo(objeto, "disabled", String.valueOf(isDisable) );
		}else if (estaDeshabilitado.equals("habilitado")){
			isEnabled = true;
			pageRecargasPaquetes.compararAtributo(objeto, "enabled",String.valueOf(isEnabled) );	
		}else {
			//Sí entra acá siempre fallará
			pageRecargasPaquetes.compararTxt(objeto, estaDeshabilitado);
		}
	}
	

	@Then("^El campo \"([^\"]*)\" tiene el atributo \"([^\"]*)\" en el valor \"([^\"]*)\"$")
	public void el_campo_tiene_el_atributo_en_el_valor(String objeto, String atributo, String valorEsperado) {
		pageRecargasPaquetes.compararAtributo(objeto, atributo, valorEsperado);
	}
}
