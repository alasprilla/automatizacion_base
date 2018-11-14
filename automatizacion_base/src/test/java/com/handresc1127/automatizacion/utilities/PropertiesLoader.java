package com.handresc1127.automatizacion.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.PageObject;

public class PropertiesLoader {

	private PropertiesLoader() {
		load();
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(PageObject.class);

	public static synchronized PropertiesLoader getInstance() {
		if (instance == null)
			instance = new PropertiesLoader();
		return instance;
	}

	private Properties load() {
		try {
			properties.load(new FileInputStream("serenity.properties"));
			properties.load(new FileInputStream("target/maven.properties"));
		} catch (Exception e) {
			LOGGER.error("Excepcion load propiedades:", e);
		}
		return properties;
	}

	public String getProperty(String prop) {
		return properties.getProperty(prop);
	}

	public void setProperty(String property, String value) {
		properties.setProperty(property, value);
	}

	private static PropertiesLoader instance;
	private static Properties properties = new Properties();
}
