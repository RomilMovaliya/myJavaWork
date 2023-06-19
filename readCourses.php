<?php
$servername="localhost";
$username="root";
$password="";
$databasename="androidwala";

$conn=new mysqli($servername,$username,$password,$databasename);
$response=array();
if($_POST['id']){
    $id=$_POST['id'];
    $stmt=$conn->prepare("SELECT COURSE")
}



?>