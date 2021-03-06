package entidades;

import util.*;

public class Gerente extends Funcionario implements Autenticavel{

	private Autenticacao autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticacao();
		super.salario = 5000.00;
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
	
	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);		
	}

	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}
}