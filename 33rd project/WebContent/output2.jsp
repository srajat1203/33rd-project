<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Results</h2>
  <ul class="list-group">
    <li class="list-group-item">The assignments are : <br> ${assignments}</li>
    <li class="list-group-item">The average is : ${average}</li>
    <li class="list-group-item">The highest and lowest grades are : ${high} ${low} </li>
  </ul>
  <p><b>note : </b>If the average, highest, or  lowest scores say <b>"0"</b> or <b>101</b>, then ignore that entry as it is not relevant to your option you chose <br>
   in the previous page
</div>

</body>
</html>
