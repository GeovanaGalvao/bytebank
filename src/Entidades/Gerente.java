package Entidades;

public class Gerente extends Funcionario{

	private String senha;
	
	public Gerente() {
		salario = 5000.00;
		senha = "0000";
	}
	
	public double getBonificacao() {
		return salario;
	}
	
	public boolean autenticaSenha(String senha) {
		if (this.senha == senha)
			return true;
		return false;
	}
}