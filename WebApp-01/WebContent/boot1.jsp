<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<link type="text/css" rel="stylesheet" href="homepagestylesheet.css">
<%--Adding bootstrap details --%>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;}
    }
  </style>
</head>
<body id="homewebpg">
			<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="Aboutus"><a href="aboutus.jsp">About us </a></span>
        <span class="Home"><a href="index.jsp">Home</a></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="newuserlogin.jsp">LOGIN</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.jsp">Home</a></li>
        <li><a href="aboutus.jsp">About us </a></li>
        <li><a href="contactus.jsp">Contact us</a></li>
        <li><a href="upcomingb.jsp">UpComing Books</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="newuserlogin.jsp"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
      </ul>
    </div>
  </div>
</nav>
				
				<div id="homestyle">
					<img id="logo" align="left" src="images\logo.png" alt="company logo" width="175" height="175"/>	
				</div>
					
				<div id="callus" align="right"><img id="callus" src="images\call_us.jpg"/>
					<h3>For Enquiry<br>Call Us 7677322390</h3> 
				</div>
				
				<div id="topnav" width>				
				  <nav>
					<a href="homepage.html">HOME</a>
					<a href="aboutus.html">ABOUT_US</a>
					<a href="contactus.html">CONTACT_US</a>
					<a href="upcomingbooks.html">UPCOMING_BOOKS</a>
				  </nav></div>
				  <div style="width:400px;height=20px;float:right;">
				   <nav>
					<a href="newuserlogin.jsp">Login</a>
					<a href="new_user_reg.jsp">New Registration</a>
					</nav>
				</div>
				
				<div style="width:500px;height=20px;float:right;text-align:center">
					<h1><b>The Ultimate Way To Purchasing Books</b></h>
				</div>
				
				<div id="booksimg">

					<a href="" ><img src="images\Robbin_Hobb.jpg" width="185" height="200"/> </a>
					<a href="" ><img src="images\Hightly_effective.gif" width="185" height="200"/> </a>
					<a href="" ><img src="images\thepower_of_now.jpg" width="185" height="200"/> </a>
				</div>
				
				</div>
		<footer>
 				     
  				       <p>Contact information: <a href="vizronbookstore">
                              vizronbookstore.com</a>.</p>
		</footer>
		
</body>
</html>