package Programa;

import Entidades.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Geovana");
		gerente.setCpf("123.456.789-10");
		System.out.println("Gerente\nNome: " + gerente.getNome() + "\nCPF: " + gerente.getCpf() + 
			"\nSalario: R$" + gerente.getSalario() + "\nAutenticou senha: " + gerente.autenticaSenha("2222"));
	}
}