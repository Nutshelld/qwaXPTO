package model;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private String cpf;// 470.539.618-93
	private String dataNascimento; // 05/03/1996
	private String idade;
	private String vaga;
	private String maiorIdade;

	public Pessoa(String nome, String sobrenome, String cpf, String datanascimento, String idade, String maioridade,
			String vaga) {
		setNome(nome);
		setSobrenome(sobrenome);
		setCpf(cpf);
		setDataNascimento(datanascimento);
		setIdade(idade);
		setMaiorIdade(maioridade);
		setVaga(vaga);

	}
	public Pessoa(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getVaga() {
		return vaga;
	}

	public void setVaga(String vaga) {
		this.vaga = vaga;
	}

	public String getMaiorIdade() {
		return maiorIdade;
	}

	public void setMaiorIdade(String maiorIdade) {
		this.maiorIdade = maiorIdade;
	}

}
