package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bean.Address;
import com.bean.Customer;
import com.service.CustomerService;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CreateCustomerServlet")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LogManager.getLogger(CustomerController.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerService service = new CustomerService();
		
		Customer customer=new Customer();
		Address address=new Address();

		String firstNameStr=request.getParameter("firstName");
		String lastNameStr=request.getParameter("lastName");
		String emailIdStr=request.getParameter("emailId");
		String phoneNumberStr=request.getParameter("phoneNumber");
		String address1Str=	request.getParameter("address1");
		String address2Str=	request.getParameter("address2");

		customer.setUserId(1);
		customer.setFirstName(firstNameStr);
		customer.setLastName(lastNameStr);
		customer.setEmailAddress(emailIdStr);
		customer.setPhoneNumber(phoneNumberStr);
		address.setAddress1(address1Str);
		address.setAddress2(address2Str);
		customer.setAddress(address);
		
		System.out.println("firstname ="+firstNameStr);
		System.out.println("lastName= "+lastNameStr);
		System.out.println("email= "+emailIdStr);
		System.out.println("phone= "+phoneNumberStr);
		System.out.println("address= "+customer.getAddress().getAddressId());
		
		try {
			service.addCustomer(customer);
		} catch (ClassNotFoundException | SQLException e) {
			logger.error(e.getMessage());
		}
	}

}
