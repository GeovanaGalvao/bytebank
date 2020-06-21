package programa;

import entidades.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Geovana");
		gerente.setCpf("123.456.789-10");
		System.out.println("Nome: " + gerente.getNome() + "\nCPF: " + gerente.getCpf() + 
			"\nSalario: R$" + gerente.getSalario() + "\nUsuario: " + " senha: " + 
			gerente.autentica("2222")	+ "\nBonificacao: R$" + gerente.getBonificacao() +
			"\n-----------------------");
		
		gerente = new Gerente();
		gerente.setNome("Carol");
		gerente.setCpf("012.345.678-90");
		System.out.println("Nome: " + gerente.getNome() + "\nCPF: " + gerente.getCpf() + 
			"\nSalario: R$" + gerente.getSalario() + "\nBonificacao: R$" + gerente.getBonificacao());	
	}
}