 <script>
 // provide a valid url

const toSend =[{js_enable: "true"  }]; //json 
const jsonString = JSON.stringify(toSend);
const xhr = new XMLHttpRequest();

xhr.open("POST", "http://localhost:8000/service/blob/php_input.php");
xhr.setRequestHeader("Content-Type", "application/json");
xhr.send(jsonString);
xhr.onload = () => alert(xhr.responseText);


</script>