var password = document.getElementById("senha")
  , senha2 = document.getElementById("senha2");

function validatePassword(){
  if(senha.value != senha2.value) {
    senha2.setCustomValidity("Senhas diferentes!");
  } else {
    senha2.setCustomValidity('');
  }
}

senha.onchange = validatePassword;
senha2.onkeyup = validatePassword;
