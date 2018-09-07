package com.handresc1127.automatizacion.pageobjects;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.co/")
public class PagePagaTuFacturaMovil extends PageObject {

	public By txtTuLineaTigo = By.id("edit-candidate-number");
	//public By txtCorreoElectronico = By.id("edit-email");
	public By txtCorreoElectronico = By.xpath("//*[@id='edit-email']");
	public By btnConsultar = By.id("edit-consult");

	private By objetoToAction;

	public void irPagina(String url) {
		actionsUtil.goToWebSide(getDriver(), url);
	}

	public void clicEn(String opcion) {

		switch (opcion) {
		case "Tu línea Tigo":
			setObjetoToCliked(txtTuLineaTigo);
			break;
		case "Consultar":
			setObjetoToCliked(btnConsultar);
			break;
		}

		actionsUtil.clic(getDriver(), getObjetoToCliked());
	}

	public By getObjetoToCliked() {
		return objetoToAction;
	}

	public void setObjetoToCliked(By objetoToCliked) {
		this.objetoToAction = objetoToCliked;
	}

	public void escribir(String objeto, String texto) {

		switch (objeto) {

		case "Tu línea Tigo":
			setObjetoToCliked(txtTuLineaTigo);
			break;
		case "Correo electrónico":
			setObjetoToCliked(txtCorreoElectronico);
			break;
		case "Consultar":
			setObjetoToCliked(btnConsultar);
			break;
		}

		actionsUtil.setTextFieldSlowly(getDriver(), objetoToAction, texto);
	}

	public void botonInabilitado() {
		
	}

	public void mensaje() {
		
	}

}
