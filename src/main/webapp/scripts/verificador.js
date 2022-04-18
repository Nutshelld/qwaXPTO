/**
 * verificação de dados
 */
function validar() {
	let nome = frmContratacao.nome.value
	let sobrenome = frmContratacao.sobrenome.value
	let cpf = frmContratacao.cpf.value
	let dataNascimento = frmContratacao.datadenascimento.value
	let idade = frmContratacao.idade.value
	let vaga = frmContratacao.vaga.value
	let maiorIdade = frmContratacao.ÉmaiorDeIdade.value

	if (nome === "" ) {
		alert('O campo nome é obrigatório')
		frmContratacao.nome.focus()
		return false
	}
	else if (sobrenome === "") {
		alert('O campo sobrenome é obrigatório')
		frmContratacao.sobrenome.focus()
		return false
	} else if (cpf === "" ) {
		alert('O campo cpf é obrigatório')
		frmContratacao.cpf.focus()
		return false
	}else if (vaga > 5) {
		alert('O campo vaga não pode ser maior do que 5, escolha numeros de 1 a 5')
		frmContratacao.vaga.focus()
		return false	
	} else if (dataNascimento === "") {
		alert('O campo data é obrigatório')
		frmContratacao.datadenascimento.focus()
		return false
	}
	else if (idade === "") {
		alert('O campo idade é obrigatório')
		frmContratacao.idade.focus()
		return false
	} else if (vaga === "") {
		alert('O campo da vaga que se quer preencher é obrigatório')
		frmContratacao.vaga.focus()
		return false
	}else if( vaga > 5){
		alert('O campo da vaga não pode ser menor do que 5')
	}
	else if (idade > 18) {
		maiorIdade = true;
	} else {
		document.forms["frmContratacao"].submit()
	}
}











/*function validar(){
 let nome = frmContratacao.nome.value
 let sobrenome = frmContratacao.sobrenome.value
 let cpf = frmContratacao.cpf.value
 let dataNascimento = frmContratacao.datadenascimento.value
 let idade = frmContratacao.idade.value
 let maiorIdade = frmContratacao.ÉmaiorDeIdade.value
 let vaga = frmContratacao.vaga.value

 if(nome ===""){
	 alert('O campo nome é obrigatório')
	 frmContratacao.nome.focus()
	 return false
 }
 else if(sobrenome ===""){
	 alert('O campo sobrenome é obrigatório')
	 frmContratacao.sobrenome.focus()
	 return false
 }
 else if(cpf ===""){
	 alert('O campo cpf é obrigatório')
	 frmContratacao.cpf.focus()
	 return false
 }
 else if(dataNascimento ===""){
	 alert('O campo data de nascimento é obrigatório')
	 frmContratacao.datadenascimento.focus()
	 return false
 }
 else if(idade ===""){
	 alert('O campo idade é obrigatório')
	 frmContratacao.idade.focus()
	 return false
 }
 else if(maiorIdade ===""){
	 alert('você deve ser maior de idade ')
	 frmContratacao.ÉmaiorDeIdade.focus()
	 return false
 }
 else if(vaga ===""){
	 alert('O campo da vaga que se quer preencher é obrigatório')
	 frmContratacao.vaga.focus()
	 return false
 }else {
	 document.forms["frmContratacao"].submit()
 }

}*/
