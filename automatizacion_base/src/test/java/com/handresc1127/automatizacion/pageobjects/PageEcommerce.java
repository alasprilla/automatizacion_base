package com.handresc1127.automatizacion.pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.co")
public class PageEcommerce extends PageObject {

	By txtCorreoElectronico= By.id("edit-email");
	By lbBarraDeslizante = By.xpath("//*[@id='tigo-activation-activate-sim]/article/section[2]/div/div[2]/div/div[1]");
	
	By objetoToAction;
	String texto = "";

	public void irPagina(String url) {
		ActionsUtil.goToWebSide(getDriver(), url);
	}

	public By getObjetoToCliked() {
		return objetoToAction;
	}

	public void setObjetoToCliked(By objetoToCliked) {
		this.objetoToAction = objetoToCliked;
	}

	public void sharedObjet(String opcion) {
		switch (ActionsUtil.textoMinusculasSinEspacios(opcion)) {
		case "correoelectronico":
				setObjetoToCliked(txtCorreoElectronico);
			 break;
		case "deslizaparaenviar":
			setObjetoToCliked(lbBarraDeslizante);
		 break;	 
		
		default:
			assertEquals(null, ActionsUtil.textoMinusculasSinEspacios(opcion));
		}
	}

	public void escribirConClick(String objeto, String texto) {
		sharedObjet(objeto);
		this.texto = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
		ActionsUtil.clicParent(getDriver(), getObjetoToCliked());
	}

	public void escribir(String objeto, String texto) {
		sharedObjet(objeto);
		this.texto = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
	}
	
	public void validarEscribir(String objeto2, String txtIngresado) {
		if ((ActionsUtil.textoMinusculasSinEspacios(objeto2).equals("correoelectronico"))
				) {
			escribirConClick(objeto2, txtIngresado);
		} else {
			escribir(objeto2, txtIngresado);
		}
	}

	
	public void deslizarBarra(String barra) {
		ActionsUtil.slider(getDriver(),getObjetoToCliked());
	}
}
