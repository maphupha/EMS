
<head>
<style type="text/css">
#navbar navbar-inverse {
  margin: 0;
  width: 100%;
  padding: 20px;
  margin-bottom: 20px;
  position: relative;
  align-items: center;
  justify-content: center;
  top: 0px;
  float:left;
  
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
</style>
  <title>Employee Management System(EMS)</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
</head>

<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="index.jsp">EMS</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
       	    <li><a  href="index.jsp"> <span class="glyphicon glyphicon-home"></span> Home</a></li>
       	     <li><a  href="addBranch.jsp"> <span class="glyphicon glyphicon-home"></span>Add Branch </a></li>
       	      <li><a  href="addEmployee.jsp"> <span class="glyphicon glyphicon-home"></span> Add Employee</a></li>
       	        <li>
       	        <form action="viewBranch">
       	        <input type=submit value="View Branch" id="navb" >
       	        </form>
       	        </li>
       	           <li>
       	        <form action="viewEmployee">
       	        <input type=submit value="View Employee" id="navb">
       	        </form>
       	        </li>
      </ul>
    </div>
  </div>
</nav>
  

</body>

</html>
