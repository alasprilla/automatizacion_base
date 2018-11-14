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
		ActionsUtil.objetosPut("consultasPQR", By.xpath("//*[@id=\'main-content\']/div[2]/div[9]/div/div/div/div/div/div/div/div[1]/p/a"));
	}
	
}