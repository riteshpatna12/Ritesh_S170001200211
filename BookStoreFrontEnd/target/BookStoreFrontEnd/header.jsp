<html lang="en">
<head>
  <title>Vizron Bookstore</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

 		
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
 		 .carousel-inner > .item > img,
 		 .carousel-inner > .item > a > img 
 		 {
		      width: 70%;
   		      margin: auto;
 		 }
 									
		 .dropdown-submenu {
             position: relative;
         }

         .dropdown-submenu .dropdown-menu {
             top: 0;
             left: 100%;
             margin-top: -1px;
         }
  </style>
  
  		

</head>

<body>

		 
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
  
    <div class="navbar-header" >
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="homepage.jsp">VIZRON BOOKSTORE</a>
    </div>
    
	<div class="collapse navbar-collapse" id="myNavbar">
    	
    	<ul class="nav navbar-nav">
     			 <li class="active"><a href="index.jsp"><span class="glyphicon glyphicon-home"></span> Home</a></li>
	  		
	  			 <li class="active"><a href="searchbook.jsp"><span class="glyphicon glyphicon-education"></span> Books</a></li>
    			  <li class="dropdown">
	 	  			 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Category<span class="caret"></span></a>
    		 <ul class="dropdown-menu">
    			  <li><a href="category.jsp">Programming Language Books</a></li>
    			  <li><a href="category.jsp">Relational Database management Books</a></li>
    	    	   <li><a href="category.jsp">Design Patterns Books</a></li>
    		     <li><a href="category.jsp">Computer Networking Books</a></li>
        		 <li><a href="category.jsp">Operating system Books</a></li>	   
  			  </ul>
   			   </li>
    
    		 <li class="active">
                 <a href="aboutus.jsp"> About Us</a></li>
                              
                         
            <li><a href="contactus.jsp">Contact Us</a></li>
               </ul>
		
                 <ul class="nav navbar-nav navbar-right">
        <li><a href="new_user_reg.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
    
  </div>
  </div>
</nav>  

</body>
</html>