package util;

public interface Autenticavel {
	
	void setSenha(String senha);
	
	boolean autentica(String senha);
}