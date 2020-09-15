<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/master.jsp" %>
<meta charset="ISO-8859-1">
<title>Add Branch</title>
<style>
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
</head>
<body>
<div class="create">
<form action="addBranch">
	<label for="email"><a>Branch Name</a></label>
<input type="text" id="branchName" name="branchName" value=""><br><br>
  <label for="postalAddress"><a>Postal Address</a></label>
  <input type="text" id="postalAddress" name="postalAddress" value=""><br><br>
  <label for="PostalCode"><a>Postal Code</a></label>
  <input type="text" id="PostalCode" name="PostalCode" value=""><br><br>
  <label for="branchLocation"><a>Branch Location</a></label>
  <input type="text" id="BranchLocation" name="BranchLocation" value=""><br><br>
  <input type="submit" value="Submit" id="add"><br>
</form>

</div>
</body>
</html>