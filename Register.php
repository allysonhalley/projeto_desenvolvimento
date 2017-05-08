<?php
    $con = mysqli_connect("localhost", "id1584144_tortuga", "123456", "id1584144_tortuga");
    
    $name = $_POST[""];
	$cep = $_POST["cep"];
	$password = $_POST["password"];
	$phone = $_POST["phone"];
	$email = $_POST["email"];
	$cep = $_POST["cep"];
	$number = $_POST["number"];
	$ = $_POST["strAddress"];
	
    $statement = mysqli_prepare($con, "INSERT INTO address (name, cep, password, phone, email, cep, number) VALUES (?, ?, ?, ?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siiisii", $name, $cep, $password, $phone, $email, $cep, $number;
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>