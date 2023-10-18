package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAbaixoDaMedia {

	/*
	 * Fazer um programa para ler um número inteiro N e depois um vetor de N números
	 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
	 * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
	 * abaixo da média, com uma casa decimal cada.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos terá o vetor? ");
		int tamanho = sc.nextInt();

		double[] numerosReais = new double[tamanho];

		double soma = 0;

		for (int i = 0; i < numerosReais.length; i++) {
			System.out.print("Digite um número: ");
			numerosReais[i] = sc.nextDouble();
			soma += numerosReais[i];
		}

		double media = soma / numerosReais.length;

		System.out.println();
		System.out.printf("MÉDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");

		for (int i = 0; i < numerosReais.length; i++) {
			if (numerosReais[i] < media) {
				System.out.printf("%.1f%n", numerosReais[i]);
			}
		}

		sc.close();

	}

}