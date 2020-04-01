<?php
  $email_cookie = $_COOKIE['email'];
    if(isset($email_cookie)){
      echo"Bem-Vindo, $email_cookie <br>";
      echo"Essas informações <font color='red'>PODEM</font> ser acessadas por você";
        echo"<br><a href='index.html'>Vá até a pág inicial</a>";
    }else{
      echo"Bem-Vindo, convidado <br>";
      echo"Essas informações <font color='red'>NÃO PODEM</font> ser acessadas por você";
      echo"<br><a href='cadastro_usuario.html'>Faça Cadastro</a> Para ler o conteúdo";
    }
?>
