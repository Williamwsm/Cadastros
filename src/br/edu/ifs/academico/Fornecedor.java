package br.edu.ifs.academico;

public class Fornecedor {
	private int cnpj;
	private String razaoSocial;
	private String cidade;
	public Fornecedor(String razaoSocial) {
		// TODO Auto-generated constructor stub
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return 
				"\n cnpj: " + cnpj
				+ "\n razao Social: " + razaoSocial 
				+ "\n cidade: " + cidade ;
	}

}
