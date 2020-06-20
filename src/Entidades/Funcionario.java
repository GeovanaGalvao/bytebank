package entidades;

//Como agora essa classe é abstrata, não posso mais ter uma instancia de Funcionário.
public abstract class Funcionario extends Pessoa{

	protected double salario = 3000.00;
	
	public Funcionario() {}
	
	public abstract double getBonificacao();

	public double getSalario() {
		return this.salario;
	}
}