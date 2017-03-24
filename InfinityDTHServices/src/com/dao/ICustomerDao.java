package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Customer;

public interface ICustomerDao {
	public boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException;
	public ResultSet selectSQL(String sql) throws SQLException;
}
