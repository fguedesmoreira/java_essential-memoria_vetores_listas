package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDadosPessoas {

	/*
	 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
	 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
	 * média de altura das mulheres, e o número de homens.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int quantidade = sc.nextInt();

		double[] alturas = new double[quantidade];
		char[] generos = new char[quantidade];

		for (int i = 0; i < alturas.length; i++) {
			System.out.printf("Altura da %dª pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Gênero da %dª pessoa: ", i + 1);
			generos[i] = sc.next().charAt(0);
		}

		double menorAltura = 999.9;
		double maiorAltura = 0.0;

		double somaAlturaMulheres = 0.0;
		int quantidadeMulheres = 0;

		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			} else if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}

			if (generos[i] == 'F' || generos[i] == 'f') {
				somaAlturaMulheres += alturas[i];
				quantidadeMulheres += 1;
			}
		}

		System.out.println();
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", somaAlturaMulheres / quantidadeMulheres);
		System.out.printf("Número de homens = %d", alturas.length - quantidadeMulheres);

		sc.close();

	}

}