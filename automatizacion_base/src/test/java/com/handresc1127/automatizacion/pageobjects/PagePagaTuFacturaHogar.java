package com.handresc1127.automatizacion.pageobjects;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.indracompany.com/")
public class PagePagaTuFacturaHogar extends PageObject{
	public By btnMovil=By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[2]/p");
	public By btnHogar=By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[1]/p");
	public By listTipoDocumento=By.id("edit-document-type");
	public By txtNumeroDocumento=By.id("edit-document");
	public By txtCorreoElectronico=By.xpath("//*[@id='content_right_forms_unified']/div/div/label");
	public By linkTerminosyCondiciones=By.id("tyc_Fijo");
	public By btnConsultar=By.id("edit-consult--2");
	private By objetoToAction;
	
	public void irAlSitio(String webSite) {
		actionsUtil.goToWebSide(getDriver(), webSite);
	}

	public void clicEn(String opcionPagaTuFactura) {
		switch(opcionPagaTuFactura) {
		case "HOGAR":
			setObjetoToCliked(btnHogar);
			break;
		case "MOVIL":
			setObjetoToCliked(btnMovil);
			break;
		}
		actionsUtil.clic(getDriver(), objetoToAction);
	}

	public By getObjetoToCliked() {
		return objetoToAction;
	}

	public void setObjetoToCliked(By objetoToCliked) {
		this.objetoToAction = objetoToCliked;
	}

	public void seleccionar(String tipoDocumento) {
		actionsUtil.selectContains(getDriver(), listTipoDocumento, tipoDocumento);
	}

	public void ingresar(String objeto, String txtIngresado) {
		switch(objeto) {
		case "número de documento":
			setObjetoToCliked(txtNumeroDocumento);
			break;
		}
		actionsUtil.setTextFieldSlowly(getDriver(), objetoToAction, txtIngresado);
	}

	public void compararTxt(String objeto, String valorEsperado) {
		switch(objeto) {
		case "número de documento":
			setObjetoToCliked(txtNumeroDocumento);
			break;
		}
	
		System.out.println("FALATA IMPLEMENTAR COMPARAR");
	}

	public void compararAtributo(String string, String string2, String string3) {
		System.out.println("FALATA IMPLEMENTAR COMPARAR ATRIBUTO");
	}


	
	
}
