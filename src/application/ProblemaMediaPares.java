package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPares {

	/*
	 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
	 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
	 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
	 * "NENHUM NUMERO PAR"
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos terá o vetor? ");
		int tamanho = sc.nextInt();

		int[] numeros = new int[tamanho];

		int somaPares = 0;
		int quantidadePares = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println();

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				somaPares += numeros[i];
				quantidadePares += 1;
			}
		}

		if (quantidadePares > 0) {
			System.out.printf("MÉDIA DOS PARES = %.1f", (double) somaPares / quantidadePares);
		} else {
			System.out.printf("NENHUM NÚMERO PAR");
		}

		sc.close();

	}

}