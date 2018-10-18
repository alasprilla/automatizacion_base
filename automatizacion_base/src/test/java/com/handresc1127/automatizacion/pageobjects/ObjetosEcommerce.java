package com.handresc1127.automatizacion.pageobjects;
import java.util.Dictionary;
import java.util.Hashtable;

import org.openqa.selenium.By;

public class ObjetosEcommerce {

	Dictionary<String, By> objetosEcommerce = new Hashtable<String, By>();
	
	public ObjetosEcommerce () {
		objetosEcommerce.put("correoelectronicom",By.id("edit-email"));
		objetosEcommerce.put("deslizaparaenviar", By.xpath("//*[@id='tigo-activation-activate-sim]/article/section[2]/div/div[2]/div/div[1]"));
		objetosEcommerce.put("titlepagetitle",By.xpath("//*[@id='block-tigo-theme-page-title']/div/h1"));
		
	}
	
	 public  By getObjetoEcommerce(String NombreObjeto) {
		 return objetosEcommerce.get(NombreObjeto);
	 }
	 
	 public  Dictionary<String, By> getDictionary(){
		 return objetosEcommerce;
	 }
}
