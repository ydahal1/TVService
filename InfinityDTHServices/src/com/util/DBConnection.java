package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBConnection {
	
	private static final Logger logger = LogManager.getLogger(DBConnection.class);
	
	public static Connection getConnection() {
		Connection con = null;
		PropertiesManager manager = PropertiesManager.getPropertiesManager();
		
		try {
			Class.forName(manager.loadProperty(Property.DRIVER));
			con = DriverManager.getConnection(
					manager.loadProperty(Property.URL),
					manager.loadProperty(Property.USERNAME),
					manager.loadProperty(Property.PASSWORD));
		} catch (ClassNotFoundException e) {
			logger.error(e.getMessage());
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
		
		return con;
	}
	
	public static void CloseConnection(Connection cn) {
		if(cn != null) {
			try {
				cn.close();
			} catch (SQLException e) {
				logger.error(e.getMessage());
			}
		}
	}
}