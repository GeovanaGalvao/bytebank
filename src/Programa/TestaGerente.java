package programa;

import entidades.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("2222");
		gerente.setNome("Geovana");
		gerente.setCpf("123.456.789-10");
		System.out.println("Nome: " + gerente.getNome() + "\nCPF: " + gerente.getCpf() + 
			"\nSalario: R$" + gerente.getSalario() + "\nUsuario: " + gerente.getUsuario() +	"\nAutenticou"
			+ " senha: " + gerente.autentica("2222")	+ "\nBonificacao: R$" + gerente.getBonificacao() +
			"\n-----------------------");
		
		gerente = new Gerente("3333");
		gerente.setNome("Carol");
		gerente.setCpf("012.345.678-90");
		System.out.println("Nome: " + gerente.getNome() + "\nCPF: " + gerente.getCpf() + 
			"\nSalario: R$" + gerente.getSalario() + "\nUsuario: " + gerente.getUsuario() +	"\nAutenticou"
			+ " senha e usuario: " + gerente.autentica("2222",2)	+ "\nBonificacao: R$" + gerente.getBonificacao());
	}
}