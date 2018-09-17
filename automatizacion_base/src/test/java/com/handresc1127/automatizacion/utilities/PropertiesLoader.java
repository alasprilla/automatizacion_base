package com.handresc1127.automatizacion.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesLoader {

	public static boolean test;

	private PropertiesLoader() {
		load();
	}

	public static PropertiesLoader getInstance() {
		if (instance == null)
			synchronized (PropertiesLoader.class) {
				if (instance == null)
					instance = new PropertiesLoader();
			}
		return instance;
	}

	private Properties load() {

		try {
			properties.load(new FileInputStream("serenity.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}

	public String getProperty(String prop) {
		return properties.getProperty(prop);
	}

	public String getProperty(String prop, String defaultValue) {

		String value = properties.getProperty(prop);
		if (value == null) {
			value = defaultValue;
		}

		return value;
	}

	private static PropertiesLoader instance;
	private static Properties properties = new Properties();
}
