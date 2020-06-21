package util;

public abstract class CalculadorDeImposto{

	private static double totalImposto;
	
	public static void registraTributavel(Tributavel tributavel) {
		totalImposto += tributavel.getValorImposto();
	}
	
	public static double getTotalImposto() {
		return totalImposto;
	}
}