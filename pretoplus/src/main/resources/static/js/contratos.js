function aEditarPer() {
    let infoUser = document.getElementById("opcEdit");

    infoUser.style.zIndex = 1;
    infoUser.style.opacity = 1;
}

function fEditarPer() {
    let infoUser = document.getElementById("opcEdit");
    infoUser.style.zIndex = -1;
    infoUser.style.opacity = 0;
}


// Abrir form contrato
let modal =  document.getElementsByClassName("modal")[0];
let fContrato =  document.getElementsByClassName("formContrato")[0];

function abrirFormContrato() {
   modal.classList.add("modalAparece");
   fContrato.classList.add("formContratoAparece");
}

function sumirModal() {
    fContrato.classList.remove("formContratoAparece");
    modal.classList.remove("modalAparece");
}

window.onclick = (event) => {
    if (event.target == modal) {
        fContrato.classList.remove("formContratoAparece");
        modal.classList.remove("modalAparece");
    }
}

// Mudar cor inputs date
function MudarCorDaIni() {
    let dataIni = document.getElementById("dataIni");
    dataIni.style.color = "black";
}

function MudarCorDaTer() {
    let dataTer = document.getElementById("dataTer");
    dataTer.style.color = "black";
}

