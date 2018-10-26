package com.handresc1127.automatizacion.pageobjects;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.objectsmap.ObjetosEcommerce;
import com.handresc1127.automatizacion.objectsmap.ObjetosPagaTuFactura;
import com.handresc1127.automatizacion.objectsmap.ObjetosRecargasPaquetes;
import com.handresc1127.automatizacion.utilities.ActionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://transaccionesco-uat.tigocloud.net/servicios/facturas")
public class PageDefault extends PageObject {

	public PageDefault() {
		new ObjetosPagaTuFactura();
		new ObjetosRecargasPaquetes();
		new ObjetosEcommerce();
	}

	By objetoToAction;
	
	static HashMap<String, String> datosClasificados = new HashMap<String, String>();

	public static String dataGet(String keyData) {
		String retorno = datosClasificados.get(ActionsUtil.textoMinusculasSinEspacios(keyData));
		if (retorno == null)
			retorno = keyData;
		return retorno;
	}

	public static void dataPut(String key, String value){
		datosClasificados.put(key, value);
		System.out.println(datosClasificados.toString());
	}

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
		String nombreObjeto = (ActionsUtil.textoMinusculasSinEspacios(opcion));
		By byObjeto = ActionsUtil.getObjeto(nombreObjeto);
		setObjetoToCliked(byObjeto);
	}

	public void clic(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
	}

	public void tieneHijos(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.getTableDiv(getDriver(), getObjetoToCliked());
	}

	public void presionarTecla(String tecla) {
		ActionsUtil.presionarTecla(getDriver(), getObjetoToCliked(), tecla);
	}

	public void compararTxt(String objeto, String valorEsperado) {
		sharedObjet(objeto);
		ActionsUtil.compareText(getDriver(), getObjetoToCliked(), valorEsperado);
	}

	public void compararAtributo(String objeto, String atributo, String valorEsperado) {
		sharedObjet(objeto);
		switch (ActionsUtil.textoMinusculasSinEspacios(valorEsperado)) {
		case "rojo":
			valorEsperado = "rgba(240, 30, 70, 1)";
			break;
		case "azul":
			valorEsperado = "rgb(0, 200, 255)";
			break;
		case "blanco":
			valorEsperado = "rgba(255, 255, 255, 1)";
			break;
		case "rojo_rgb":
			valorEsperado = "rgb(240, 30, 70)";
			break;
		case "blanco_rgb":
			valorEsperado = "rgb(255, 255, 255)";
			break;
		}
		ActionsUtil.compareAtributo(getDriver(), getObjetoToCliked(), atributo, valorEsperado);
	}

	public void seleccionar(String objeto, String item) {
		sharedObjet(objeto);
		ActionsUtil.selectContains(getDriver(), getObjetoToCliked(), item);
	}

	public void validarEscribir(String objeto, String txtIngresado) {
		sharedObjet(objeto);
		txtIngresado=dataGet(txtIngresado);
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), txtIngresado);
		ActionsUtil.clicParent(getDriver(), getObjetoToCliked());
	}

	public void validarPagRecargada() {
		ActionsUtil.highlightElement(getDriver(), getObjetoToCliked());
	}

	public void elementoVisible(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.highlightElement(getDriver(), getObjetoToCliked());
	}

	public void compararTextoDeInicio(String objeto, String textoInicial) {
		sharedObjet(objeto);
		ActionsUtil.compareTextStart(getDriver(), getObjetoToCliked(), textoInicial);
	}

	public void compararTextoNoVacio(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.compareTextNotEmpty(getDriver(), getObjetoToCliked());
	}

	public void hardClic(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.ejecutarScript(getDriver(), "arguments[0].click();", getObjetoToCliked());
	}

	public void esperarElementos(String objeto, String condicion, int cantidad) {
		sharedObjet(objeto);
		ActionsUtil.waitForXElements(getDriver(), getObjetoToCliked(), condicion, cantidad);
	}

	public void ArrastrarYSoltar(String objeto1, String objeto2) {
		sharedObjet(objeto1);
		By obj1 = getObjetoToCliked();
		sharedObjet(objeto2);
		By obj2 = getObjetoToCliked();
		ActionsUtil.dragAndDrop(getDriver(), obj1, obj2);
	}

	public void ArrastrarYSoltarXY(String objeto, String position) {
		sharedObjet(objeto);
		By byElement = getObjetoToCliked();
		String pos[] = ActionsUtil.textoMinusculasSinEspacios(position).split(",");
		int x = Integer.parseInt(pos[0]);
		int y = Integer.parseInt(pos[1]);
		ActionsUtil.dragAndDrop(getDriver(), byElement, x, y);
	}

	public void clasificarDato(String dataValue, String dataClass1, String dataClass2) {
		sharedObjet(dataClass1);
		By objClass1 = getObjetoToCliked();
		sharedObjet(dataClass2);
		By objClass2 = getObjetoToCliked();
		int indexClass=ActionsUtil.byShared(getDriver(),objClass1,objClass2);
		if(indexClass==1) {
			dataPut(ActionsUtil.textoMinusculasSinEspacios(dataClass1),dataValue);
		}else if(indexClass==2) {
			dataPut(ActionsUtil.textoMinusculasSinEspacios(dataClass2),dataValue);
		}
		
	}

}
