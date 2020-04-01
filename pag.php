<?php
include_once("conexao.php");
$nome = $_POST['nome'];
$cpf = $_POST['cpf'];
$email = $_POST['email'];
$telefone = $_POST['telefone'];
$celular = $_POST['celular'];
$senha = MD5($_POST['senha']);
//echo "$nome_usuario - $email_usuario";

$result_usuario = "INSERT INTO usuario (nome,cpf,email,telefone,celular,senha) VALUES ('$nome','$cpf','$email','$telefone','$celular''$senha')";
$resultado_usuario = mysqli_query($conn, $result_usuario);

if(mysqli_affected_rows($conn) != 0){
    echo 'cadastrado com successo';   
}else
echo 'Não cadastrado';


?>