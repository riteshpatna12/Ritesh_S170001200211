<html>
  <head>
    <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>Bootstrap Theme The Band</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
</head>
	<jsp:include page="header.jsp"/> 
<body>

<div class="container-fluid bg-grey">
  <h2 class="text-center">CONTACT</h2>
  <div class="row">
    <div class="col-sm-5">
      <p>Contact us and we'll get back to you within 24 hours.</p>
      <p><span class="glyphicon glyphicon-map-marker"></span> PATNA-Bihar,INDIA</p>
      <p><span class="glyphicon glyphicon-phone"></span> +91-7677322390</p>
	  <p><span class="glyphicon glyphicon-phone"></span>+91-6115-225605 </p>
      <p><span class="glyphicon glyphicon-envelope"></span> ritsid22feb@gmail.com</p> 
    </div>
    <div class="col-sm-7">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="contactname" name="contactname" placeholder="Name" type="text" required>
        </div>
		</div>
		 <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="contactemail" name="contactemail" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="4"></textarea><br>
      <div class="row">
        <div class="col-sm-2 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div> 
    </div>
  </div>
  </div>
  
  <div id="googleMap" style="height:400px;width:100%;"></div>

   <script src="http://maps.googleapis.com/maps/api/js"></script>
   <script>
   var myCenter = new google.maps.LatLng(41.878114, -87.629798);

   function initialize() {
   var mapProp = {
     center:myCenter,
     zoom:12,
     scrollwheel:false,
     draggable:false,
     mapTypeId:google.maps.MapTypeId.ROADMAP
     };

   var map = new google.maps.Map(document.getElementById("googleMap"),mapProp);

   var marker = new google.maps.Marker({
     position:myCenter,
     });

   marker.setMap(map);
   }

   google.maps.event.addDomListener(window, 'load', initialize);
   </script>
  
</body>
</html>