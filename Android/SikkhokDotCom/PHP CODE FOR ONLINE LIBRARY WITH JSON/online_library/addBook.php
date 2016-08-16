<?php
    if($_SERVER['REQUEST_METHOD']=='POST'){
    $newresponse=array();
    $title=$_POST['title'];
    $author=$_POST['author'];
    $category=$_POST['category'];
    $ISBN=$_POST['ISBN'];
    $price=$_POST['price'];
    
    require_once __DIR__.'/db_connect.php';
    $db=new DB_CONNECT();

    $sql="insert into books (title, author, category, ISBN, price) values ('".$title."','".$author."','".$category."','".$ISBN."','".$price."')";
    $inserted=  mysql_query($sql);
    if($inserted){
        $newresponse['success']=1;
        echo json_encode($newresponse);
    }
    else{
        $newresponse['success']=0;
        echo json_encode($newresponse);
    }
    }else{
        
    }