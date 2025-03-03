let inputNome = document.getElementsByClassName("formulario-nome")[0];
let inputEmail = document.getElementsByClassName("formulario-email")[0];
let inputTel = document.getElementsByClassName("formulario-telefone")[0];
let avisoNome = document.getElementsByClassName("aviso-nome")[0];
let avisoEmail = document.getElementsByClassName("aviso-email")[0];
let avisoTel = document.getElementsByClassName("aviso-tel")[0];
let avisoCheckboxComunicacao = document.getElementsByClassName("aviso-checkbox-comunicacao")[0];
let avisoCheckboxCarnes = document.getElementsByClassName("aviso-checkbox-carnes")[0];
let checkboxCarnesExoticas = document.getElementsByClassName("checkbox-carnes-exóticas")[0];
let checkboxCarnesTradicionais = document.getElementsByClassName("checkbox-carnes-tradicionais")[0];
let checkboxAmbas = document.getElementsByClassName("checkbox-ambas")[0];
let checkboxComunicacaoTodos = document.querySelector(".checkDesmarcado.checkbox-comunicacao-todos");
let checkboxComunicacaoSms = document.querySelector(".checkDesmarcado.checkbox-comunicacao-sms");
let checkboxComunicacaoEmail = document.querySelector(".checkDesmarcado.checkbox-comunicacao-email");


let iconeMenu = document.querySelector('.icone-menu');
let menuHamburguer = document.querySelector('#menu-amburguer');
let fechar = document.querySelector(".fechar")



iconeMenu.addEventListener('click', function () {
  if (menuHamburguer.style.display === 'none') {
    menuHamburguer.style.display = 'flex';
  } else {
    menuHamburguer.style.display = 'none';
  }
});

fechar.addEventListener("click", function () {
  if (menuHamburguer.style.display === 'flex') {
    menuHamburguer.style.display = 'none';
  }
})

// BARRA DE PESQUISA
let barraPesquisa = document.getElementById("searchInput");
let resultado = document.getElementById("resultado");
let lupa = document.getElementById("lupa");

lupa.addEventListener("click", function () {
  barraPesquisa.classList.toggle("pesquisa");
  resultado.classList.toggle("resultadoAparece")
});

let dados = [
  {
    nome: "flat iron angus", imagem: "imagens/flat-iron-angus-1010g-congelado-8c1529e1.png",
    link: "https://boutique.carapretaoficial.com.br/flat-iron-angus-1kg/product/221610"
  },
  {
    nome: "denver angus", imagem: "imagens/denver-angus-903g-congelado-a4e97b12.png",
    link: "https://boutique.carapretaoficial.com.br/denver-angus-903g/product/221606"
  },
  {
    nome: "ancho angus porcionado", imagem: "imagens/ancho-angus-porcionado-1106g-congelado-5e0640bf.png",
    link: "https://boutique.carapretaoficial.com.br/ancho-angus-1050kg/product/221615"
  },
  {
    nome: "picanha angus", imagem: "imagens/picanha-angus-1200kg-congelado-20f9d40a.png",
    link: "https://boutique.carapretaoficial.com.br/picanha-angus-11kg/product/221605"
  },
  {
    nome: "maminha angus", imagem: "imagens/maminha-angus-960g-congelado-060819a3.png",
    link: "https://boutique.carapretaoficial.com.br/maminha-angus-1180kg/product/221612"
  },
  { nome: "skirt steak angus ", imagem: "imagens/3dec7dc8e0.png", link: "https://boutique.carapretaoficial.com.br/skirt-steak-angus-706g/product/221602" },
  { nome: "fraldinha angus ", imagem: "imagens/fraldinha-angus-975g-congelado-787976ce.png", link: "https://boutique.carapretaoficial.com.br/fraldinha-red-angus-610g/product/221611" },
  { nome: "Tomahawk angus ", imagem: "imagens/tomahawk-angus-950g-congelado-d2ff6d5f.png", link: "https://boutique.carapretaoficial.com.br/tomahawk-angus-950g/product/221621" },
  { nome: "cowboy angus ", imagem: "imagens/d13c4158c4.png", link: "https://boutique.carapretaoficial.com.br/cowboy-angus-750g/product/221620" },
  { nome: "bisteca de porco", imagem: "imagens/ACOUGUE-BISTECA-DE-PORCO-S-CP-KG.webp", link: "https://www.swift.com.br/bisteca-swift-mais-1kg/p" },
  { nome: "javali", imagem: "imagens/1591213c4d.png", link: "https://www.zezinhocarnes.com.br/produto/javali/" },
  { nome: "coelho", imagem: "imagens/coelho-cortes-kg-617678-1.png", link: "https://www.zezinhocarnes.com.br/produto/coelho/" },
  { nome: "capivara", imagem: "imagens/P046-capivara.jpg", link: "https://porcofeliz.com.br/capivara/" },
  { nome: "peito de pato", imagem: "imagens/peito_picanha_pato_germania_1kg_24ff5ef4-d3d2-4d8a-ade5-2dac808fddec.jpg", link: "https://www.swift.com.br/peito-de-pato-swift-480g/p?idsku=1744&utm_source=Google_Shopping&gclid=CjwKCAjwsvujBhAXEiwA_UXnAJeIy_ze88tCuJlDNb4AAgsrgQbVvxnj3S_2bMl1jw5Dz86LVv3GDRoCcuAQAvD_BwE" },
  { nome: "avestruz", imagem: "imagens/images (1)_jpgavestruz 2.png", link: "https://multsaudedistribuidora.com.br/product/carne-de-avestruz-com-osso/" },
  { nome: "jacaré", imagem: "imagens/jacare.jpg", link: "https://padovanialimentos.com.br/product/jacare-cortes/" }


];

function realizarPesquisa() {
  let termoPesquisa = barraPesquisa.value.toLowerCase();

  resultado.innerHTML = "";

  let resultadosFiltrados = dados.filter(function (item) {
    return item.nome.toLowerCase().includes(termoPesquisa);
  });

  resultadosFiltrados.forEach(function (item) {
    let aResultado = document.createElement("a");
    aResultado.setAttribute("id", "link-pesquisa");
    aResultado.setAttribute("class", "link-pesquisa");
    aResultado.style.border = "2px solid gray";
    aResultado.style.borderRadius = "30px";
    aResultado.style.backgroundColor = "white"
    aResultado.style.alignItems = "center"
    resultado.style.display = "block";
    resultado.style.flexWrap = "wrap"; // Se quiser quebrar para uma nova linha quando necessário
    resultado.style.justifyContent = "center";
    aResultado.style.boxSizing = "border-box";



    aResultado.href = item.link;

    let imagem = document.createElement("img");
    imagem.setAttribute("id", "imagem-pesquisa-novo");
    imagem.setAttribute("class", "imagem-pesquisa-novo");
    imagem.src = item.imagem;
    imagem.alt = item.nome;
    aResultado.appendChild(imagem);

    let nomeItem = document.createElement("span");
    nomeItem.setAttribute("class", "nome-pesquisa");
    nomeItem.style.marginTop = "0px";

    let paragrafoItem = document.createElement("p");
    paragrafoItem.setAttribute("class", "nome-paragrafo");
    paragrafoItem.textContent = item.nome;
    nomeItem.appendChild(paragrafoItem);

    // Ajustando a div de resultado para exibir os itens na horizontal e centralizados
    resultado.style.display = "flex";
    resultado.style.flexWrap = "wrap"; // Permite que quebrem linha, se necessário
    resultado.style.justifyContent = "center";
    resultado.style.gap = "0px"; // Espaço entre os elementos

    // Configurando os links (cada resultado)
    aResultado.style.display = "flex";
    aResultado.style.alignItems = "center"; // Alinha os itens verticalmente
    aResultado.style.justifyContent = "flex-start"; // Mantém a imagem e texto alinhados
    aResultado.style.padding = "10px";
    aResultado.style.gap = "15px"; // Espaço entre imagem e texto

    
   
    imagem.style.objectFit = "cover";
    imagem.style.borderRadius = "10px";

    // Ajustando o nome
    nomeItem.style.display = "flex";
    nomeItem.style.alignItems = "center"; // Para garantir alinhamento
    nomeItem.style.color = "#333";


    nomeItem.addEventListener("click", function () {
      barraPesquisa.value = item.nome;
    });

    aResultado.appendChild(nomeItem);

    resultado.appendChild(aResultado);
  });
  // if (window.innerWidth < 800) {
  //   document.querySelectorAll(".link-pesquisa").forEach(function (item) {

  //     el.style.width = "10%";
  //   });
  // }

}

barraPesquisa.addEventListener("input", function () {
  realizarPesquisa();
});

barraPesquisa.addEventListener("input", function () {
  if (barraPesquisa.value.trim() === '') {
    resultado.innerHTML = '';
  } else {
    realizarPesquisa();
  }
});


// CÓDIGO DO INPUT NOME

function nome() {
  let nome = inputNome.value;
  if (/[^a-zA-Z\s]/.test(nome) || /\d/.test(nome) || inputNome.value.trim() === "" || nome.split(" ").length < 2) {
    avisoNome.style.display = "flex";
    return false;
  } else {
    avisoNome.style.display = "none";
    return true;
  }
}

inputNome.addEventListener("input", nome);



// CÓDIGO INPUT EMAIL

function email() {
  let email = inputEmail.value;
  if (inputEmail.value.trim() === "") {
    avisoEmail.innerText = "Por favor, insira um endereço de e-mail.";
    avisoEmail.style.display = "flex";
    return false;
  } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
    avisoEmail.innerText = "Por favor, insira um endereço de e-mail válido.";
    avisoEmail.style.display = "flex";
    return false;
  } else {
    avisoEmail.style.display = "none";
    return true;
  }
}




inputEmail.addEventListener("input", email);

// CODIGO INPUT TELEFONE

function removeCaracteresIndesejados(valor) {
  return valor.replace(/[^0-9]/g, "");
}

function telefone() {
  let tel = inputTel.value;
  tel = removeCaracteresIndesejados(tel);

  if (tel.length !== 11 || tel.trim() === "") {
    avisoTel.style.display = "flex";
    return false;
  }

  avisoTel.style.display = "none";
  return true;
}

inputTel.addEventListener("input", telefone);
inputTel.addEventListener("blur", function () {
  inputTel.value = removeCaracteresIndesejados(inputTel.value);
  telefone();
});




// CÓDIGO CHECKBOX CARNES
let ambas = 0
function checkboxValidaAmbas() {
  if (checkboxAmbas.style.backgroundColor === "") {
    checkboxCarnesExoticas.style.backgroundColor = "blue";
    checkboxCarnesTradicionais.style.backgroundColor = "blue";
    checkboxAmbas.style.backgroundColor = "blue";
    avisoCheckboxCarnes.style.display = "none";
    return ambas = true;
  } else if (checkboxAmbas.style.backgroundColor === "blue") {
    checkboxCarnesExoticas.style.backgroundColor = "";
    checkboxCarnesTradicionais.style.backgroundColor = "";
    checkboxAmbas.style.backgroundColor = "";
    avisoCheckboxCarnes.style.display = "flex";
    return ambas = false;
  }
}

let exoticas = 0
function checkboxValidaExoticas() {
  if (checkboxCarnesExoticas.style.backgroundColor === "") {
    checkboxCarnesExoticas.style.backgroundColor = "blue";
    checkboxCarnesTradicionais.style.backgroundColor = "";
    checkboxAmbas.style.backgroundColor = "";
    avisoCheckboxCarnes.style.display = "none";
    return exoticas = true;
  } else if (checkboxCarnesExoticas.style.backgroundColor === "blue") {
    checkboxCarnesTradicionais.style.backgroundColor = "";
    checkboxCarnesExoticas.style.backgroundColor = "";
    checkboxAmbas.style.backgroundColor = "";
    avisoCheckboxCarnes.style.display = "flex";
    return exoticas = true;
  } else {
    return exoticas = false;
  }
}

let tradicionais = 0
function checkboxValidaTradicionais() {
  if (checkboxCarnesTradicionais.style.backgroundColor === "") {
    checkboxCarnesTradicionais.style.backgroundColor = "blue";
    checkboxCarnesExoticas.style.backgroundColor = "";
    checkboxAmbas.style.backgroundColor = "";
    avisoCheckboxCarnes.style.display = "none";
    return tradicionais = true;
  } else if (checkboxCarnesTradicionais.style.backgroundColor === "blue") {
    checkboxCarnesExoticas.style.backgroundColor = "";
    checkboxCarnesTradicionais.style.backgroundColor = "";
    checkboxAmbas.style.backgroundColor = "";
    avisoCheckboxCarnes.style.display = "flex";
    return tradicionais = false;
  }
}

checkboxCarnesExoticas.addEventListener("click", checkboxValidaExoticas);
checkboxCarnesTradicionais.addEventListener("click", checkboxValidaTradicionais);
checkboxAmbas.addEventListener("click", checkboxValidaAmbas);



// CÓDIGO CHECKBOX Comunicação

function checkboxValidaEmail() {
  let email = 0;

  checkboxComunicacaoEmail.classList.toggle("checkDesmarcado");
  checkboxComunicacaoEmail.classList.toggle("checkMarcado");

  if (checkboxComunicacaoEmail.classList.contains("checkMarcado") && checkboxComunicacaoSms.classList.contains("checkDesmarcado")) {
    checkboxComunicacaoTodos.setAttribute("class", "checkMetade");
  }
  if (checkboxComunicacaoEmail.classList.contains("checkDesmarcado") && checkboxComunicacaoSms.classList.contains("checkMarcado")) {
    checkboxComunicacaoTodos.setAttribute("class", "checkMetade");
  }
  if (checkboxComunicacaoSms.classList.contains("checkMarcado") && checkboxComunicacaoEmail.classList.contains("checkMarcado")) {
    checkboxComunicacaoTodos.setAttribute("class", "checkMarcado");
  }
  if (checkboxComunicacaoSms.classList.contains("checkDesmarcado") && checkboxComunicacaoEmail.classList.contains("checkDesmarcado")) {
    checkboxComunicacaoTodos.setAttribute("class", "checkDesmarcado");
  }
  if (checkboxComunicacaoEmail.classList.contains("checkDesmarcado") && checkboxComunicacaoSms.classList.contains("checkDesmarcado") && checkboxComunicacaoTodos.classList.contains("checkDesmarcado")) {
    avisoCheckboxComunicacao.style.display = "flex";
    return email = false;
  } else {
    avisoCheckboxComunicacao.style.display = "none";
    return email = true;
  }
}


function checkboxValidaSms() {
  let sms = 0

  checkboxComunicacaoSms.classList.toggle("checkDesmarcado");
  checkboxComunicacaoSms.classList.toggle("checkMarcado");

  if (checkboxComunicacaoSms.classList.contains("checkMarcado") && checkboxComunicacaoEmail.classList.contains("checkDesmarcado")) {
    checkboxComunicacaoTodos.setAttribute("class", "checkMetade");
  }
  if (checkboxComunicacaoSms.classList.contains("checkDesmarcado") && checkboxComunicacaoSms.classList.contains("checkMarcado")) {
    checkboxComunicacaoTodos.setAttribute("class", "checkMetade");
  }
  if (checkboxComunicacaoSms.classList.contains("checkMarcado") && checkboxComunicacaoEmail.classList.contains("checkMarcado")) {
    checkboxComunicacaoTodos.setAttribute("class", "checkMarcado");
  }
  if (checkboxComunicacaoSms.classList.contains("checkDesmarcado") && checkboxComunicacaoEmail.classList.contains("checkDesmarcado")) {
    checkboxComunicacaoTodos.setAttribute("class", "checkDesmarcado");
  }
  if (checkboxComunicacaoSms.classList.contains("checkDesmarcado") && checkboxComunicacaoEmail.classList.contains("checkDesmarcado") && checkboxComunicacaoTodos.classList.contains("checkDesmarcado")) {
    avisoCheckboxComunicacao.style.display = "flex";
    return sms = false;
  } else {
    avisoCheckboxComunicacao.style.display = "none";
    return sms = true;
  }
}

function checkboxValidaTodos() {
  let todos = 0

  checkboxComunicacaoTodos.classList.toggle("checkDesmarcado");
  checkboxComunicacaoTodos.classList.toggle("checkMarcado");

  if (checkboxComunicacaoTodos.classList.contains("checkMarcado")) {
    checkboxComunicacaoSms.setAttribute("class", "checkMarcado");
    checkboxComunicacaoEmail.setAttribute("class", "checkMarcado");
    checkboxComunicacaoTodos.setAttribute("class", "checkMarcado");
  } else if (checkboxComunicacaoTodos.classList.contains("checkDesmarcado")) {
    checkboxComunicacaoTodos.setAttribute("class", "checkDesmarcado");
    checkboxComunicacaoSms.setAttribute("class", "checkDesmarcado");
    checkboxComunicacaoEmail.setAttribute("class", "checkDesmarcado");
  }
  if (checkboxComunicacaoTodos.classList.contains("checkDesmarcado")) {
    avisoCheckboxComunicacao.style.display = "flex";
    avisoCheckboxComunicacao.style.display = "flex";
    return todos = false;
  } else {
    avisoCheckboxComunicacao.style.display = "none";
    return todos = true;
  }
}

checkboxComunicacaoTodos.addEventListener("click", checkboxValidaTodos);
checkboxComunicacaoSms.addEventListener("click", checkboxValidaSms);
checkboxComunicacaoEmail.addEventListener("click", checkboxValidaEmail);


// CÓDIGO SELECT CARNES 
let SelectItensCarnes = document.getElementsByClassName("select-itens")[0];
let SelectBovinas = document.getElementsByClassName("select-carnes-bovinas")[0];
let SelectSuinas = document.getElementsByClassName("select-carnes-suinas")[0];
let SelectAves = document.getElementsByClassName("select-carnes-aves")[0];
let SelectMar = document.getElementsByClassName("select-carnes-mar")[0];
let SelectOutros = document.getElementsByClassName("outros")[0];
let escondeItens = document.getElementsByClassName("esconde-itens")[0];
let containerItens = document.getElementsByClassName("container-itens")[0];
let AvisoSelect = document.getElementsByClassName("aviso-select-carnes")[0];
const spandLess = document.getElementById("spand-less");
const paragrafoSelectCarne = document.getElementById("paragrafo-select-itens")

function selectCarnes() {
  if (containerItens.classList.contains("esconde-itens")) {
    containerItens.classList.remove("esconde-itens");
    containerItens.classList.add("container-itens");
    spandLess.style.transform = "rotate(180deg)";
  } else {
    containerItens.classList.remove("container-itens");
    containerItens.classList.add("esconde-itens");
    spandLess.style.transform = "rotate(360deg)";
  }

  if (SelectItensCarnes.getAttribute("class") === "select-itens") {
    AvisoSelect.style.display = "flex";
    AvisoSelect.style.alignItems = "center"
    AvisoSelect.style.flexWrap = "colum"
    return false;
  } else {
    AvisoSelect.style.display = "none";
    return true;
  }
}

SelectItensCarnes.addEventListener("click", selectCarnes);

let selectcarne = ""
function mudarItem(item) {
  SelectItensCarnes.innerHTML = item.innerHTML;

  return selectcarne = true
}

SelectBovinas.addEventListener("click", function () {
  mudarItem(SelectBovinas);
});

SelectSuinas.addEventListener("click", function () {
  mudarItem(SelectSuinas);
});

SelectAves.addEventListener("click", function () {
  mudarItem(SelectAves);
});

SelectMar.addEventListener("click", function () {
  mudarItem(SelectMar);
});

SelectOutros.addEventListener("click", function () {
  mudarItem(SelectOutros);
});

let campoTexto = document.getElementsByClassName("campo-texto")[0];
let avisoTexto = document.getElementsByClassName("aviso-campo-texto")[0];

function checkCampoTexto() {
  if (campoTexto.value.length < 5) {
    avisoTexto.style.display = "flex";
    return false;
  } else {
    avisoTexto.style.display = "none";
    return true;
  }
}

campoTexto.addEventListener("click", checkCampoTexto);


let botaoValidar = document.getElementsByClassName("button")[0];
botaoValidar.innerHTML = "Validar";



function validarFormulario() {
  let camposPreenchidos = nome() && email() && telefone() && checkCampoTexto() && selectcarne;
  let checkboxMarcado = exoticas || tradicionais || ambas || todos || email || sms;

  if (camposPreenchidos === true && checkboxMarcado === true) {
    botaoValidar.innerHTML = "Enviado";
    botaoValidar.style.color = "green"
  } else {
    botaoValidar.style.color = "red"
    botaoValidar.innerHTML = "Corrigir";
  }
}


botaoValidar.addEventListener("click", validarFormulario);











