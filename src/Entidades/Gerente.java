package entidades;

public class Gerente extends Funcionario{

	private String senha;
	private int usuario;
	private static int usuarioIncremental = 1;
	
	public Gerente(String senha) {
		super.salario = 5000.00;
		this.senha = senha;
		this.usuario = usuarioIncremental;
		usuarioIncremental++;
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();//Soma o salário com a bonificação padrão do funcionário.
	}
	
	public boolean autentica(String senha) {
		if (this.senha == senha)
			return true;
		return false;
	}
	
	public boolean autentica(String senha, int usuario) {
		if (this.senha == senha && this.usuario == usuario)
			return true;
		return false;
	}

	public int getUsuario() {
		return usuario;
	}
}