<?php
    $servidor = "localhost";
    $usuario = "root";
    $senha = "";
    $dbname = "presto";





    //Criar a conexao
    $conn = mysqli_connect($servidor, $usuario, $senha, $dbname);

    if(!$conn){
        die("Falha na conexao: " . mysqli_connect_error());
    }
        echo "Conexao realizada com sucesso";


        $nome = $_POST['nome'];
        $cpf = $_POST['cpf'];
        $email = $_POST['email'];
        $telefone = $_POST['telefone'];
        $celular = $_POST['celular'];
        $senha = MD5($_POST['senha']);

        $sql = "INSERT INTO usuario (nome,  email ,cpf, telefone, celular, senha) VALUES ('$nome','$email','$cpf','$telefone','$celular','$senha')";
    if (mysqli_query($conn, $sql)) {
          echo "Novo dado cadastrado successfully";
    } else {
          echo "Error: " . $sql . "<br>" . mysqli_error($conn);
    }
    mysqli_close($conn);
?>
