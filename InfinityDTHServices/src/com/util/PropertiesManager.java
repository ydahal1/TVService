package com.util;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PropertiesManager {
	
	private static final Logger logger = LogManager.getLogger(PropertiesManager.class);
	private static PropertiesManager manager = null;
	
	public static PropertiesManager getPropertiesManager() {
		if(manager == null) {
			manager = new PropertiesManager();
		}
		
		return manager;
	}

	public String loadProperty(Property property) {
		Properties prop = new Properties();
		
		try {
			prop.load(this.getClass().getClassLoader().getResourceAsStream("db.properties"));
			return prop.getProperty(property.toString());
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
		
		return null;
	}
}
