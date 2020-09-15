<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/master.jsp" %>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
<style>
#navb{
color:gray;
height:20px;
background-color:black;
margin-top:14px;
margin-bottom:14px;
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
 background:gray;
}
input[type=text],[type=password],[type=number] ,[type=date]{
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
</style>
</head>
<body>
<div class="create">
<form action="addEmployee">
<label for="name"><a>Name</a></label>
<input type="text" id="name" name="name" value=""><br><br>
  <label for="surname"><a>Surname</a></label>
  <input type="text" id="surname" name="surname" value=""><br><br>
  <label for="birthday"><a>Birthday</a></label>
  <input type="text" id="birthday" name="birthday" value=""><br><br>
  <label for="TelephoneNo"><a>Telephone No</a></label>
  <input type="text" id="TelephoneNo" name="TelephoneNo" value=""><br><br>
  <label for="maritalStatus"><a>Marital Status</a></label>
  <input type="text" id="maritalStatus" name="maritalStatus" value=""><br><br>
  <label for="location"><a>Location</a></label>
  <input type="text" id="location" name="location" value=""><br><br>
  <label for="branchid"><a>Branch ID</a></label>
  <input type="text" id="branchid" name="branchid" value=""><br><br>
  <input type="submit" value="Submit" id="add"><br>
</form>
</div>
</body>
</html>