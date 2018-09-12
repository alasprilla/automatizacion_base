package com.handresc1127.automatizacion.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.co/")
public class PagePagaTuFacturaMovil extends PageObject {

	public By txtTuLineaTigo = By.id("edit-candidate-number");
	public By txtCorreoElectronico = By.xpath("//*[@id='edit-email']");
	public By msgErrorCorreoElectronico = By.xpath("//*[@id='content_right_forms_unified']/div/div[1]/span");
	public By msgErrorCelular = By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span");
	public By btnConsultar = By.id("edit-consult");
	public By txtMsisdn = By.id("edit-candidate-number");
	public By btnConfirmar = By.id("edit-consult");
	public By txtCorreo = By.id("edit-email");
	public By objeto = By.xpath("//*[@id='alert_main']/div/p");
	public By lbMsgError = By.id("alert_main");

	private By objetoToAction;
	private String msisdn = "";

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

		this.msisdn = texto;
		actionsUtil.setTextFieldSlowly(getDriver(), objetoToAction, texto);
	}

	public void mensaje(String msgError) {
		actionsUtil.compareText(getDriver(), msgErrorCorreoElectronico, msgError);
	}

	public void mensajeC(String msgErrorCel) {
		actionsUtil.compareText(getDriver(), msgErrorCelular, msgErrorCel);
	}

	public void colorTextoMensaje(String atributo, String valorEsperado) {
		actionsUtil.compareAtributo(getDriver(), msgErrorCorreoElectronico, atributo, valorEsperado);
	}

	public void botonInabilitado(String objeto, String atributo, String valorEsperado) {
		setObjetoToCliked(btnConsultar);
		actionsUtil.compareAtributo(getDriver(), objetoToAction, atributo, valorEsperado);
		actionsUtil.generarTab(1);
	}

	public void irAlaPagina(String url) {
		actionsUtil.goToWebSide(getDriver(), url);
	}

	public void seleccionCelular() {
		actionsUtil.clic(getDriver(), txtMsisdn);
	}

	public void escribirCelular(String numcelular) throws AWTException {
		actionsUtil.setTextFieldSlowly(getDriver(), txtMsisdn, numcelular);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	public void seleccionCorreo() {
		actionsUtil.clic(getDriver(), txtCorreo);

	}

	public void escribirCorreo(String correo) throws AWTException {
		actionsUtil.setTextFieldSlowly(getDriver(), txtCorreo, correo);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void presionBotonConfirmar() {
		actionsUtil.clic(getDriver(), btnConfirmar);
	}

	public void compararMensaje(String txtmensaje) {

		actionsUtil.compareText(getDriver(), objeto, txtmensaje);
	}

	public void compararAtributo(String atributo, String valorEsperado) {

		setObjetoToCliked(lbMsgError);

		actionsUtil.compareAtributo(getDriver(), objetoToAction, atributo, valorEsperado);
	}

	public void presionarTecla(String tecla) {
		actionsUtil.presionarTeclaRobot(tecla);
	}

	public void compararTextoInicial() {

		String textoInicial = msisdn;
		actionsUtil.clic(getDriver(), objetoToAction);
		String textoFinal = actionsUtil.getTextAttribute(getDriver(), objetoToAction);

		actionsUtil.validateMSISDNIni(textoInicial, textoFinal);

	}

	public void compararTextoFinal() {

		String textoInicial = msisdn;
		actionsUtil.clic(getDriver(), objetoToAction);
		String textoFinal = actionsUtil.getTextAttribute(getDriver(), objetoToAction);

		actionsUtil.validateMSISDNFin(textoInicial, textoFinal);
	}

}
