package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMaiorPosicao {

	/*
	 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
	 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
	 * Mostrar também a posição do maior elemento, considerando a primeira posição
	 * como 0 (zero).
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int quantidadeNumeros = sc.nextInt();

		double[] numerosDigitados = new double[quantidadeNumeros];

		for (int i = 0; i < numerosDigitados.length; i++) {
			System.out.print("Digite um número: ");
			numerosDigitados[i] = sc.nextDouble();
		}

		double maiorNumero = 0.0;
		int posicaoMaiorNumero = 0;

		for (int i = 0; i < numerosDigitados.length; i++) {
			if (maiorNumero < numerosDigitados[i]) {
				maiorNumero = numerosDigitados[i];
				posicaoMaiorNumero = i;
			}
		}

		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maiorNumero);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", posicaoMaiorNumero);

		sc.close();

	}

}