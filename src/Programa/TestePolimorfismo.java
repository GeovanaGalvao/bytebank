package programa;

import entidades.*;
import util.ControleBonificacao;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Marcela");
		funcionario.setCpf("098.765.432-10");
		ControleBonificacao.registra(funcionario);
		System.out.println("Bonificação total: " + ControleBonificacao.getSomaBonificacoes() +
				"\n-------------------------");
		
		Funcionario gerente = new Gerente("0123");
		gerente.setNome("Marcela");
		gerente.setCpf("098.765.432-10");
		ControleBonificacao.registra(gerente);		
		System.out.println("Bonificação total: " + ControleBonificacao.getSomaBonificacoes() +
				"\n-------------------------");
		
		Funcionario editorDeVideo = new EditorDeVideo();
		editorDeVideo.setNome("Marcela");
		editorDeVideo.setCpf("098.765.432-10");
		ControleBonificacao.registra(editorDeVideo);		
		System.out.println("Bonificação total: " + ControleBonificacao.getSomaBonificacoes() +
				"\n-------------------------");
		
		Funcionario designer = new Designer();
		designer.setNome("Marcela");
		designer.setCpf("098.765.432-10");
		ControleBonificacao.registra(designer);		
		System.out.println("Bonificação total: " + ControleBonificacao.getSomaBonificacoes());
	}
}