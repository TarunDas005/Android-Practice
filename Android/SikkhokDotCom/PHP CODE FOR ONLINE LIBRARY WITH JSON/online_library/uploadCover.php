<?php

$base64Data=$_REQUEST['image'];
$binary=  base64_decode($base64Data);
header('Content-Type: bitmap; charset= utf-8');
$file=  fopen("pic.jpg", 'wb');
fwrite($file, $binary);
fclose($file);
