package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bean.SampleBean;
import com.service.SampleService;

/**
 * Servlet implementation class SampleController
 */
public class SampleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LogManager.getLogger(SampleController.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SampleService service = new SampleService();
		
		// create sample
		// bean will hold the data
		String name = request.getParameter("name");
		
		SampleBean sample = new SampleBean();
		sample.setName(name);
		
		try {
			// service will add the sample to db
			service.addSample(sample);
		} catch (ClassNotFoundException | SQLException e) {
			// make sure to log error
			logger.error(e.getMessage());
		}
	}

}
