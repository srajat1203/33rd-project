<!DOCTYPE html>
<html lang="en">
<head>
  <title>GradeInput</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Enter Student Information</h2>
  <form role="form" action="Gradebook" method = "post" >
    <div class="form-group">
      <label for="id">Student ID:</label>
      <input type="number" class="form-control" id="id" name="id" placeholder="Enter student id">
    </div>
    <div class="form-group">
      <label for="as">Assignment name:</label>
      <input type="text" class="form-control" id="as" name="as" placeholder="Enter assignmnet name">
    </div>
    <div class="form-group">
      <label for="type">Assignmnet type:</label>
      <input type="number" class="form-control" id="type" name="type" placeholder="Enter assignment type (1-homework, 2-quiz, 3-test, 4-project)">
    </div> 
    <div class="form-group">
      <label for="date">Date):</label>
      <input type="text" class="form-control" id="date" name="date" placeholder="Enter date (yyyy-mm-dd)">
    </div>
    <div class="form-group">
      <label for="grade">Grade:</label>
      <input type="number" class="form-control" id="grade" name="grade" placeholder="Enter grade">
    </div>
  <input type = "submit" value = "Gradebook"/>
  </form>
</div>

</body>
</html>