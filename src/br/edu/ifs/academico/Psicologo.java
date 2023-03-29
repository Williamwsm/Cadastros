package br.edu.ifs.academico;

public class Psicologo extends Pessoa {
	
	
	public Psicologo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	private String numeroDoConselho;
	private int cargaHoraria;

	public String getNumeroDoConselho() {
		return numeroDoConselho;
	}

	public void setNumeroDoConselho(String numeroDoConselho) {
		this.numeroDoConselho = numeroDoConselho;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	} 
	@Override
	public String toString() {
		return super.toString()
				+ "\n numeroDoConselho: " + numeroDoConselho 
				+ "\n cargaHoraria: " + cargaHoraria;
	}
	


	

}
