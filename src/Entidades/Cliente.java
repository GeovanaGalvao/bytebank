package entidades;

import util.*;

public class Cliente extends Pessoa implements Autenticavel {

	private String profissao;
	private Autenticacao autenticador;
	
	public Cliente() {
		this.autenticador = new Autenticacao();
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
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