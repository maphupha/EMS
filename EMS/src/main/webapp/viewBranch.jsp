 
<html>
<head>
<%@ include file="/master.jsp" %>
<meta charset="ISO-8859-1">
<title>View Branch</title>
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


<h1>Branch List</h1>  
<table id="customers" >  
<tr><th>Branch Name</th><th>Postal Address</th><th>Postal Code</th><th>Branch Location</th><th>Branch ID</th></tr>  
   <c:forEach var="branch" items="${list}">   
   <tr>  
   <td>"${branch.branchName}"</td>  
   <td>"${branch.postalAddress}"</td>  
   <td>${branch.postalCode}</td>  
   <td>${branch.location}</td>
   <td>${branch.branchID}</td>    
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="empform">Add New Employee</a>
   
</html>