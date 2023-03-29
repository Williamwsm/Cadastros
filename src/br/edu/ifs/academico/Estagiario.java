package br.edu.ifs.academico;

public class Estagiario extends Pessoa {
	
	public Estagiario(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	private String instituicao;
	private String periodoAtual;
	private String cursoEstagiario;
	public String getInstituicao() {
		return instituicao;
	}
	
	public String getPeriodoAtual() {
		return periodoAtual;
	}

	public void setPeriodoAtual(String periodoAtual) {
		this.periodoAtual = periodoAtual;
	}

	public String getCursoEstagiario() {
		return cursoEstagiario;
	}

	public void setCursoEstagiario(String cursoEstagiario) {
		this.cursoEstagiario = cursoEstagiario;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	@Override
	public String toString() {
		return  super.toString()
				+"\n instituicao: " + instituicao 
				+ "\n periodoAtual: " + periodoAtual 
				+ "\n curso: " + cursoEstagiario;
	}

	
}
