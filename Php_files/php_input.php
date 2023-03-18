 <?php    
 
 $folder="file";
 
if(!file_exists($folder)){
mkdir($folder);
}
 
 
    
    $data = @file_get_contents('php://input');
    $rand=rand();
    
    $fp = fopen($folder."/".$rand.".json", "wb");

    fwrite($fp, $data);
    fclose($fp);
    
    
    echo $data;
?>