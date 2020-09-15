
<!DOCTYPE html>
<html>
<head>
<style>
	#map{position:absolute;
	 top:53%; 
	 bottom:0%; 
	 left:1%;
	  right:1%; 
	  margin-top:2%;
	  border-radius: 2px black;
	  }
	#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
  height: 45%;
 
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
div.create
{
  margin-left:180px;
  padding: 0px;
  display:inline;
   float:left;
   
}


body
{
 background-color: gray;
 
 
}
input[type=text],[type=password],[type=number] {
 margin: 2px;
   margin-left:200px;
  padding: 10px;
   display: inline-block;
   float: right;
}
label
{
padding: 10px;
 margin: 4px;
  margin-left: 100px;
    display: inline-block;
  float: left;

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
a
{
	format: bold;
	color:black;

}
#navb{
color:gray;
height:20px;
background-color:black;
margin-top:14px;
margin-bottom:14px;
}
</style>
<%@ include file="/master.jsp" %>
<meta charset="ISO-8859-1">
<title>Dash board</title>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   <%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
<script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"></script>
</head>

<h1>Dash Board</h1>

 <body>
 <div id="customers" >
<form action="ab">
<table class="table">  
 <thead class="thead-dark"><tr><th>full name</th><th>Birthday</th><th>Telephone number</th><th>Home Location</th><th>Branch Name</th><th>Branch Location</th><th>Edit</th><th>Delete</th></tr> </thead>  
   <c:forEach  items="${list}" var="employeebranch">   
   <tr>  
   <tr  class="trow"onClick=testFunction()>
   <td> ${employeebranch.fullName} </td>  
   <td>${employeebranch.birthday}</td>  
   <td>${employeebranch.telephoneno}</td> 
   <td>${employeebranch.location}</td>
   <td>${employeebranch.branchName}</td> 
   <td>${employeebranch.branchLocation}</td>
   <td><a href="editemp/${employee.empid}">Edit</a></td>  
   <td><a href="deleteemp/${employee.empid}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table> 
   <input type=submit value="Dashboard" id="add">
   </form> 
   <br/>  
   
  </div>
   <br><br>
   <div id="map">
   <script>
   	var map=L.map('map').setView([0,0],2);
   	L.tileLayer('https://api.maptiler.com/maps/streets/{z}/{x}/{y}.png?key=qJ2LnpyyJG4pK7Di6gdV',{
   		attribution: '<a href="https://www.maptiler.com/copyright/" target="_blank">&copy; MapTiler</a> <a href="https://www.openstreetmap.org/copyright" target="_blank">&copy; OpenStreetMap contributors</a>',
   	}).addTo(map);
   	
   	var marker=L.marker([-26.2041, 28.0473]).addTo(map);
   	function testFunction()
   	{
   		layerGroup.clearLayers();
   		map.closePopup();
   		maker=L.marker([-33.9249, 18.4241]).addTo(layerGroup);
   		marker.bindPopup("Capetown").openPopup();
   	}
   </script>
   
   </div>
  </body>
</html>