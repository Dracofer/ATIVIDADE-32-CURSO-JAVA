package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double quantity = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");

		int n = sc.nextInt();
		Double[] vect = new Double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println("");

		System.out.println("NUMEROS PARES:");

		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%.0f ", vect[i]);
				quantity = quantity + 1;
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.printf("QUANTIDADE DE PARES = %.0f%n", quantity);

		sc.close();
	}

}
