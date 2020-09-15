
<!DOCTYPE html>
<html>
<head>
<%@ include file="/master.jsp" %>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   <%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<style>
	#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: gray;
  color: white;
}
#add {
 margin: 19px;
   margin-left:350px;
  padding: 15px;
   display: inline-block;
   float: left;
   background-color: red;
}
#add:hover {
padding: 19px;
background-color: white;
color:black;
padding: 15px;
}
#navb{
color:gray;
height:20px;
background-color:black;
margin-top:14px;
margin-bottom:14px;
}
</style>
</head>

<h1>Eployee List</h1>  
<table id="customers">  
<tr><th>full name</th><th>Birthday</th><th>Telephone number</th><th>Marital Status</th><th>Home Location</th><th>Employee ID</th><th>Branch ID</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach  items="${list}" var="employee">   
   <tr>  
   <td> ${employee.name} </td>  
   <td> ${employee.birthday} </td> 
   <td>${employee.telephoneNo}</td>  
   <td>${employee.maritalStatus}</td>  
   <td>${employee.location}</td>
    <td>${employee.newEmpID}</td>
   <td>${employee.branchid}</td>  
   
    
   <td><a href="editemp/${employee.empid}">Edit</a></td>  
   <td><a href="deleteemp/${employee.empid}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="addEmployee.jsp">Add New Employee</a>
   

</html>