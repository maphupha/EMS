package com.ems.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ems.entity.Employee;
import com.ems.jdbc.JdbcClass;

@Component
public class addEmployeeDao
{ 
@Transactional
public void addEmployee(Employee employee,HttpServletRequest req,HttpServletResponse res) throws Exception 
{
	 Random random = new Random();
	 int random_int= random.nextInt(9999 - 1000) + 1000;
	String query="insert into public.\"Employee\" values(?,?,?,?,?,?,?,?)";
	JdbcClass jdbc=new JdbcClass();
	Connection con=jdbc.getConnection();
	Employee c=new Employee();
	
	
	 System.out.println(random_int);
	 
	
	c.setName(req.getParameter("name"));
	c.setSurname(req.getParameter("surname"));
	c.setBirthday(req.getParameter("birthday"));
	c.setTelephoneNo(req.getParameter("TelephoneNo"));
	c.setMaritalStatus(req.getParameter("maritalStatus"));
	c.setLocation(req.getParameter("location"));
	c.setBranchid(Integer.parseInt(req.getParameter("branchid")));
	
	PreparedStatement p = con.prepareStatement(query);
	
	p.setString(1,c.getName());
	p.setString(2, c.getSurname());
	p.setString(3, c.getTelephoneNo());
	p.setString(4, c.getLocation());
	p.setString(5, c.getMaritalStatus());
	p.setInt(6,c.getBranchid());
	p.setString(7,c.getBirthday());
	p.setInt(8, random_int);
	
	p.execute();
	p.executeUpdate();
	p.close();
	con.close();
	
}

}
