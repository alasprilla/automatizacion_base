package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PagePagaTuFacturaHogar;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefPagaTuFacturaHogar {
	PagePagaTuFacturaHogar pagePagaTuFacturaHogar;

	@Given("^Estoy en la página de inicio de pago de facturas \"([^\"]*)\"$")
	public void estoy_en_la_página_de_inicio_de_pago_de_facturas(String webSite)  {
		pagePagaTuFacturaHogar.open();
		pagePagaTuFacturaHogar.irAlSitio(webSite);
	}

	@When("^doy clic en la opción \"([^\"]*)\"$")
	public void doy_clic_en_la_opción(String opcionPagaTuFactura)  {
		pagePagaTuFacturaHogar.clicEn(opcionPagaTuFactura);
	}

	@When("^selecciono la opción \"([^\"]*)\" en el campo Tipo de documento$")
	public void selecciono_la_opción_en_el_campo_Tipo_de_documento(String tipoDocumento)  {
		pagePagaTuFacturaHogar.seleccionar(tipoDocumento);
	}

	@When("^ingreso \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_en_el_campo(String txtIngresado, String objeto)  {
	    pagePagaTuFacturaHogar.ingresar(objeto,txtIngresado);
	}

	@Then("^el texto que se intenta ingresar no se mostrará$")
	public void el_texto_que_se_intenta_ingresar_no_se_mostrará()  {
	    pagePagaTuFacturaHogar.compararTxt("número de documento","");
	}

	@Then("^mostrará el siguiente mensaje en color rojo \"([^\"]*)\"$")
	public void mostrará_el_siguiente_mensaje_en_color_rojo(String txtEsperado)  {
	    pagePagaTuFacturaHogar.compararTxt("label error documento",txtEsperado);
	    pagePagaTuFacturaHogar.compararAtributo("label error documento","color","rgba(240, 30, 70, 1)");
	}

	@Then("^mostrará hasta el (\\d+)° dígito$")
	public void mostrará_hasta_el_dígito(int arg1)  {
	    
	    
	}

	@When("^ingreso (\\d+) en el campo \"([^\"]*)\"$")
	public void ingreso_en_el_campo(int arg1, String arg2)  {
	    
	    
	}

	@When("^doy clic en el botón \"([^\"]*)\"$")
	public void doy_clic_en_el_botón(String arg1)  {
	    
	    
	}

	@Then("^mostrará el \"([^\"]*)\"$")
	public void mostrará_el(String arg1)  {
	    
	    
	}

	@Then("^mostrará el (\\d+)$")
	public void mostrará_el(int arg1)  {
	    
	    
	}
	
}
