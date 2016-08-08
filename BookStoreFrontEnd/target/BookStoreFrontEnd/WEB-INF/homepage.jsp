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
<%-- 		<jsp:include page="header.jsp"/> --%>
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
</nav>  


	<div class="container">
	<br>
   <div id="myCarousel" class="carousel-slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>    
	
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="images\bookbank.jpg" alt="Book is life." width="960" height="845">
        <div class="carousel-caption">
          <h3>Books</h3>
          <p>Good Books are the best cure in the world.</p>
        </div>
      </div>

      <div class="item">
        <img src="images\b1.jpg" alt="Life without limit" width="460" height="345">
        <div class="carousel-caption">
          <h3>Life Without Limit</h3>
          <p>This is about a great Person.</p>
        </div>
      </div>
    
      <div class="item">
        <img src="images\b2.jpg" alt="the power of now" width="460" height="345">
        <div class="carousel-caption">
          <h3>The Power Of Now</h3>
          <p>when you will try then will you get results.</p>
        </div>
      </div>

      <div class="item">
        <img src="images\Designpatterns.jpg" alt="Design Pattern" width="460" height="345">
        <div class="carousel-caption">
          <h3>Design Patterns</h3>
          <p>GANG OF FOUR.</p>
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
	  </div>
      <!--   <div>
      <footer>
         <p>Posted by: Ritesh Kumar</p>
           <p>Contact information: <a href="vizronbookstore.com">vizronbookstore.com</a>.</p>
      </footer>

         <p><strong>Note:</strong> The footer tag is not supported in Internet Explorer 8 and earlier versions.</p>
        </div> -->
        
        <script>
$(document).ready(function(){
  $('.dropdown-submenu a.test').on("click", function(e){
    $(this).next('ul').toggle();
    e.stopPropagation();
    e.preventDefault();
  });
});

</script>
	  </body>
</html>
