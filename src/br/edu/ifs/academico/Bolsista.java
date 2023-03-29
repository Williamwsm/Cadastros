package br.edu.ifs.academico;

public class Bolsista extends Pessoa{
	public Bolsista(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	private double valorBolsa;
	private String  orientador;
	public double getValorBolsa() {
		return valorBolsa;
	}
	public void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	public String getOrientador() {
		return orientador;
	}
	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}
	@Override
	public String toString() {
		return  super.toString()
				+ "\n valorBolsa: " + valorBolsa 
				+ "\n orientador: " + orientador ;
				
	}
}
