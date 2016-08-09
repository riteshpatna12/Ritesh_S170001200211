<!DOCTYPE html>

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
		      width: 90%;
   		      margin: auto;
 		 }
 									
		/*  .dropdown-submenu {
             position: relative;
         }

         .dropdown-submenu .dropdown-menu {
             top: 0;
             left: 100%;
             margin-top: -1px;
         } */
  </style>
  
  		

</head>
		<jsp:include page="header.jsp"/> 
<body>

		 
	<!-- <nav class="navbar navbar-inverse">
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
     		 <li class="active"><a href="home.jsp">Home</a></li>
	  		 <li class="active"><a href="addbook.jsp">Books</a></li>
    		  <li class="dropdown">
	 	   <a class="dropdown-toggle" data-toggle="dropdown" href="category.jsp">Category<span class="caret"></span></a>
       <ul class="dropdown-menu">
      <li><a tabindex="-1" href="#">CORE JAVA BOOKS</a></li>
      <li><a tabindex="-1" href="#">ADVANCE JAVA BOOKS</a></li>
       <li><a tabindex="-1" href="#">SERVLET BOOKS</a></li>
        <li><a tabindex="-1" href="#">JSP BOOKS</a></li>
         <li><a tabindex="-1" href="#">SPRING BOOKS</a></li>
      <li class="dropdown-submenu">
        <a class="test" tabindex="-1" href="#">New dropdown <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a tabindex="-1" href="#">2nd level dropdown</a></li>
          <li><a tabindex="-1" href="#">2nd level dropdown</a></li>
          <li class="dropdown-submenu">
            <a class="test" href="#">Another dropdown <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#">3rd level dropdown</a></li>
              <li><a href="#">3rd level dropdown</a></li>
            </ul>
          </li>
        </ul>
      </li>
    </ul>
      </li>
      <li class="dropdown">
	     <a class="dropdown-toggle" data-toggle="dropdown" href="upcomingb.jsp">UpComing Books<span class="caret"></span></a>
     <ul class="dropdown-menu">
          <li><a href="">Java Programming</a></li>
          <li><a href="">Design Pattern</a></li>
          <li><a href="">Hibernate</a></li>
          <li><a href="">JavaBeans Cover</a></li>
        </ul>
		</li>
      <li><a href="contactus.jsp">Contact Us</a></li>
    </ul>
		
    <ul class="nav navbar-nav navbar-right">
        <li><a href="new_user_reg.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
    
  </div>
  </div>
</nav>   -->


	<div class="container">
	<br>
   <div id="myCarousel" class="carousel-slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="resources\images\bookbank.jpg" data-slide-to="0" class="active"></li>
      <li data-target="resources\images\booksislife.jpg" data-slide-to="1"></li>
      <li data-target="resources\images\b1.jpg" data-slide-to="2"></li>
      <li data-target="resources\images\b2.jpg" data-slide-to="3"></li>
      <li data-target="resources\images\b3.jpg" data-slide-to="4"></li>
    </ol>    
	
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="resources\images\bookbank.jpg" alt="Book is life." width="460" height="345">
         <div>
        
        </div>
      </div>
      
       <div class="item">
        <img src="resources\images\booksislife.jpg" alt="Book is life." width="460" height="345">
       <div>
        
        </div>
      </div>
      
      

      <div class="item">
        <img src="resources\images\b1.jpg" alt="Life without limit" width="460" height="345">
         <div>
       
        </div>
      </div>
    
      <div class="item">
        <img src="resources\images\b2.jpg" alt="the power of now" width="460" height="345">
         <div>
        
        </div>
      </div>

             
        </div>
      </div>
    </div>
		
		 <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
       </div>
       
       		 <div class="row">
    <div class="col-md-3">
      <a href="resources\images\Hibernate.jpg" class="category">
        
        <img src="resources\images\Hibernate.jpg" alt="Pulpit Rock" style="width:250px;height:250px">
      </a>
    </div>
    <div class="col-md-3">
      <a href="resources\images\Javabeanscover.jpg" class="category">
       
        <img src="resources\images\Javabeanscover.jpg" alt="Moustiers Sainte Marie" style="width:250px;height:250px">
      </a>
    </div>
    <div class="col-md-3">
      <a href="resources\images\JavaProgramming.jpg" class="category">
       
        <img src="resources\images\JavaProgramming.jpg" alt="Cinque Terre" style="width:250px;height:250px">
      </a>
    </div>
    	 <div class="col-md-3">
      <a href="resources\images\Designpatterns.jpg" class="category">
       
        <img src="resources\images\Designpatterns.jpg" alt="Moustiers Sainte Marie" style="width:250px;height:250px">
      </a>
    </div>
    
  </div>
       
	  </div>
     
        <jsp:include page="footer.jsp"/> 
       
	  </body>
	  		
</html>
