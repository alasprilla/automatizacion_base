package com.handresc1127.automatizacion.pageobjects;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.indracompany.com/")
public class PagePagaTuFacturaHogar extends PageObject{
	public By txtMsisdn= By.id("edit-candidate-number");
	public By btnConfirmar= By.xpath("//*[@id='edit-button-query']");
	public By txtCorreo= By.id("edit-email");
	public By btnPagarFactura= By.id("edit-button-payment");
	public By txtValorPagar= By.id("edit-amount-pay");
	String valorAPagar="";
	
	
	public void irAlaPagina() {
		actionsUtil.goToWebSide(getDriver(), "https://transaccionesco-uat.tigocloud.net/servicios/factura-movil");
	}

	public void EscribirTelefono(String numTelefono) {
		actionsUtil.setTextFieldSlowly(getDriver(), txtMsisdn, numTelefono);
	}

	public void presionBotonConfirmar() {
		actionsUtil.clic(getDriver(), btnConfirmar);
	}

	public void ingresarCorreo(String correo) {
		actionsUtil.setTextFieldSlowly(getDriver(), txtCorreo, correo);
	}

	public void guardarValor() {
		valorAPagar=actionsUtil.getText(getDriver(), txtValorPagar);
		System.out.println("valor: "+valorAPagar);
	}
	
	
}
