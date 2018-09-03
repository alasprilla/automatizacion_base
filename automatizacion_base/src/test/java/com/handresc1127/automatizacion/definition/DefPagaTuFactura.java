package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PagePagaTuFactura;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefPagaTuFactura {
	PagePagaTuFactura pagePagaTuFactura;

	@Given("^Estamos en el sitio de PagaTuFactura$")
	public void estamos_en_el_sitio_de_PagaTuFactura()  {
		pagePagaTuFactura.open();
		pagePagaTuFactura.irAlaPagina();
	}

	@When("^Ingresamos el msisdn \"([^\"]*)\"$")
	public void ingresamos_el_msisdn(String numTelefono)  {
		pagePagaTuFactura.EscribirTelefono(numTelefono);
	}

	@When("^presionamos el boton confirmar$")
	public void presionamos_el_boton_confirmar()  {
		pagePagaTuFactura.presionBotonConfirmar();
		
	}

	@When("^en el formulario ingresamos \"([^\"]*)\"$")
	public void en_el_formulario_ingresamos(String correo){
		pagePagaTuFactura.ingresarCorreo(correo);
	}

	@When("^guardo el valor a pagar$")
	public void guardo_el_valor_a_pagar()  {
		pagePagaTuFactura.guardarValor();		
	}

	@When("^presiono el boton pagar factura$")
	public void presiono_el_boton_pagar_factura()  {
		
		
	}

	@Then("^verifico el el valor a pagar coincida$")
	public void verifico_el_el_valor_a_pagar_coincida()  {
		
		
	}

}
