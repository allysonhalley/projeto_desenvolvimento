<?php
    $con = mysqli_connect("localhost", "id1584144_tortuga", "123456", "id1584144_tortuga");
    
    $username = $_POST["cpf"];
    $password = $_POST["password"];
    
    $statement = mysqli_prepare($con, "SELECT * FROM citizen WHERE cpf = ? AND password = ?");
    mysqli_stmt_bind_param($statement, "siss", $cpf, $password);
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $nome, $cpf, $password, $phone, $email, $strAddress);
    
    $response = array();
    $response["success"] = false;  
    
    while(mysqli_stmt_fetch($statement)){
        $response["success"] = true;  
        $response["name"] = $name;
        $response["cpf"] = $cpf;
        $response["password"] = $password;
        $response["phone"] = $phone;
		$response["email"] = $email;
		$response["strAddress"] = $strAddress;
    }
    
    echo json_encode($response);
?>