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
	public By btnConfirmar= By.id("edit-consult");
	public By txtCorreo= By.id("edit-email");
	public By objeto = By.xpath("//*[@id='alert_main']/div/p");
    public By lbMsgError=By.id("alert_main");
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
	
	public void setObjetoToCliked(By objetoToCliked) {
		this.objetoToAction = objetoToCliked;
	}
	
}
