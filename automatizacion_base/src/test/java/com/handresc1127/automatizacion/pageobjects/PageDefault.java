package com.handresc1127.automatizacion.pageobjects;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.objectsmap.DatosNegocio;
import com.handresc1127.automatizacion.objectsmap.ObjetosEcommerce;
import com.handresc1127.automatizacion.objectsmap.ObjetosMiCuenta;
import com.handresc1127.automatizacion.objectsmap.ObjetosPagaTuFactura;
import com.handresc1127.automatizacion.objectsmap.ObjetosRecargasPaquetes;
import com.handresc1127.automatizacion.utilities.ActionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://transaccionesco-uat.tigocloud.net/servicios/facturas")
public class PageDefault extends PageObject {

	public PageDefault() {
		if (ActionsUtil.objetosIsEmpty()) {
			new ObjetosPagaTuFactura();
			new ObjetosRecargasPaquetes();
			new ObjetosEcommerce();
			new ObjetosMiCuenta();
		}
	}

	By objetoToAction=By.xpath("/html/body");

	public void irPagina(String url) {
		String urlActualizada = ActionsUtil.updateUrlWithBaseUrlIfDefined(url);
		ActionsUtil.goToWebSide(getDriver(), urlActualizada);
	}

	public void setBaseURL(String url) {
		String realUrl = DatosNegocio.dataGet(ActionsUtil.textoMinusculasSinEspacios(url));
		ActionsUtil.setBaseUrl(realUrl);
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

	public void hardClic(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.ejecutarScript(getDriver(), "arguments[0].click();", getObjetoToCliked());
	}

	public void clicSiVisible(String objetos) {
		sharedObjet(objetos);
		ActionsUtil.clicIfDisplayed(getDriver(), getObjetoToCliked());
	}

	public void tieneHijos(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.getTableDiv(getDriver(), getObjetoToCliked());
	}

	public void presionarTecla(String tecla) {
		ActionsUtil.presionarTecla(getDriver(), getObjetoToCliked(), tecla);
	}
	
	public void presionarTecla(String tecla,String objeto) {
		sharedObjet(objeto);
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
		item = DatosNegocio.dataGet(item);
		ActionsUtil.selectContains(getDriver(), getObjetoToCliked(), item);
	}

	public void validarEscribir(String objeto, String txtIngresado) {
		sharedObjet(objeto);
		txtIngresado = DatosNegocio.dataGet(txtIngresado);
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), txtIngresado);
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

	public void textoNoExiste(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.noExiste(getDriver(), getObjetoToCliked());
	}

	public void esperarElementos(String objeto, String condicion, int cantidad) {
		sharedObjet(objeto);
		ActionsUtil.waitForXElements(getDriver(), getObjetoToCliked(), condicion, cantidad);
	}

	public void arrastrarYSoltar(String objeto1, String objeto2) {
		sharedObjet(objeto1);
		By obj1 = getObjetoToCliked();
		sharedObjet(objeto2);
		By obj2 = getObjetoToCliked();
		ActionsUtil.dragAndDrop(getDriver(), obj1, obj2);
	}

	public void arrastrarYSoltarXY(String objeto, String position) {
		sharedObjet(objeto);
		By byElement = getObjetoToCliked();
		String[] pos = ActionsUtil.textoMinusculasSinEspacios(position).split(",");
		int x = Integer.parseInt(pos[0]);
		int y = Integer.parseInt(pos[1]);
		ActionsUtil.dragAndDrop(getDriver(), byElement, x, y);
	}

	public void clasificarDato(String dataValue, String dataClass1, String dataClass2) {
		sharedObjet(dataClass1);
		By objClass1 = getObjetoToCliked();
		sharedObjet(dataClass2);
		By objClass2 = getObjetoToCliked();
		int indexClass = ActionsUtil.byShared(getDriver(), objClass1, objClass2);
		if (indexClass == 1) {
			DatosNegocio.dataPut(ActionsUtil.textoMinusculasSinEspacios(dataClass1), dataValue);
		} else if (indexClass == 2) {
			DatosNegocio.dataPut(ActionsUtil.textoMinusculasSinEspacios(dataClass2), dataValue);
		}

	}

	public void comparUrlActual(String urlEsperada) {
		ActionsUtil.curretCompareURL(getDriver(), urlEsperada);
	}

	public void cambiarPestana(String tabPosition) {
		int indexTab;
		try {
			indexTab = Integer.parseInt(tabPosition);
		} catch (Exception e) {
			indexTab = 0;
		}
		if (indexTab == 0) {
			switch (ActionsUtil.textoMinusculasSinEspacios(tabPosition)) {
			case "primera":
				indexTab = 1;
				break;
			case "segunda":
				indexTab = 2;
				break;
			case "tercera":
				indexTab = 3;
				break;
			default:
				indexTab = 100;
				break;
			}
		}
		ActionsUtil.switchWindowsTab(getDriver(), indexTab);
	}

	public void cerrarPestanaActual() {
		ActionsUtil.closeCurrentWindowsTab(getDriver());
	}

	public void cambiarResolucion(String x, String y) {
		ActionsUtil.resolucion(getDriver(), x, y);
	}

	public void borraCookies() {
		ActionsUtil.borrarCookies(getDriver());
	}

	public void nuevaPestana() {
		ActionsUtil.openNewTab(getDriver(),getObjetoToCliked());
	}

}
