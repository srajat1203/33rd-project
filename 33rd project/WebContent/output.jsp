<!DOCTYPE html>
<html lang="en">
<head>
  <title>Average</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <div class="jumbotron">
    <h1>Viewing options</h1>      
    <p>Your student record has been stored</p>  
    <p><a href = input.jsp>Click Here to add more records</a></p>
  </div>    
  
  <div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">All Assignments by a student
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li>
      	<form role="form" action="Viewdata" method = "post" >
    	<div class="form-group">
     	 <label for="id">Enter Student ID:</label>
      	<input type="number" class="form-control" id="id" name="id" placeholder="Enter id">
    	</div>
    	<input type = "submit" value = "Viewdata"/>
    	</form>
      </li>
    </ul>
  </div>
  
  <br><br>
 
 <div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">All assignments of a particular type by anyone
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li>
      	<form role="form" action="Viewdata" method = "post" >
    	<div class="form-group">
     	 <label for="type">Enter assignment type:</label>
      	<input type="number" class="form-control" id="type" name="type" placeholder="Enter type">
    	</div>
    	<input type = "submit" value = "Viewdata"/>
    	</form>
      </li>
    </ul>
  </div>
  
    <br><br>
 
 <div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">All assignments of a particular type by a particular student
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li>
      	<form role="form" action="Viewdata" method = "post" >
    	<div class="form-group">
     	 <label for="id">Enter student ID:</label>
      	<input type=number" class="form-control" id="id" name="id" placeholder="Enter id">
    	</div>
    	<div class="form-group">
     	 <label for="type">Enter assignment type:</label>
      	<input type="number" class="form-control" id="type" name="type" placeholder="Enter type">
    	</div>
    	<input type = "submit" value = "Viewdata"/>
    	</form>
      </li>
    </ul>
  </div>
  
  <br><br>
 
 <div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">The average for a student
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li>
      	<form role="form" action="Viewdata" method = "post" >
    	<div class="form-group">
     	 <label for="avgid">Enter Student ID:</label>
      	<input type="text" class="form-control" id="avgid" name="avgid" placeholder="Enter id">
    	</div>
    	<input type = "submit" value = "Viewdata"/>
    	</form>
      </li>
    </ul>
  </div>
  
  
   <br><br>
 
 <div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">The average for a student by assignment type
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li>
      	<form role="form" action="Viewdata" method = "post" >
    	<div class="form-group">
     	 <label for="avgid">Enter student ID:</label>
      	<input type="number" class="form-control" id="avgid" name="avgid" placeholder="Enter id">
    	</div>
    	<div class="form-group">
     	 <label for="avgtype">Enter assignment type:</label>
      	<input type="number" class="form-control" id="avgtype" name="avgtype" placeholder="Enter type">
    	</div>
    	<input type = "submit" value = "Viewdata"/>
    	</form>
      </li>
    </ul>
  </div>
  
  
    <br><br>
 
 <div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">The highest and lowest grade for a particular assignment type
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li>
      	<form role="form" action="Viewdata" method = "post" >
    	<div class="form-group">
     	 <label for="hltype">Enter assignment type:</label>
      	<input type="number" class="form-control" id="hltype" name="hltype" placeholder="Enter type">
    	</div>
    	<input type = "submit" value = "Submit"/>
    	</form>
      </li>
    </ul>
  </div>
  
  
</div>

</body>
</html>
