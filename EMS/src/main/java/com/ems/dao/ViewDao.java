package com.ems.dao;

    
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ems.entity.Branch;
import com.ems.entity.BranchEmployee;
import com.ems.entity.Employee;


public class ViewDao 
{
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	} 
	
	public List<Branch> getBranches(){
		
	    return template.query("SELECT * FROM public.\"Branch\" ",new RowMapper<Branch>(){  
	    	
	        public Branch mapRow(ResultSet rs, int row) throws SQLException {    
	        	Branch e=new Branch(); 
	        	e.setBranchID((rs.getInt(1)));   
	            e.setBranchName(rs.getString(2)); 
	            e.setPostalAddress(rs.getString(3));
	            e.setLocation(rs.getString(5));    
	            e.setPostalCode(rs.getString(4));
	         
	            return e;    
	        }    
	    });    
	}
	
public List<Employee> getEmployees(){
		
	    return template.query("SELECT * FROM public.\"Employee\" ",new RowMapper<Employee>(){  
	    	
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
	        	Employee e=new Employee(); 
	        	char temp=rs.getString(1).charAt(0);
	        	String temp1=temp+""+rs.getString(2).charAt(0)+rs.getInt(8);
	        	e.setNewEmpID(temp1);   
	            e.setName(rs.getString(1)+rs.getString(2)); 
	            e.setSurname(rs.getString(3));
	            e.setTelephoneNo(rs.getString(3));
	            e.setMaritalStatus(rs.getString(5));    
	            e.setLocation(rs.getString(4));
	            e.setBranchid(rs.getInt(6));
	            e.setBirthday(rs.getString(7));
	            return e;    
	        }    
	    });    
	}
public int deleteEmployee(int id){    
    String sql="delete from public.\"Employee\" where EMPID="+id+"";    
    return template.update(sql);    
}
public int update(Employee p){    
    String sql="update public.\"Employee\" set name='"+p.getName()+"', name="+p.getName()+",surname='"+p.getSurname()+"',birthday='"+p.getBirthday()+"',TelephoneNo='"+p.getTelephoneNo()+"',maritalStatus='"+p.getMaritalStatus()+"',location='"+p.getLocation()+"' where id="+p.getEmpid()+"";    
    return template.update(sql);    
}   
public Employee getEmpById(int id){    
    String sql="select * from public.\"Employee\" where empid=?";    
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));    
}

public List<BranchEmployee> getEmployeesBranch(){
	
    return template.query("SELECT * FROM public.\"dashboard\" ",new RowMapper<BranchEmployee>(){  
    	
        public BranchEmployee mapRow(ResultSet rs, int row) throws SQLException {    
        	BranchEmployee e=new BranchEmployee(); 
        	   
            e.setFullName(rs.getString(1)+rs.getString(2)); 
            e.setTelephoneno(rs.getString(3));
            e.setBranchName(rs.getString(5));
            e.setBranchLocation(rs.getString(4));
            e.setLocation(rs.getString(4));    
         
            return e;    
        }    
    });    
}

}
