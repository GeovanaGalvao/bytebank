package entidades;

public class EditorDeVideo extends Funcionario{

	@Override
	public double getBonificacao() {
		return super.getSalario()*0.1 + 100.00;
	}
}