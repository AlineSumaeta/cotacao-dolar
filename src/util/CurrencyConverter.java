package util;

public class CurrencyConverter {
	
	public static double porcentagem = 6.00;
	
	public static double  dolar = 3.10;
	
	public static final double dolarConverter = 200;
	
	public static double dinheiroReal(){
		return dolar * dolarConverter + (porcentagem / 100 * dolar * dolarConverter);
	}

}
