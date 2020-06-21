package entidades;

import util.*;

public class Administrador extends Funcionario implements Autenticavel{
	
	private Autenticacao autenticador;
	
	public Administrador() {
		this.autenticador = new Autenticacao();
	}

	@Override
	public double getBonificacao() {
		return super.getSalario()*0.1 + 50.00;
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