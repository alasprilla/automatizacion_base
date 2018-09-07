package com.handresc1127.automatizacion.pageobjects;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import static org.junit.Assert.assertTrue;

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
    public By lbMsgErrorDoc=By.xpath("//*[@id='alert_main']/div/p");
	private By objetoToAction;
    
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
	public void escribirCorreo(String correo) {
		actionsUtil.setTextFieldSlowly(getDriver(), txtCorreo, correo);
	}
	
	public void presionBotonConfirmar() {
		actionsUtil.clic(getDriver(), btnConfirmar);
	}
	
	public void compararMensaje(String objeto,String txtmensaje) {

		switch(actionsUtil.textoMinusculasSinEspacios(objeto)) {
		case "numerodelinea":
			setObjetoToCliked(txtMsisdn);
			break;
			
		case "labelerrordocumento":
			setObjetoToCliked(lbMsgErrorDoc);
			break;
		default: assertTrue(false);
		}
		actionsUtil.compareText(getDriver(), objetoToAction, txtmensaje);
	}
	
	public void compararAtributo(String objeto, String atributo, String txtmensaje) {
		switch(actionsUtil.textoMinusculasSinEspacios(objeto)) {
		case "numerodelinea":
			setObjetoToCliked(txtMsisdn);
			break;

		case "labelerrordocumento":
			setObjetoToCliked(lbMsgErrorDoc);
			break;
		default: assertTrue(false);
		}
		actionsUtil.compareAtributo(getDriver(), objetoToAction, objeto, txtmensaje);
	}
	
	public void setObjetoToCliked(By objetoToCliked) {
		this.objetoToAction = objetoToCliked;
	}
	
}
