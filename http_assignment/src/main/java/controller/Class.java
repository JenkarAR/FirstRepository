package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employee_Dao;
import dto.Employee;
@WebServlet("/def")
public class Class extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub]
	
	String s = req.getParameter("empid");
	int empid =Integer.parseInt(s);
	
	String empname = req.getParameter("empname");
	
	String dob = req.getParameter("dob");
	
	String gender = req.getParameter("gender");
	
	String country = req.getParameter("country");
	
	Employee employee = new Employee();
	employee.setEmpid(empid);
	employee.setEmpname(empname);
	employee.setDob(dob);
	employee.setGender(gender);
	employee.setCountry(country);
	
	Employee_Dao employee_Dao = new Employee_Dao();
	/*employee_Dao.insert(employee);
	super.doPost(req, resp);*/
	employee_Dao.Update(empid, empname);
}
}
