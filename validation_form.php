
<html>
    <head>
        <style>
            .error{
                color: red;
            }
        </style>
    </head>
    <body>
<h1>validation form</h1>
<?php


$usernameErr = $passwordErr = $emailerr = $mobilenoerr = " ";
$username = $password = $email = $mobileno = " ";

if($_SERVER["REQUEST_METHOD"]== "POST"){
    if(empty($_POST["name"])){
        $usernameErr="name is required ";
    }else{
        $name=test_input($_POST["username"]);
    }

    if(empty($_POST["password"])){
        $passwordErr="password is required";
    }else{
        $password=test_input($_POST["password"]);
    }

    if(empty($_POST["email"])){
        $emailerr="Email is required";
    }else{
        $email=input_test($_POST["email"]);
    }

    if(empty($_POST["mobileno"])){
        $mobilenoerr="mobile is required";
    }else{
        $mobileno=input_test($_POST["mobileno"]);
    }
}

function input_test($data){
    $data=trim($data);
    $data=stripslashes($data);
    $data=htmlspecialchars($data);
    return $data;
}
?>

</body>
</html>