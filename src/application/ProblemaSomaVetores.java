package application;

import java.util.Scanner;

public class ProblemaSomaVetores {

	/*
	 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
	 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
	 * elementos correspondentes de A e B. Imprima o vetor C gerado.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int quantidadeValores = sc.nextInt();

		// Vetor A
		int[] vetorA = new int[quantidadeValores];

		System.out.println("Digite os valores do vetor A:");

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		// Vetor B
		int[] vetorB = new int[quantidadeValores];

		System.out.println("Digite os valores do vetor B:");

		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}

		// Vetor C
		int[] vetorC = new int[quantidadeValores];

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		// Resultado
		System.out.println("VETOR RESULTANTE:");

		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
		
		sc.close();

	}

}