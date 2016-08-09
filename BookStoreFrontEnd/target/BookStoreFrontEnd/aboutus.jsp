<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
		<jsp:include page="header.jsp"/> 
<body>

<div class="container">
  <ul class="nav nav-pills">
    <li class="active"><a data-toggle="pill" href="aboutus.jsp">About Us</a></li>
    <li><a data-toggle="pill" href="#menu2">Team</a></li>
    <li><a data-toggle="pill" href="#menu3">Career</a></li>
    <li><a data-toggle="pill" href="#menu4">Gallery</a></li>
  </ul>
  
  <div class="tab-content">
    <div id="aboutus" class="tab-pane fade in active">
      <h3>About Us</h3>
      <p>
		Buy Books India offers you a vast number of books from authors and publishers across the globe.<br/>
	    Search, preview and buy a new released or discovers an old classic. <br/>
	    Search from the hundreds of titles across categories like Web Development,Web Designing,Networking,Operating System<br/>
	    Indian and International authors and 
	    Competitive Exam Books and get them shipped across India and SAARC countries.<br/>
		An online portal where your search for every book ends.</p>
    </div>
    
    <div id="menu2" class="tab-pane fade">
      <h3>Menu 2</h3>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    </div>
    
    <div id="menu3" class="tab-pane fade">
      <h3>Menu 3</h3>
      <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
    </div>
    
    <div id="menu4" class="tab-pane fade">
      <h3>Menu 4</h3>
      <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
    </div>
    
  </div>
</div>

		<jsp:include page="footer.jsp"/> 

</body>
</html>

