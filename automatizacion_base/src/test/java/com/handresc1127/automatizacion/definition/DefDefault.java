package com.handresc1127.automatizacion.definition;

import com.handresc1127.automatizacion.pageobjects.PageDefault;
import com.handresc1127.automatizacion.utilities.ActionsUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefDefault {

	PageDefault pagePagaFact;

	// @Given("^Estoy en la página de inicio de pago de facturas \"([^\"]*)\"$")
	public void estoy_en_la_página_de_inicio_de_pago_de_facturas(String url) {
		String realUrl = ActionsUtil.updateUrlWithBaseUrlIfDefined(url);
		pagePagaFact.openAt(realUrl);
		pagePagaFact.irPagina(realUrl);
	}

	@Given("^Estoy en la página de inicio \"([^\"]*)\" en la url \"([^\"]*)\"$")
	public void estoy_en_la_página_de_inicio_en_la_url(String baseURL, String url) {
		pagePagaFact.setBaseURL(baseURL);
		estoy_en_la_página_de_inicio_de_pago_de_facturas(url);
	}

	@Then("^lo llevará a la página \"([^\"]*)\"$")
	public void lo_llevará_a_la_página(String url) {
		String realUrl = ActionsUtil.updateUrlWithBaseUrlIfDefined(url);
		pagePagaFact.comparUrlActual(realUrl);
	}

	// Implementación: " ADP-13_HU-002-ValidacionMSISDN"
	// Esto se puede cambiar por otra función que ya existe esperar por un elemento
	@Then("^La página se recarga$")
	public void la_página_se_recarga() {
		pagePagaFact.validarPagRecargada();
	}

	// Implementación: "ADP-3_HU-001-ValidacionTC"
	@Given("^Estoy en la página de selección de formas de pago con el tipo \"([^\"]*)\" seleccionado$")
	public void estoy_en_la_página_de_selección_de_formas_de_pago_con_el_tipo_seleccionado(String objeto) {
		pagePagaFact.esperarElementos("Formas de pago", ">", 3);
		pagePagaFact.clic(objeto);
		pagePagaFact.elementoVisible("Forma Pago Seleccionada");
	}

	@When("^Presiono la tecla \"([^\"]*)\"$")
	public void presiono_la_tecla(String tecla) {
		pagePagaFact.presionarTecla(tecla);
	}

	@When("^Presiono la tecla \"([^\"]*)\" sobre \"([^\"]*)\"$")
	public void presiono_la_tecla_sobre(String tecla, String objeto) {
		pagePagaFact.presionarTecla(tecla, objeto);
	}

	@When("^doy clic en \"([^\"]*)\"$")
	public void doy_clic_en(String objeto) {
		pagePagaFact.clic(objeto);
	}

	@When("^doy clic forzado en \"([^\"]*)\"$")
	public void doy_clic_forzado_en(String objeto) {
		pagePagaFact.hardClic(objeto);
	}

	@When("^doy clic en \"([^\"]*)\" si es visible$")
	public void doy_clic_en_si_es_visible(String objetos) {
		pagePagaFact.clicSiVisible(objetos);
	}

	@When("^selecciono \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void selecciono_la_opción_en_el_campo_Tipo_de_documento(String item, String objeto) {
		pagePagaFact.seleccionar(objeto, item);
	}

	@When("^ingreso \"([^\"]*)\" en el campo \"([^\"]*)\"$")
	public void ingreso_en_el_campo(String txtIngresado, String objeto) {
		pagePagaFact.validarEscribir(objeto, txtIngresado);
	}

	@Then("^el campo \"([^\"]*)\" tiene el texto \"([^\"]*)\"$")
	public void el_campo_tiene_el_texto(String objeto, String textoEsperado) {
		pagePagaFact.compararTxt(objeto, textoEsperado);
	}

	@Then("^el campo \"([^\"]*)\" tiene el atributo \"([^\"]*)\" en el valor \"([^\"]*)\"$")
	public void el_campo_tiene_el_atributo_en_el_valor(String objeto, String atributo, String valorEsperado) {
		pagePagaFact.compararAtributo(objeto, atributo, valorEsperado);
	}

	@Then("^mostrará en el valor del campo \"([^\"]*)\" el texto \"([^\"]*)\"$")
	public void mostrará_en_el_valor_del_campo_el_texto(String objeto, String valor) {
		pagePagaFact.compararAtributo(objeto, "value", valor);
	}

	@Then("^el campo \"([^\"]*)\" comienza con el texto \"([^\"]*)\"$")
	public void el_campo_comienza_con_el_texto(String objeto, String textoInicial) {
		pagePagaFact.compararTextoDeInicio(objeto, textoInicial);
	}

	@Then("^el campo \"([^\"]*)\" no está vacío$")
	public void el_campo_no_está_vacío(String objeto) {
		pagePagaFact.compararTextoNoVacio(objeto);
	}

	@Then("^el campo \"([^\"]*)\" no existe$")
	public void el_campo_no_existe(String objeto) {
		pagePagaFact.textoNoExiste(objeto);
	}

	@Then("^llevará al formulario con el objeto \"([^\"]*)\"$")
	public void llevará_al_formulario_con_el_objeto(String objeto) {
		pagePagaFact.elementoVisible(objeto);
	}

	@When("^voy a la pestaña \"([^\"]*)\"$")
	public void voy_a_la_pestaña(String tabPosition) {
		pagePagaFact.cambiarPestana(tabPosition);
	}

	@Then("^cerrar pestaña$")
	public void cerrar_pestaña() {
		pagePagaFact.cerrarPestanaActual();
	}

	// Ecommerce
	@When("^arrastro el elemento \"([^\"]*)\" hasta el elemento \"([^\"]*)\"$")
	public void arrastro_el_elemento_hasta_el_elemento(String objeto1, String objeto2) {
		pagePagaFact.arrastrarYSoltar(objeto1, objeto2);
	}

	// Ecommerce
	@When("^arrastro el elemento \"([^\"]*)\" hasta la posición \"([^\"]*)\"$")
	public void arrastro_el_elemento_hasta_la_posición(String objeto, String position) {
		pagePagaFact.arrastrarYSoltarXY(objeto, position);
	}

	@When("^Espero (\\d+) segundos$")
	public void espero_segundos(int sleep) {
		ActionsUtil.sleepSeconds(sleep);
	}

	@Then("^clasificar el dato \"([^\"]*)\" en \"([^\"]*)\" o en \"([^\"]*)\"$")
	public void clasificar_el_dato_en_o_en(String dataName, String dataClass1, String dataClass2) {
		pagePagaFact.clasificarDato(dataName, dataClass1, dataClass2);
	}

	@Then("^se borran cookies del navegador$")
	public void se_borran_cookies_del_navegador() {
		pagePagaFact.borraCookies();
	}

	// Implementación: SPIKE Solapamiento de campos
	@When("^se quiere visualizar con resolucion \"([^\"]*)\" x \"([^\"]*)\"$")
	public void se_quiere_visualizar_con_resolucion_x(String x, String y) {
		pagePagaFact.cambiarResolucion(x, y);
	}

	@When("^abro en el navegador el archivo \"([^\"]*)\"$")
	public void abro_en_el_navegador_el_archivo(String archivo) {
		pagePagaFact.nuevaPestana();
		pagePagaFact.cambiarPestana("ultima");
		pagePagaFact.abrirArchivo(archivo);
	}

	@Given("^obtener el otp del correo \"([^\"]*)\" y la contraseña \"([^\"]*)\" y guardarlo en \"([^\"]*)\"$")
	public void obtener_el_otp_del_correo_y_la_contraseña_y_guardarlo_en(String correo, String pas,
			String codigoVerificacion) {
		pagePagaFact.nuevaPestana();
		pagePagaFact.cambiarPestana("ultima");
		estoy_en_la_página_de_inicio_de_pago_de_facturas("https://app.mysms.com");
		doy_clic_en("login");
		doy_clic_en("iniciarcongmail");
		pagePagaFact.cambiarPestana("ultima");
		ingreso_en_el_campo(correo, "correogmail");
		doy_clic_en("siguiente");
		ingreso_en_el_campo(pas, "contrasenagmail");
		doy_clic_en("siguientec");
		pagePagaFact.cambiarPestana("segunda");
		pagePagaFact.obtenerSubString("ultimomensaje", 0, 4, codigoVerificacion);
	}
	
	@Given("^guardo el texto de \"([^\"]*)\" como \"([^\"]*)\"$")
	public void guardo_el_texto_de_como(String objeto, String dato) {
		pagePagaFact.guardarString(objeto,dato);
	}

	@Given("^concateno \"([^\"]*)\" con \"([^\"]*)\" y se guarda en \"([^\"]*)\"$")
	public void concateno_con_y_se_guarda_en(String string1, String string2, String datakey) {
		
		pagePagaFact.concatenar(string1,string2,datakey);
	}
}
