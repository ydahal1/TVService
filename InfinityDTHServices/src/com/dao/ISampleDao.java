package com.dao;

import java.sql.SQLException;

import com.bean.SampleBean;

public interface ISampleDao {
	public boolean addSample(SampleBean sample) throws SQLException, ClassNotFoundException;
}
