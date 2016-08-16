<?php

$response=array();
require_once __DIR__.'/db_connect.php';
//$categoryParam=$_REQUEST['category'];
$db=new DB_CONNECT();

$sql="SELECT * from books";
//$sql="SELECT * from books where category like '".$categoryParam."'";
$result=  mysql_query($sql);
if(!empty($result)){
    if(mysql_num_rows($result)>0){
        //$books=  mysql_fetch_array($result);
        $response['books']=array();
        while ($row = mysql_fetch_array($result)) {
            $book=array();
            $book['id']=$row['id'];
            $book['title']=$row['title'];
            $book['author']=$row['author'];
            $book['category']=$row['category'];
            $book['ISBN']=$row['ISBN'];
            $book['price']=$row['price'];
        
            array_push($response['books'], $book);
        }
        
        $response['success']=1;
        //$response['book']=array();
        
        echo json_encode($response);
    }
    else{
        $response['success']=0;
        $response['message']='no data found';
        echo json_encode($response);
    }
}