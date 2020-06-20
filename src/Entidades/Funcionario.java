package entidades;

//Como agora essa classe � abstrata, n�o posso mais ter uma instancia de Funcion�rio.
public abstract class Funcionario extends Pessoa{

	protected double salario = 3000.00;
	
	public Funcionario() {}
	
	public abstract double getBonificacao();

	public double getSalario() {
		return this.salario;
	}
}