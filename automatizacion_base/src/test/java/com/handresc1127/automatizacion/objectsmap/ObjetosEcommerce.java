package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosEcommerce {

	public ObjetosEcommerce() {
		// Ecommerce
		ActionsUtil.objetosPage.put("titlepage-title", By.id("block-tigo-theme-page-title"));
		ActionsUtil.objetosPage.put("droppable", By.xpath("//*[contains(@class,'droppable')]"));
		ActionsUtil.objetosPage.put("draggable", By.xpath("//*[contains(@class,'draggable')]"));
		ActionsUtil.objetosPage.put("balon", By.id("ball"));
	}
}
