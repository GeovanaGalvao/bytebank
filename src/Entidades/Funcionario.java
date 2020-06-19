package entidades;

public class Funcionario extends Pessoa{

	protected double salario = 3000.00;
	
	public Funcionario() {}
	
	public double getBonificacao() {
		return this.salario*0.1;
	}

	public double getSalario() {
		return this.salario;
	}
}