package com.handresc1127.automatizacion.pageobjects;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.negocio.BussinesUtil;
import com.handresc1127.automatizacion.utilities.ActionsUtil;

import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.DefaultUrl;

import java.util.Dictionary;


@DefaultUrl("https://www.google.com.co")

public class PageRecargasPaquetes extends PageObject  {
	
	
//Elemetos de la sección de Recargas	
	By btnRecarga=By.xpath("//*[@id='tap_selector']/div[2]");
	By txtTuLineaTigoR=By.id("num_lin");

	By objetoToAction;
	String texto = "";

	public void irPagina(String url) {
		ActionsUtil.goToWebSide(getDriver(), url);
	}
	
	public void sharedObjet(String opcion) {
		
		ObjetosRecargasPaquetes x = new ObjetosRecargasPaquetes();
		String nombreObjeto = (ActionsUtil.textoMinusculasSinEspacios(opcion));
		By byObjeto = x.getObjetoRecargasPaquetes(nombreObjeto);
		setObjetoToCliked(byObjeto);	

	}
	
	public void sharedObjet(Dictionary<String, By> objetos,String opcion) {
		String nombreObjeto = (ActionsUtil.textoMinusculasSinEspacios(opcion));
		By byObjetos = objetos.get(nombreObjeto);
		setObjetoToCliked(byObjetos);
	}
	public By getObjetoToCliked() {
		return objetoToAction;
	}

	public void setObjetoToCliked(By objetoToCliked) {
		this.objetoToAction = objetoToCliked;
	}
	
	public void clic(Dictionary<String, By> objetos,String objeto) {
		sharedObjet(objetos,objeto);
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
	}
	
	public void clic(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
	}

	
	public void presionarTecla(String tecla) {
		ActionsUtil.presionarTecla(getDriver(), getObjetoToCliked(), tecla);
	}
	
	public void validarPagRecargada() {
		ActionsUtil.highlightElement(getDriver(), getObjetoToCliked());
	}


	public void escribirConClick(String objeto, String texto) {
		sharedObjet(objeto);
		this.texto = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
		ActionsUtil.clicParent(getDriver(), getObjetoToCliked());
	}
	
	public void escribirConClick(Dictionary<String, By> objetos,String objeto, String texto) {
		sharedObjet(objetos,objeto);
		this.texto = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
		ActionsUtil.clicParent(getDriver(), getObjetoToCliked());
	}

	public void escribir(Dictionary<String, By> objetos,String objeto, String texto) {
		sharedObjet(objetos,objeto);
		this.texto = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
	}

	public void escribir(String objeto, String texto) {
		sharedObjet(objeto);
		this.texto = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
	}
	
	public void compararTextoFinal() {
		String textoInicial = texto;
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
		String textoFinal = ActionsUtil.getTextAttribute(getDriver(), getObjetoToCliked());
		if (getObjetoToCliked().toString().substring(7, getObjetoToCliked().toString().length())
				.equals("recharge-line")) {

			BussinesUtil.validateMSISDNFin(textoInicial, textoFinal);
		} 
	}
	
	public void compararTextoInicial() {
		String textoInicial = texto;
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
		String textoFinal = ActionsUtil.getTextAttribute(getDriver(), getObjetoToCliked());

		if (getObjetoToCliked().toString().substring(7, getObjetoToCliked().toString().length())
				.equals("recharge-line")) {

			BussinesUtil.validateMSISDNIni(textoInicial, textoFinal);
		} 
	}
}
