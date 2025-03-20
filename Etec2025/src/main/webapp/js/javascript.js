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