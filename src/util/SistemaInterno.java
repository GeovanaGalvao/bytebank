package util;

public abstract class SistemaInterno {
	
	private static String senha = "2222";

	public static void autentica(Autenticavel usuario) {
		if(usuario.autentica(senha))
			System.out.println("Bem vindo ao sistema!");
		else
			System.out.println("Acesso n�o autorizado! Credenciais incorretas.");		
	}
}