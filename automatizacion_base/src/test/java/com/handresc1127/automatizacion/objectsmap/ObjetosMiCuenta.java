package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosMiCuenta {
	
	public ObjetosMiCuenta () {
		
		ActionsUtil.objetosPut("registrarme", By.xpath("//*[@id='main-content']/div[2]/div[2]/div/div/div/section/div[3]/a[1]"));
		ActionsUtil.objetosPut("creatucuenta", By.xpath("/html/body/div[2]/div/div[1]/h5"));
		ActionsUtil.objetosPut("ingresatudocumento", By.xpath("//*[@id='document']"));
		ActionsUtil.objetosPut("consultar", By.xpath("//*[@id=\'findagenda\']/div[2]/div[2]"));
		ActionsUtil.objetosPut("labelerrordocumento", By.xpath("//*[@id=\'query-container\']/section/div[1]/span[2]"));
	}
	
}