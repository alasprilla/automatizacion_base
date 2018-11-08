package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosMiCuenta {

	public ObjetosMiCuenta () {
	ActionsUtil.objetosPut("pagatusfacturas", By.xpath("//*[@id=\'main-content\']/div[2]/div[3]/div/div/div/div/a/span"));
	}
}
