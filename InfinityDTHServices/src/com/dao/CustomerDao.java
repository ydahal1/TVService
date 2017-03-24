package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Customer;
import com.util.DBConnection;

public class CustomerDao implements ICustomerDao {
//	DBConnection dbconn=new DBConnection();
	
	public ResultSet selectSQL(String sql) {
	
		ResultSet result=null;
		Connection conn=null;
		
		try {
			conn=DBConnection.getConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql);
			result=preStatement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	@Override
	public boolean addCustomer(Customer customer) {
//		INSERT INTO ASSIGNMENT (STUDENT_ID,ASSIGNMENT_NAME,ASSIGNMENT_TYPE,ASSIGNMENT_DATE,GRADE) 
//		VALUES (?,?,?,?,?)";
		Connection conn=DBConnection.getConnection();
		String sql="INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?)";
//		(USERID,FIRSTNAME,LASTNAME,EMAILID,PHONENUMBER,ADDRESSID)
		System.out.println(sql);
		try {
			PreparedStatement preStatement = conn.prepareStatement(sql);
			preStatement.setInt(1,customer.getUserId());
			preStatement.setString(2,customer.getFirstName());
			preStatement.setString(3,customer.getLastName());
			preStatement.setString(4,customer.getEmailAddress());
			preStatement.setString(5,customer.getPhoneNumber());
			preStatement.setInt(6,customer.getAddress().getAddressId());
			preStatement.executeUpdate();
			System.out.println("end");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		DBConnection.CloseConnection(conn);
		
		return true;
	}
}