<?php
  $servidor = "localhost";
  $usuario = "root";
  $senha = "";
  $dbname = "prestor_presto";
// Create connection
$conn = mysqli_connect($servidor, $usuario, $senha, $dbname);
// Check connection
if (!$conn) {
      die("Connection failed: " . mysqli_connect_error());
}
 
echo "Connected successfully";
 
$sql = "INSERT INTO usuario (nome,cpf,email,telefone,celular,senha) VALUES ('$nome','$cpf','$email','$telefone','$celular''$senha')";
if (mysqli_query($conn, $sql)) {
      echo "New record created successfully";
} else {
      echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}
mysqli_close($conn);
?>