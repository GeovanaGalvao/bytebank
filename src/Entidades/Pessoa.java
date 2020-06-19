package Entidades;

public abstract class Pessoa {
	//Essa classe é abstrata, pois não quero ter uma instancia do objeto pessoa.

	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}