function pegarNomeDoc() {
    let nomeDocuEnviado = document.getElementById("nomeArq");
    let nomeDocuInp = document.getElementById("enviarFile");
    if (nomeDocuInp.value.length > 4) {      
        nomeDocuEnviado.innerText = nomeDocuInp.value; 
    }    
}

