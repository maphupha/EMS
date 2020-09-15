package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ems.entity.Branch;
import com.ems.jdbc.JdbcClass;

@Component
public class AddBranchDao 
{
	@Transactional
	public void addBranch(Branch branch,HttpServletRequest req,HttpServletResponse res) throws Exception 
	{
		
		
		String query="insert into public.\"Branch\" values(DEFAULT,?,?,?,?)";
		JdbcClass jdbc=new JdbcClass();
		Connection con=jdbc.getConnection();
		Branch c=new Branch();
		
		c.setBranchName(req.getParameter("branchName"));
		c.setPostalAddress(req.getParameter("postalAddress"));
		c.setPostalCode(req.getParameter("PostalCode"));
		c.setLocation(req.getParameter("BranchLocation"));
		PreparedStatement p = con.prepareStatement(query);
		
		p.setString(1,c.getBranchName() );
		p.setString(2, c.getPostalAddress());
		p.setString(3, c.getPostalCode());
		p.setString(4, c.getLocation());
	
		p.execute();
		p.executeUpdate();
		p.close();
		con.close();
		
		
	}
}
