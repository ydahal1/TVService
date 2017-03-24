package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bean.Address;
import com.bean.SampleBean;
import com.util.DBConnection;

public class SampleDao implements ISampleDao {
	
	private static final Logger logger = LogManager.getLogger(SampleDao.class);

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private Statement stmt = null;
	
	@Override
	public boolean addSample(SampleBean sample) throws SQLException, ClassNotFoundException {
		
		String query = null;
		
		con = DBConnection.getConnection();
		
		/*
		 * 		AddressId INTEGER PRIMARY KEY,
			  Address1 VARCHAR(30) NOT NULL,
			  Address2 VARCHAR(30),
			  LandMark VARCHAR(30) NOT NULL,
			  Pincode VARCHAR(30) NOT NULL,
			  City VARCHAR(10) NOT NULL,
			  State VARCHAR(10) NOT NULL
		 */
		
		Address address = new Address();
		
		ps = con.prepareStatement("insert into Address values(Address_Sequence.nextval,?,?,?,?,?,?)");
		ps.setString(1, address.getAddress1());
		ps.setString(2, address.getAddress2());
		ps.setString(2, address.getLandmark());
		ps.setString(2, address.getPincode());
		ps.setString(2, address.getCity());
		ps.setString(2, address.getState());
		
		ps.executeUpdate();
		
		query = "Select Name from Address";
		stmt = con.createStatement();
		rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			logger.info("Address1: " + rs.getString(1));
			logger.info("Address2: " + rs.getString(2));
			logger.info("Landmark: " + rs.getString(3));
			logger.info("Pincode: " + rs.getString(4));
			logger.info("City: " + rs.getString(5));
			logger.info("State: " + rs.getString(6));
		}
		
		return false;
	}

}
