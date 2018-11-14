package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosMiCuenta {
	
	public ObjetosMiCuenta () {
		
		ActionsUtil.objetosPut("registrarme", By.xpath("//*[@id='main-content']/div[2]/div[2]/div/div/div/section/div[3]/a[1]"));
		ActionsUtil.objetosPut("creatucuenta", By.xpath("/html/body/div[2]/div/div[1]/h5"));
		ActionsUtil.objetosPut("tipo", By.xpath("//*[@id=\"t_document\"]/div/div/input"));
		ActionsUtil.objetosPut("tipoul", By.xpath("//*[@id=\'t_document\']/div/div/ul"));
		ActionsUtil.objetosPut("tipoulcc", By.xpath("//*[@id=\'t_document\']/div/div/ul/li[1]"));
		ActionsUtil.objetosPut("tipoulce", By.xpath("//*[@id=\'t_document\']/div/div/ul/li[2]"));
		ActionsUtil.objetosPut("tipoulnit", By.xpath("//*[@id=\'t_document\']/div/div/ul/li[3]"));
		ActionsUtil.objetosPut("tipoulps", By.xpath("//*[@id=\'t_document\']/div/div/ul/li[4]"));
		ActionsUtil.objetosPut("ingresatudocumento", By.xpath("//*[@id='document']"));
		ActionsUtil.objetosPut("consultar", By.xpath("//*[@id=\'findagenda\']/div[2]/div[2]/button"));
		ActionsUtil.objetosPut("labelerrordocumento", By.xpath("//*[@id=\'query-container\']/section/div[1]/span[2]"));
		ActionsUtil.objetosPut("visitaspendientes", By.xpath("//*[@id=\'schedule-visits-container\']/div[2]/div[1]/div/p"));
		ActionsUtil.objetosPut("consultasPQRUNE", By.xpath("//*[@id=\'main-content\']/div[2]/div[9]/div/div/div/div/div/div/div/div[1]/p/a"));
		ActionsUtil.objetosPut("PQRUNE", By.xpath("/html/body/div[4]/div/div/div/div[1]/h3"));
		ActionsUtil.objetosPut("consultaPQRTIGO", By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div/div/div/div/div[2]/p/a"));
		ActionsUtil.objetosPut("PQRTIGO", By.xpath("//*[@id='formInicioPqr:panelBotonesInicio']/thead/tr/th/span"));
		ActionsUtil.objetosPut("consultaSIC", By.xpath("//*[@id=\'main-content\']/div[2]/div[9]/div/div/div/div/div/div/div/div[3]/p/a"));
		ActionsUtil.objetosPut("SIC", By.xpath("//*[@id=\'contenido_medio\']/div[1]/h1"));
		ActionsUtil.objetosPut("nuestrastiendas", By.xpath("//*[@id='main-content']/div[2]/div[9]/div/div/div/div/div/div/div/div[4]/p/a"));
	    ActionsUtil.objetosPut("tiendas", By.xpath("/html/body/content/div[2]/div/section[1]/div/div/h3"));
	}
	
}