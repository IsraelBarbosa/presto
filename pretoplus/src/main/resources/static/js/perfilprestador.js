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

// Abrir form classificação
let mClasficar = document.getElementsByClassName("modalClassificar")[0];
let fClasficar = document.getElementsByClassName("formClasfcar")[0];

function abrirClasfcar() {
    mClasficar.classList.add("modalClassificarAparece");
    fClasficar.classList.add("formClasfcarAparece");
}

function fecharClasfcar() {
    fClasficar.classList.remove("formClasfcarAparece");
    mClasficar.classList.remove("modalClassificarAparece");
}


window.onclick = (event) => {
    if (event.target == modal) {
        fContrato.classList.remove("formContratoAparece");
        modal.classList.remove("modalAparece");
    } else if (event.target == mClasficar) {
        fClasficar.classList.remove("formClasfcarAparece");
        mClasficar.classList.remove("modalClassificarAparece");
    }
}