package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosMiCuenta {
	
	public ObjetosMiCuenta () {
		
		
		/*------------------------------------------- PANTALLA 1 ---------------------------------------------------*/
		ActionsUtil.objetosPut("ingresaramicuenta", 		By.xpath("//*[@id='top_menu_aside']/nav/ul/li/a|//*[@id='account-mobile-selector']"));
		ActionsUtil.objetosPut("iniciarsesion", 			By.xpath("//*[@id='top_menu_aside']/nav/ul/li/ul/li/a|//*[@id='account-mobile-menu']/nav/ul/li/a"));
		ActionsUtil.objetosPut("ingresar", 					By.xpath("//*[@id='main-content']/div[2]/div[2]/div/div/div/section/div[3]/a[2]"));
		ActionsUtil.objetosPut("descubreloya", 				By.xpath("//*[@id='main-content']/div[2]/div[1]/div/div/div/section/div/div/a"));
		ActionsUtil.objetosPut("registrarme", 				By.xpath("//*[@id='main-content']/div[2]/div[2]/div/div/div/section/div[3]/a[1]"));
		/*----------------------------------------------------------------------------------------------------------*/
		ActionsUtil.objetosPut("pagatusfacturas", 			By.xpath("//*[contains(@href,'/servicios/facturas')]"));
	    ActionsUtil.objetosPut("recargasypaquetes", 		By.xpath("//*[contains(@href,'/servicios/paquetes')]"));
	    ActionsUtil.objetosPut("registratuequipo", 			By.xpath("//*[contains(@href,'/registra-tu-equipo')]")); 
	    ActionsUtil.objetosPut("reponetusim", 				By.xpath("//*[contains(@href,'reposicion-sim-card')]"));
	    /*----------------------------------------------------------------------------------------------------------*/
	    ActionsUtil.objetosPut("consultapqrune", 			By.xpath("//*[contains(@href,'/quejas')]"));
	    ActionsUtil.objetosPut("consultapqrtigo", 			By.xpath("//*[contains(@href,'/GestionPqrOnLineWEB')]"));
		ActionsUtil.objetosPut("consultasic", 				By.xpath("//*[contains(@href,'/consultaCUNSIC')]"));
		ActionsUtil.objetosPut("nuestrastiendas", 			By.xpath("//*[contains(@href,'/tiendas')]"));
		/*----------------------------------------------------------------------------------------------------------*/
		/*------------------------------------------- PANTALLA 2 ---------------------------------------------------*/
		/*----------------------------------------------------------------------------------------------------------*/
		ActionsUtil.objetosPut("seleccionmsisdn", 			By.xpath("//*[@id='account-mobile-selector']|//*[@id='block-accountsblock-2']//span[@class='line']"));
		ActionsUtil.objetosPut("lineaarmatuplan1", 			By.xpath("((//*[@id='lines'])//a[contains(.,'3008819838')])"));
		ActionsUtil.objetosPut("nolineaarmatuplan1", 		By.xpath("((//*[@id='lines'])//a[not(contains(.,'3008819838'))])"));
		ActionsUtil.objetosPut("lineaarmatuplan", 			By.xpath("((//*[@id='lines'])//a[contains(.,'3008913170')])"));
		ActionsUtil.objetosPut("nolineaarmatuplan", 		By.xpath("((//*[@id='lines'])//a[not(contains(.,'3008913170'))])"));
		ActionsUtil.objetosPut("lineaprepago", 	        	By.xpath("((//*[@id='lines'])//a[contains(.,'Prepago - Mi linea Tigo')])"));
		ActionsUtil.objetosPut("nolineaprepago", 	  	  	By.xpath("((//*[@id='lines'])//a[not(contains(.,'Prepago - Mi linea Tigo'))])"));
		ActionsUtil.objetosPut("lineahibrido",   			By.xpath("((//*[@id='lines'])//a[contains(.,'Hibrido - Mi linea Tigo')])"));
		ActionsUtil.objetosPut("nolineahibrido", 			By.xpath("((//*[@id='lines'])//a[not(contains(.,'Hibrido - Mi linea Tigo'))])"));
		ActionsUtil.objetosPut("lineafija",            	 	By.xpath("((//*[@id='lines'])//a[contains(.,'CL 61 # 56 - 51 IN 1701')])"));
		ActionsUtil.objetosPut("nolineafija",           	By.xpath("((//*[@id='lines'])//a[not(contains(.,'CL 61 # 56 - 51 IN 1701'))])"));
		ActionsUtil.objetosPut("lineafijacontelefono",  	By.xpath("((//*[@id='lines'])//a[contains(.,'CL 65 SUR # 42 B - 14 IN 1610')])"));
		ActionsUtil.objetosPut("nolineafijacontelefono",    By.xpath("((//*[@id='lines'])//a[not(contains(.,'CL 65 SUR # 42 B - 14 IN 1610'))])"));
		ActionsUtil.objetosPut("lineafijawifi",             By.xpath("((//*[@id='lines'])//a[contains(.,'CL 3 B # 79 B - 28 IN 502')])"));
		ActionsUtil.objetosPut("nolineafijawifi",           By.xpath("((//*[@id='lines'])//a[not(contains(.,'CL 3 B # 79 B - 28 IN 502'))])"));
		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------- menu options -----------------------------------------------------*/
		ActionsUtil.objetosPut("resumen", 					By.xpath("(*//a[contains(.,'Resumen')])"));
		ActionsUtil.objetosPut("facturacion", 				By.xpath("//*[contains(@href,'/movil/facturacion')]|//*[contains(@href,'/hogar/facturacion')]"));
		ActionsUtil.objetosPut("saldos", 					By.xpath("//*[contains(@href,'/movil/saldos')]"));
		ActionsUtil.objetosPut("servicios",					By.xpath("//*[contains(@href,'/hogar/servicios')]"));
	    ActionsUtil.objetosPut("administrarservicios", 		By.xpath("//*[contains(@href,'/miscuentas')]"));
	    ActionsUtil.objetosPut("consultapqr", 				By.xpath("//*[contains(@href,'/mis-pqr')]"));
	    ActionsUtil.objetosPut("mejoraplan", 				By.xpath("//*[contains(@href,'/movil/mejora-tu-plan')]"));
	    ActionsUtil.objetosPut("soportetecnico", 			By.xpath("//*[contains(@href,'/movil/soporte-tecnico')]"));
	    /*-------------------------- mensajes de confirmacion y de errores -----------------------------------------*/
	    ActionsUtil.objetosPut("mensajeconfirmacion", 		By.xpath("/html/body/div[3]/div[1]/div/div/div/div[2]"));
	    /*------------------------------------------- dmz ----------------------------------------------------------*/
	    ActionsUtil.objetosPut("productointernetdetalles",  By.xpath("//*[@class='product internet']//*[@id='action_Detalles']"));
	    ActionsUtil.objetosPut("cambiardmzdelwifi",     	By.xpath("//*[contains(@href,'/hogar/servicios/cambiar_dmz_red_wifi/')]"));
	    ActionsUtil.objetosPut("ingresaripdmz",     		By.xpath("//*[@id='edit-ipdmz']"));
	    /*----------------------------------------------------------------------------------------------------------*/
	    
		ActionsUtil.objetosPut("correomicuenta", 			By.id("idEmail"));
		ActionsUtil.objetosPut("correoelectronicofijo", 	By.id("edit-email"));
	    ActionsUtil.objetosPut("ok", 						By.id("edit-submit"));
		ActionsUtil.objetosPut("contrasena", 				By.id("password"));
		ActionsUtil.objetosPut("validar", 					By.id("continueBtn"));
		ActionsUtil.objetosPut("cambiarcuenta", 			By.id("addNew"));
		ActionsUtil.objetosPut("cambiateya", 				By.id("action_Cámbiate ya"));
		ActionsUtil.objetosPut("pqrune", 					By.id("iframePQR"));
		ActionsUtil.objetosPut("agregartarjeta", 			By.id("action_Agregar tarjeta"));
		ActionsUtil.objetosPut("modificarfacturacion", 		By.id("action_Modificar"));
		ActionsUtil.objetosPut("pagarfactura", 				By.id("action_Pagar"));
	    ActionsUtil.objetosPut("centrodeayuda", 			By.id("action_CENTRO DE AYUDA"));
	    ActionsUtil.objetosPut("tienda", 					By.id("action_TIENDAS"));
	    ActionsUtil.objetosPut("tiendas", 					By.xpath("/html/body/content/div[2]/div/section[1]/div/div/h3"));
	    ActionsUtil.objetosPut("recargarmicuenta", 			By.id("action_Recargar"));
	    ActionsUtil.objetosPut("transferir", 				By.id("action_Transferir"));
	    ActionsUtil.objetosPut("ultimafacturapdf", 			By.id("action_Última factura PDF"));
	    ActionsUtil.objetosPut("historicoultimafacturapdf", By.xpath("//*[@id='main-content']/div[2]/div[3]/div/section[1]/div/div/div/table/tbody/tr[1]/td[4]/div"));
	    ActionsUtil.objetosPut("activatufacturaelectronica",By.id("action_Activa tu factura electrónica"));
	    ActionsUtil.objetosPut("montoacompartir", 			By.id("edit-value-transfer"));
	    ActionsUtil.objetosPut("numerodeldestinatario", 	By.id("edit-line-transfer"));
	    ActionsUtil.objetosPut("numerodocumento", 			By.id("edit-document-number"));
		ActionsUtil.objetosPut("usuario", 					By.xpath("//*[@id='top_menu_aside']/nav/ul/li/a"));
		ActionsUtil.objetosPut("cerrarsesion", 				By.xpath("//*[@id='top_menu_aside']/nav/ul/li/ul/li[2]/a"));
		ActionsUtil.objetosPut("planes", 					By.xpath("//*[@id='main-content']/div[2]"));
		ActionsUtil.objetosPut("cambiarmiclave", 			By.xpath("//*[@id='main-content']/div[2]/div[7]/div/div/div/div/div[2]/a"));
		ActionsUtil.objetosPut("productoscontratados", 	  	By.xpath("//*[@id='main-content']/div[2]/div/div/section/div/div/div"));
	    ActionsUtil.objetosPut("agregartarjetadecredito", 	By.xpath("//*[@id='main-content']/div[2]/div/div/section[2]/div/h2"));
		ActionsUtil.objetosPut("pqrtigo", 					By.xpath("//*[@id='formInicioPqr:panelBotonesInicio']/thead/tr/th/span"));
		ActionsUtil.objetosPut("mejorarplan", 				By.xpath("//*[@id='compras-noplan-container']/h3"));
		ActionsUtil.objetosPut("detalleplan", 				By.xpath("//*[@id='compras-noplan-container']/p"));
		ActionsUtil.objetosPut("ingresatudocumento", 		By.xpath("//*[@id='document']"));
		ActionsUtil.objetosPut("tipoul", 					By.xpath("//*[@id='t_document']/div/div/ul"));
		ActionsUtil.objetosPut("tipoulcc", 					By.xpath("//*[@id='t_document']/div/div/ul/li[1]"));
		ActionsUtil.objetosPut("tipoulce", 					By.xpath("//*[@id='t_document']/div/div/ul/li[2]"));
		ActionsUtil.objetosPut("tipoulnit", 				By.xpath("//*[@id='t_document']/div/div/ul/li[3]"));
		ActionsUtil.objetosPut("tipoulps", 					By.xpath("//*[@id='t_document']/div/div/ul/li[4]"));
		ActionsUtil.objetosPut("tipodocumentomitigo", 		By.xpath("//*[@id='t_document']/div/div/input"));
		ActionsUtil.objetosPut("consultar", 				By.xpath("//*[@id='findagenda']/div[2]/div[2]/button"));
		ActionsUtil.objetosPut("mensajeerrordocumento", 	By.xpath("//*[@id='query-container']/section/div[1]/span[2]"));
		ActionsUtil.objetosPut("visitaspendientes", 		By.xpath("//*[@id='schedule-visits-container']/div[2]/div[1]/div/p"));
		ActionsUtil.objetosPut("sic", 						By.xpath("//*[@id='contenido_medio']/div[1]/h1"));
	    ActionsUtil.objetosPut("comprar", 					By.xpath("//*[@id='block-bannerdepromocionesrecargasypaquetes']/div/div[2]/div[1]/div[1]/div/li/div/a"));
	    ActionsUtil.objetosPut("personalizaredwifi", 		By.xpath("//*[@id='query-container']/section/div/h3"));
	    ActionsUtil.objetosPut("repone", 					By.xpath("//*[@id='group-header-0']/div[1]/div/div/h2/span"));
	    ActionsUtil.objetosPut("documento", 				By.xpath("//*[@id='edit-container']/div[1]/div/div/div"));
	    ActionsUtil.objetosPut("cc", 						By.xpath("//*[@id='edit-container']/div[1]/div/div/div/ul/li[1]"));
	    ActionsUtil.objetosPut("impresa", 					By.xpath("//*[@id='edit-container']/div[3]/label"));
	    ActionsUtil.objetosPut("electronica", 				By.xpath("//*[@id='edit-container']/div[1]/label"));
	    ActionsUtil.objetosPut("confirmartransferencia", 	By.xpath("//*[contains(@id,'edit-next--')]"));
	    ActionsUtil.objetosPut("pagartufactura", 			By.xpath("//*[@id='main-content']/section/div/div/h2"));
	    ActionsUtil.objetosPut("menuinferior", 				By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div"));
	    ActionsUtil.objetosPut("consultaramiasesor", 		By.xpath("//*[@id='asesor-container']/section/div/a"));
	    ActionsUtil.objetosPut("continuarmicuenta", 		By.xpath("/html/body/div[2]/div/form/div[3]/button"));
		ActionsUtil.objetosPut("creatucuenta", 				By.xpath("/html/body/div[2]/div/div[1]/h5"));
		ActionsUtil.objetosPut("realizarregistrodeequipo", 	By.xpath("/html/body/content/div[2]/div/div/section/div/div/div/div/div/div/a"));
	    ActionsUtil.objetosPut("referenciadepago",          By.xpath("//*[@id='main-content']/div[2]/div[1]/div/section/div/div/div/div/div[5]/div"));
	    ActionsUtil.objetosPut("consumos",                  By.xpath("//*[contains(@href,'consumos')]"));
	    ActionsUtil.objetosPut("fechayhoradatos",           By.xpath("//*[contains(text(),'Datos')]/..//*[contains(text(),'Fecha y Hora')]"));
	    ActionsUtil.objetosPut("diadatos", 	                By.xpath("//*[contains(text(),'Datos')]/..//*[contains(text(),'Día')]"));
	    ActionsUtil.objetosPut("consumodatos", 	            By.xpath("//*[contains(text(),'Datos')]/..//*[contains(text(),'Consumo')]"));
	    ActionsUtil.objetosPut("fechainicialllamadas",      By.id("edit-date-from"));
	    ActionsUtil.objetosPut("fechafinalllamadas",        By.id("edit-date-till"));
	    ActionsUtil.objetosPut("diadelcalendariollamadas",  By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[1]/table/tbody/tr[3]/td[2]"));
	    ActionsUtil.objetosPut("diadelcalendariofinalllamadas", By.xpath("/html/body/div[6]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[5]"));
	    ActionsUtil.objetosPut("okfecha",                   By.xpath("//*[contains(@class,'dtp-btn-ok')]"));
	    ActionsUtil.objetosPut("okfechafinal",              By.xpath("/html/body/div[6]/div/div[2]/button[4]"));
	    ActionsUtil.objetosPut("verllamadas",               By.id("edit-send"));
	    ActionsUtil.objetosPut("vermensajes",               By.id("edit-send--2"));
	    ActionsUtil.objetosPut("fechayhorallamadas",        By.xpath("//*[contains(text(),'LLamadas')]/..//*[contains(text(),'Fecha y Hora')]"));
	    ActionsUtil.objetosPut("fechayhoramensajes",        By.xpath("//*[contains(text(),'Mensajes')]/..//*[contains(text(),'Fecha y Hora')]"));
	    ActionsUtil.objetosPut("destinollamadas",           By.xpath("//*[contains(text(),'LLamadas')]/..//*[contains(text(),'Destino')]"));
	    ActionsUtil.objetosPut("destinomensajes",           By.xpath("//*[contains(text(),'Mensajes')]/..//*[contains(text(),'Destino')]"));
	    ActionsUtil.objetosPut("duracionllamadas",          By.xpath("//*[contains(text(),'LLamadas')]/..//*[contains(text(),'Duración')]"));
	    ActionsUtil.objetosPut("mesanteriorfechainicial",   By.xpath("/html/body/div[4]/div/div/div[1]/div[1]/div[1]"));
	    ActionsUtil.objetosPut("mesanteriorfechafinal",     By.xpath("/html/body/div[6]/div/div[1]/div[1]/div[1]/div[1]"));
	    ActionsUtil.objetosPut("productotelevisiondetalles",By.xpath("//*[@class='product television']//*[@id='action_Detalles']"));
	    ActionsUtil.objetosPut("planproducto",              By.xpath("//*[@id='main-content']/div[2]/div/div/section[2]/div/div/div[1]/div/div[1]/div[2]/div/div[1]/span"));
	    ActionsUtil.objetosPut("numerosuscripcionproducto", By.xpath("//*[@id='main-content']/div[2]/div/div/section[2]/div/div/div[1]/div/div[1]/div[2]/div/div[2]/span"));
	    ActionsUtil.objetosPut("direccionubicacionproducto",By.xpath("//*[@id='main-content']/div[2]/div/div/section[2]/div/div/div[1]/div/div[2]/div/div[1]/span"));
	    ActionsUtil.objetosPut("informaciondedispositivos", By.xpath("//*[@id='main-content']/div[2]/div/div/section[2]/div/div/div[1]/div/span"));
	    ActionsUtil.objetosPut("productotelefoniadetalles", By.xpath("//*[@class='product telefonia']//*[@id='action_Detalles']"));
	    ActionsUtil.objetosPut("historicodeconsumo",        By.xpath("//*[contains(@href,'/hogar/servicios/historico/consumo/')]"));
	    ActionsUtil.objetosPut("estadocadapqr",	 			By.xpath("//*[@id='pqr-container']//*[@ng-repeat='pqr in pqrs']"));
	    ActionsUtil.objetosPut("estadospqrs",	 			By.xpath("//*[@id='pqr-container']"));
	    ActionsUtil.objetosPut("detalleconsumo",            By.xpath("//*[@id='table_group_month']"));
	    ActionsUtil.objetosPut("verdetalle",                By.xpath("//*[@id='table_group_month']//*[contains(@value,'Ver Detalle')]"));
	    ActionsUtil.objetosPut("fechaconsumo",              By.xpath("//*[@id='table_group_day']/form/div[1]/table/tbody/tr[1]/td[1]/div/span"));
	    ActionsUtil.objetosPut("cambiarcanalwifi",          By.xpath("//*[contains(@href,'/hogar/servicios/cambiar_canal_wifi/')]"));
	    ActionsUtil.objetosPut("nuevocanal",                By.xpath("//*[@id='home-change-channel-network-form']/div[1]/div/div/input"));
	    ActionsUtil.objetosPut("canal3",                    By.xpath("/html/body/div[3]/div[2]/div/section/div/section/div/div/form/div[1]/div/div/ul/li[4]"));
	    ActionsUtil.objetosPut("canalautomatico",           By.xpath("/html/body/div[3]/div[2]/div/section/div/section/div/div/form/div[1]/div/div/ul/li[1]"));
	    ActionsUtil.objetosPut("aceptarcambiocanal",        By.id("edit-submit"));
	    ActionsUtil.objetosPut("mensajecambiocanal",        By.xpath("/html/body/div[3]/div[1]/div/div/div/div[2]"));
	}
	
}