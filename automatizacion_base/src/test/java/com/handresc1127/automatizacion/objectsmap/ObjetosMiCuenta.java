package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosMiCuenta {
	
	public ObjetosMiCuenta () {
		
		ActionsUtil.objetosPut("ingresar", By.xpath("//*[@id='main-content']/div[2]/div[2]/div/div/div/section/div[3]/a[2]"));
		ActionsUtil.objetosPut("correomicuenta", By.id("idEmail"));
		ActionsUtil.objetosPut("validar", By.id("continueBtn"));
		ActionsUtil.objetosPut("contrasena", By.id("password"));
		ActionsUtil.objetosPut("continuarmicuenta", By.xpath("/html/body/div[2]/div/form/div[3]/button"));
//		ActionsUtil.objetosPut("seleccionmsisdn", By.xpath("//*[@id='block-accountsblock-2']/div/div/div/div/div/span"));
		ActionsUtil.objetosPut("seleccionmsisdn", By.xpath("//*[@id='block-accountsblock-2']/div/div/div/div/div/span|//*[@id='account-mobile-selector']/div[1]/span[2]"));
		ActionsUtil.objetosPut("lineapruebasjuanca", By.xpath("(((//*[@id='lines'])//a[contains(@href,'')]))[11]|//*[@id='lines']/li[3]/a/div[1]"));
		ActionsUtil.objetosPut("lineahibridomariana", By.xpath("(((((//*[@id='lines'])//a[contains(@href,'')])))//*[contains(text(),'Mariana')])[2]|//*[@id='lines']/li[2]/a/div/div[2]"));
		ActionsUtil.objetosPut("lineahibridoana", By.xpath("(((//*[@id='lines'])//a[contains(@href,'')]))[9]|//*[@id='lines']/li[1]/div/div[1]"));
		ActionsUtil.objetosPut("armatuplanpruebas", By.xpath("//*[@id=\'lines\']/li[6]/span"));
		ActionsUtil.objetosPut("usuario", By.xpath("//*[@id='top_menu_aside']/nav/ul/li/a"));
		ActionsUtil.objetosPut("cerrarsesion", By.xpath("//*[@id='top_menu_aside']/nav/ul/li/ul/li[2]/a"));
		ActionsUtil.objetosPut("cambiarcuenta", By.xpath("//*[@id='addNew']"));
		ActionsUtil.objetosPut("resumen", By.xpath("((//ul)[8])//*[contains(text(),'Resumen')]"));
		ActionsUtil.objetosPut("cambiateya", By.id("action_Cámbiate ya"));
		ActionsUtil.objetosPut("mejorarplan", By.xpath("//*[@id='compras-noplan-container']/h3"));
		ActionsUtil.objetosPut("planes", By.xpath("//*[@id='main-content']/div[2]"));
		ActionsUtil.objetosPut("detalleplan", By.xpath("//*[@id='compras-noplan-container']/p"));
		ActionsUtil.objetosPut("ingresaramicuenta", By.xpath("//*[@id='top_menu_aside']/nav/ul/li/a|//*[@id='account-mobile-selector']"));
		ActionsUtil.objetosPut("registrarme", By.xpath("//*[@id='main-content']/div[2]/div[2]/div/div/div/section/div[3]/a[1]"));
		ActionsUtil.objetosPut("creatucuenta", By.xpath("/html/body/div[2]/div/div[1]/h5"));
		ActionsUtil.objetosPut("tipodocumentomitigo", By.xpath("//*[@id='t_document']/div/div/input"));
		ActionsUtil.objetosPut("descubreloya", By.xpath("//*[@id='main-content']/div[2]/div[1]/div/div/div/section/div/div/a"));
		ActionsUtil.objetosPut("tipoul", By.xpath("//*[@id='t_document']/div/div/ul"));
		ActionsUtil.objetosPut("tipoulcc", By.xpath("//*[@id='t_document']/div/div/ul/li[1]"));
		ActionsUtil.objetosPut("tipoulce", By.xpath("//*[@id='t_document']/div/div/ul/li[2]"));
		ActionsUtil.objetosPut("tipoulnit", By.xpath("//*[@id='t_document']/div/div/ul/li[3]"));
		ActionsUtil.objetosPut("tipoulps", By.xpath("//*[@id='t_document']/div/div/ul/li[4]"));
		ActionsUtil.objetosPut("ingresatudocumento", By.xpath("//*[@id='document']"));
		ActionsUtil.objetosPut("consultar", By.xpath("//*[@id='findagenda']/div[2]/div[2]/button"));
		ActionsUtil.objetosPut("mensajeerrordocumento", By.xpath("//*[@id='query-container']/section/div[1]/span[2]"));
		ActionsUtil.objetosPut("visitaspendientes", By.xpath("//*[@id='schedule-visits-container']/div[2]/div[1]/div/p"));
		ActionsUtil.objetosPut("consultapqr", By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div/div/div/div/div[1]/p/a"));
		ActionsUtil.objetosPut("consultapqrtigo", By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div/div/div/div/div[2]/p/a"));
		ActionsUtil.objetosPut("consultapqrune", By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div/div/div/div/div[1]/p/a"));
		ActionsUtil.objetosPut("iniciarsesion", By.xpath("//*[@id='top_menu_aside']/nav/ul/li/ul/li/a|//*[@id='account-mobile-menu']/nav/ul/li/a"));
		ActionsUtil.objetosPut("cambiarmiclave", By.xpath("//*[@id='main-content']/div[2]/div[7]/div/div/div/div/div[2]/a"));
		ActionsUtil.objetosPut("consultaspqrune", By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div/div/div/div/div[1]/p/a"));
		ActionsUtil.objetosPut("pqrune", By.id("iframePQR"));
		ActionsUtil.objetosPut("pqrtigo", By.xpath("//*[@id='formInicioPqr:panelBotonesInicio']/thead/tr/th/span"));
		ActionsUtil.objetosPut("consultasic", By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div/div/div/div/div[3]/p/a"));
		ActionsUtil.objetosPut("sic", By.xpath("//*[@id='contenido_medio']/div[1]/h1"));
		ActionsUtil.objetosPut("nuestrastiendas", By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div/div/div/div/div[4]/p/a"));
	    ActionsUtil.objetosPut("tiendas", By.xpath("/html/body/content/div[2]/div/section[1]/div/div/h3"));
	    ActionsUtil.objetosPut("pagatusfacturas", By.xpath("//*[@id='main-content']/div[2]/div[3]/div/div/div/div/a/span"));
	    ActionsUtil.objetosPut("recargasypaquetes", By.xpath("//*[@id='main-content']/div[2]/div[4]/div/div/div/div/a"));
	    ActionsUtil.objetosPut("reponetusim", By.xpath("//*[@id='main-content']/div[2]/div[6]/div/div/div/div/a/span"));
	    ActionsUtil.objetosPut("registratuequipo", By.xpath("//*[@id='main-content']/div[2]/div[5]/div/div/div/div/a"));
	    ActionsUtil.objetosPut("repone", By.xpath("//*[@id='group-header-0']/div[1]/div/div/h2/span"));
	    ActionsUtil.objetosPut("comprar", By.xpath("//*[@id='block-bannerdepromocionesrecargasypaquetes']/div/div[2]/div[1]/div[1]/div/li/div/a"));
	    ActionsUtil.objetosPut("realizarregistrodeequipo", By.xpath("/html/body/content/div[2]/div/div/section/div/div/div/div/div/div/a"));
	    ActionsUtil.objetosPut("ultimafacturapdf", By.id("action_Última factura PDF"));
	    ActionsUtil.objetosPut("lineacasaana", By.xpath("(((//*[@id='lines'])//a[contains(@href,'')]))[14]|//*[@id=\"lines\"]/li[7]/a/div/div[2]"));
	    ActionsUtil.objetosPut("servicios", By.xpath("/html/body/div[3]/div[2]/div/div/nav/div/div/ul/li[2]"));
	    ActionsUtil.objetosPut("productoscontratados", By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/section/div/div/div"));
	    ActionsUtil.objetosPut("agregartarjeta", By.id("action_Agregar tarjeta"));
	    ActionsUtil.objetosPut("agregartarjetadecredito", By.xpath("//*[@id='main-content']/div[2]/div/div/section[2]/div/h2"));
	    ActionsUtil.objetosPut("facturacion", By.xpath("/html/body/div[3]/div[2]/div/div/nav/div/div/ul/li[2]/a"));
	    ActionsUtil.objetosPut("modificar", By.xpath("//*[@id='action_Modificar']"));
	    ActionsUtil.objetosPut("electronica", By.xpath("//*[@id=\'edit-container\']/div[1]/label"));
	    ActionsUtil.objetosPut("correo", By.id("//*[@id='edit-email']"));
	    ActionsUtil.objetosPut("ok", By.id("edit-submit"));
	    ActionsUtil.objetosPut("tusdatosdefacturacion", By.xpath("/html/body/div[3]/div[1]/div/div/div/div[2]"));
	    ActionsUtil.objetosPut("impresa", By.xpath("//*[@id='edit-container']/div[3]/label"));
	    ActionsUtil.objetosPut("activatufacturaelectronica", By.xpath("//*[@id='action_Activa tu factura electrónica']"));
	}
	
}