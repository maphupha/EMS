package com.ems.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ems.dao.AddBranchDao;
import com.ems.dao.ViewDao;
import com.ems.dao.addEmployeeDao;
import com.ems.entity.Branch;
import com.ems.entity.BranchEmployee;
import com.ems.entity.Employee;




@Controller
public class AddController
{
	@Autowired
	AddBranchDao branchDao;
	@Autowired
	addEmployeeDao employeeDao;
	
	  @Autowired    
	    ViewDao viewDao;
	Branch branch;
	Employee employee;
	
	@RequestMapping("/ab")    
    public String viewEmployeeBranch(Model m,HttpServletRequest req,HttpServletResponse res){ 
		 
		List<BranchEmployee> list=viewDao.getEmployeesBranch();
       m.addAttribute("list",list); 
       
      
        return "index.jsp";    
    }
	
	@RequestMapping("/addBranch")
	  public String addBranches(@ModelAttribute Branch branch,HttpServletRequest req,HttpServletResponse res) throws Exception 
	  {
			branchDao.addBranch(branch,req,res);
		return "index.jsp";
	  }
	@RequestMapping("/addEmployee")
	  public String addEmployees(@ModelAttribute Employee employee,HttpServletRequest req,HttpServletResponse res) throws Exception 
	  {
			employeeDao.addEmployee(employee, req, res);
		return "index.jsp";
	  }
	   @RequestMapping("/viewBranch")    
	    public String viewBranches(Model m){ 
	        List<Branch> list=viewDao.getBranches(); 
	        m.addAttribute("list",list);  
	        return "viewBranch.jsp";    
	    } 
	   
	   @RequestMapping("/viewEmployee")    
	    public String viewEmployee(Model m,HttpServletRequest req,HttpServletResponse res){ 
	        List<Employee> list=viewDao.getEmployees();
	       m.addAttribute("list",list); 
	        return "viewEmployee.jsp";    
	    }
	   @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
	    public String deleteEmployee(@PathVariable int id){    
	        viewDao.deleteEmployee(id);    
	        return "redirect:/viewBranch.jsp";    
	    }    
	   @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("emp") Employee employee){    
	        viewDao.update(employee);    
	        return "redirect:/viewEmployee.jsp";    
	    }
	   @RequestMapping(value="/editemp/{id}")    
	    public String edit(@PathVariable int id, Model m){    
	        Employee employee=viewDao.getEmpById(id);    
	        m.addAttribute("command",employee);  
	        return "EditEmployee.jsp";    
	    }
}
