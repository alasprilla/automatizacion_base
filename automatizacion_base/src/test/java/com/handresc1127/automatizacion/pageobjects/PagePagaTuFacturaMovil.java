package com.handresc1127.automatizacion.pageobjects;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;

public class PagePagaTuFacturaMovil extends PageObject{
	public By txtMsisdn= By.id("edit-candidate-number");
	public By btnConfirmar= By.xpath("//*[@id='edit-button-query']");
	public By txtCorreo= By.id("edit-email");
	String mensaje="No hemos encontrado facturas para este número de línea";
	
	
	public void irAlaPagina(String url) {
		actionsUtil.goToWebSide(getDriver(), url);
	}

	public void escribirCelular(String numcelular) {
		actionsUtil.setTextFieldSlowly(getDriver(), txtMsisdn, numcelular);
		
	}
	public void escribirCorreo(String correo) {
		actionsUtil.setTextFieldSlowly(getDriver(), txtCorreo, correo);
	}
	
	public void presionBotonConfirmar() {
		actionsUtil.clic(getDriver(), btnConfirmar);
	}
	
	public void mostrarMensaje() {
		actionsUtil.clic(getDriver(), mensaje);
	}


	
}
