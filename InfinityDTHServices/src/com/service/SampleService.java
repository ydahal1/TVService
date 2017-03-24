package com.service;

import java.sql.SQLException;

import com.bean.SampleBean;
import com.dao.ISampleDao;
import com.dao.SampleDao;

public class SampleService {
	ISampleDao dao = new SampleDao();
	
	public boolean addSample(SampleBean sample) throws SQLException, ClassNotFoundException {
		return dao.addSample(sample);
	}
}
