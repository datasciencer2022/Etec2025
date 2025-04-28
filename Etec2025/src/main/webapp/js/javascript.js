function checarNumDocs(){
	var doc2 = document.getElementsByName('doc2[]');
	var cont=0;
	for (var i=0;i<doc2.length;i++){ 
        if (doc2[i].checked == true){
        cont = cont + 1; 
            // CheckBox Marcado... Faça alguma coisa...
        }  
    }
	if (cont >= 2){
		return true;
	}
	else{
		alert('você deve escolher pelo menos 2 documentos em doc2');
		return false;
	}
}

function validarCliente(strTemp){
	if (hasLetter(strTemp)){
		alert('CPF tem letras');
		return false;
	}
	else if (!isValidCPF(strTemp)){
		alert('CPF inválido');
		return false;
	}
	else {
		return true;
		}
}

function hasLetter(str) {
	  return /[a-zA-Z]/.test(str);
	}
	
	function isValidCPF(strTemp) {
		
		
		var strCPF = strTemp.toString().replace(/\.|-/gm,'');
		
	    var Soma;
	    var Resto;
	    Soma = 0;
	  if (strCPF == "00000000000" ||
            strCPF == "11111111111" ||
            strCPF == "22222222222" || strCPF == "33333333333" ||
            strCPF == "44444444444" || strCPF == "55555555555" ||
            strCPF == "66666666666" || strCPF == "77777777777" ||
            strCPF == "88888888888" || strCPF == "99999999999") return false;
	
	  for (i=1; i<=9; i++) Soma = Soma + parseInt(strCPF.substring(i-1, i)) * (11 - i);
	  Resto = (Soma * 10) % 11;
	
	    if ((Resto == 10) || (Resto == 11))  Resto = 0;
	    if (Resto != parseInt(strCPF.substring(9, 10)) ) return false;
	
	  Soma = 0;
	    for (i = 1; i <= 10; i++) Soma = Soma + parseInt(strCPF.substring(i-1, i)) * (12 - i);
	    Resto = (Soma * 10) % 11;
	
	    if ((Resto == 10) || (Resto == 11))  Resto = 0;
	    if (Resto != parseInt(strCPF.substring(10, 11) ) ) return false;
	    return true;
	}