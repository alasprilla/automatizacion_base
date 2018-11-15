package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosMiCuenta {
	
	public ObjetosMiCuenta () {
		
		ActionsUtil.objetosPut("ingresar", By.xpath("//*[@id=\'main-content\']/div[2]/div[2]/div/div/div/section/div[3]/a[2]"));
		ActionsUtil.objetosPut("registrarme", By.xpath("//*[@id='main-content']/div[2]/div[2]/div/div/div/section/div[3]/a[1]"));
		ActionsUtil.objetosPut("creatucuenta", By.xpath("/html/body/div[2]/div/div[1]/h5"));
		ActionsUtil.objetosPut("tipodocumentomitigo", By.xpath("//*[@id=\"t_document\"]/div/div/input"));
		ActionsUtil.objetosPut("descubreloya", By.xpath("//*[@id=\'main-content\']/div[2]/div[1]/div/div/div/section/div/div/a"));
		ActionsUtil.objetosPut("tipoul", By.xpath("//*[@id=\'t_document\']/div/div/ul"));
		ActionsUtil.objetosPut("tipoulcc", By.xpath("//*[@id=\'t_document\']/div/div/ul/li[1]"));
		ActionsUtil.objetosPut("tipoulce", By.xpath("//*[@id=\'t_document\']/div/div/ul/li[2]"));
		ActionsUtil.objetosPut("tipoulnit", By.xpath("//*[@id=\'t_document\']/div/div/ul/li[3]"));
		ActionsUtil.objetosPut("tipoulps", By.xpath("//*[@id=\'t_document\']/div/div/ul/li[4]"));
		ActionsUtil.objetosPut("ingresatudocumento", By.xpath("//*[@id='document']"));
		ActionsUtil.objetosPut("consultar", By.xpath("//*[@id=\'findagenda\']/div[2]/div[2]/button"));
		ActionsUtil.objetosPut("mensajeerrordocumento", By.xpath("//*[@id=\'query-container\']/section/div[1]/span[2]"));
		ActionsUtil.objetosPut("visitaspendientes", By.xpath("//*[@id=\'schedule-visits-container\']/div[2]/div[1]/div/p"));
		ActionsUtil.objetosPut("consultaspqr", By.xpath("//*[@id=\'main-content\']/div[2]/div[9]/div/div/div/div/div/div/div/div[1]/p/a"));
		ActionsUtil.objetosPut("ingresaramicuenta", By.xpath("//*[@id=\'top_menu_aside\']/nav/ul/li/a"));
		ActionsUtil.objetosPut("iniciarsesion", By.xpath("//*[@id=\'top_menu_aside\']/nav/ul/li/ul/li/a"));
		ActionsUtil.objetosPut("cambiarmiclave", By.xpath("//*[@id=\'main-content\']/div[2]/div[7]/div/div/div/div/div[2]/a"));
		ActionsUtil.objetosPut("consultaspqrune", By.xpath("//*[@id=\'main-content\']/div[2]/div[9]/div/div/div/div/div/div/div/div[1]/p/a"));
		ActionsUtil.objetosPut("pqrune", By.xpath("/html/body/div[4]/div/div/div/div[1]/h3"));
		ActionsUtil.objetosPut("consultapqrtigo", By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div/div/div/div/div[2]/p/a"));
		ActionsUtil.objetosPut("pqrtigo", By.xpath("//*[@id='formInicioPqr:panelBotonesInicio']/thead/tr/th/span"));
		ActionsUtil.objetosPut("consultasic", By.xpath("//*[@id=\'main-content\']/div[2]/div[9]/div/div/div/div/div/div/div/div[3]/p/a"));
		ActionsUtil.objetosPut("sic", By.xpath("//*[@id=\'contenido_medio\']/div[1]/h1"));
		ActionsUtil.objetosPut("nuestrastiendas", By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div/div/div/div/div[4]/p/a"));
	    ActionsUtil.objetosPut("tiendas", By.xpath("/html/body/content/div[2]/div/section[1]/div/div/h3"));
	    ActionsUtil.objetosPut("pagatusfacturas", By.xpath("//*[@id=\'main-content\']/div[2]/div[3]/div/div/div/div/a/span"));
	    ActionsUtil.objetosPut("recargasypaquetes", By.xpath("//*[@id='main-content']/div[2]/div[4]/div/div/div/div/a"));
	    ActionsUtil.objetosPut("reponetusim", By.xpath("//*[@id=\"main-content\"]/div[2]/div[6]/div/div/div/div/a/span"));
	    ActionsUtil.objetosPut("registratuequipo", By.xpath("//*[@id=\'main-content\']/div[2]/div[5]/div/div/div/div/a"));
	    ActionsUtil.objetosPut("repone", By.xpath("//*[@id=\'group-header-0\']/div[1]/div/div/h2/span"));
	    ActionsUtil.objetosPut("comprar", By.xpath("//*[@id=\'block-bannerdepromocionesrecargasypaquetes\']/div/div[2]/div[1]/div[1]/div/li/div/a"));
	}
	
}