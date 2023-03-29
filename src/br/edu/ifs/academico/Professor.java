package br.edu.ifs.academico;
import br.edu.ifs.util.CalculosSalariais;

public class Professor extends Pessoa {
	
	public String lerDadosAbertos() {
		return super.lerDadosAbertos()
				+"Formação: "+ formacao;
		
	}
	
	public Professor(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public double calcularDecimoTerceiro() {
		double calcularDecimoTerceiro = getSalarioBolsa();
		return calcularDecimoTerceiro;
	}

	@Override
	public String toString() {
		return 
				super.toString()
				+ "\n formacao: " + formacao 
				+ "\n salario liquido: " + CalculosSalariais.calcularSalarioLiquidoProfessor(getSalarioBolsa());
			
	}
	

}
