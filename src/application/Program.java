package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual o preco do dolar? %.2f%n", CurrencyConverter.dolar);
		System.out.printf("Quantos dolare serão comprados? %.2f%n", CurrencyConverter.dolarConverter);;
		System.out.printf("Valor a ser pago em reais: %.2f%n", CurrencyConverter.dinheiroReal());
		
		sc.close();

	}

}
