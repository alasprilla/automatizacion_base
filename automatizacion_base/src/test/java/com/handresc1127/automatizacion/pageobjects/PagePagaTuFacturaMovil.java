package com.handresc1127.automatizacion.pageobjects;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://www.google.com.co/")
public class PagePagaTuFacturaMovil extends PageObject{
	public By txtMsisdn= By.id("edit-candidate-number");
	public By btnConfirmar= By.xpath("//*[@id='edit-button-query']");
	public By txtCorreo= By.id("edit-email");
	public By txtmensaje= By.xpath("//*[@id='alert_main']/div/p");
    public String objeto = "No hemos encontrado facturas para este número de línea";
	
	public void irAlaPagina(String url) {
		actionsUtil.goToWebSide(getDriver(), url);
	}

	public void seleccionCelular() {
		actionsUtil.clic(getDriver(), txtMsisdn);
	}
	
	public void escribirCelular(String numcelular) {
		actionsUtil.setTextFieldSlowly(getDriver(), txtMsisdn, numcelular);
	}
	
	public void seleccionCorreo() {
		actionsUtil.clic(getDriver(), txtCorreo);

	}
	public void escribirCorreo(String correo) {
		actionsUtil.setTextFieldSlowly(getDriver(), txtCorreo, correo);
	}
	
	public void presionBotonConfirmar() {
		actionsUtil.clic(getDriver(), btnConfirmar);
	}
	
	public void compararMensaje(String objeto,String txtmensaje) {

		if(txtmensaje.equals(objeto)) {
			setObjetoToCliked(txtMsisdn);
		}
	}
	
	//private void compararAtributos() {
		
	//}

	public void setObjetoToCliked(By objetoToCliked) {
		this.txtMsisdn = objetoToCliked;
	}


	
}
