<!DOCTYPE html>
<head>
<title> DJBHAI</title>

<?php 


//include "../header_files.php";
 ?>
</head>



<body class="body">

<form>

<input name="ifsc" type="text">
<input  type="submit" value="SEARCH">
</form>

<?php

if(isset($_GET['ifsc'])){ $ifsc=$_GET['ifsc']; }
else {  $ifsc='SBIN0007342'; }

 $json=@file_get_contents('https://ifsc.razorpay.com/'.$ifsc);
$arr=json_decode($json);
echo "<br>";
echo "<br>";

if(isset($arr->BRANCH)){
	echo 'Branch:   '.$arr->BRANCH.'<br/>';
	echo "Address:   ".$arr->ADDRESS."<br/>";
	echo "State:-".$arr->STATE."<br/>";
	
	echo "Bank: ".$arr->BANK."<br/>";
	echo "Bank Code: ".$arr->BANKCODE."<br/>";
	echo "IFSC: ".$arr->IFSC."<br/>";
	
	
}else{
	echo "Invalid IFSC Code";
}
?>


</body>
</html>