package util;

import entidades.Funcionario;

public class ControleBonificacao {

	private static double somaBonificacoes;
	
	public static void registra(Funcionario funcionario) {
		somaBonificacoes = getSomaBonificacoes() + funcionario.getBonificacao();
	}

	public static double getSomaBonificacoes() {
		return somaBonificacoes;
	}
}