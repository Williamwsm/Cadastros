package br.edu.ifs.academico;


public class Pessoa {
		
	
	public String lerDadosAbertos(){
		return "Nome: "+ nome
				+"DataNascimento: "+ dataNascimento;
	}
	
	public Pessoa(String nome) {
		this.setNome(nome);
		
		
	}
	

	private String nome;
	private char sexo;
	private String localNascimento;
	private String dataNascimento; 
	private double salarioBolsa;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getLocalNascimento() {
		return localNascimento;
	}
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getSalarioBolsa() {
		return salarioBolsa;
	}

	public void setSalarioBolsa(double salarioBolsa) {
		this.salarioBolsa = salarioBolsa;
	}
	
	public double calcularDecimoTerceiro() {
		double calcularDecimoTerceiro = salarioBolsa / 3;
		return calcularDecimoTerceiro;
	}
	
	@Override
	public String toString() {
		return "\n Nome: " + nome 
				+ "\n sexo: " + sexo 
				+ "\n localNascimento: " + localNascimento 
				+ "\n dataNascimento: "+ dataNascimento 
				+ "\n Salário/Bolsa = " + salarioBolsa 
				+ "\n Décimo terceiro = " + calcularDecimoTerceiro(); 
		
	}

	
	
	
	
	

}
