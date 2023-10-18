package application;

import java.util.Scanner;

public class ProblemaNumerosPares {

	/*
	 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
	 * seguida, mostre na tela todos os números pares, e também a quantidade de
	 * números pares.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int quantidadeNumeros = sc.nextInt();

		int[] numerosDigitados = new int[quantidadeNumeros];

		for (int i = 0; i < numerosDigitados.length; i++) {
			System.out.print("Digite um número: ");
			numerosDigitados[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NÚMEROS PARES:");

		int quantidadePares = 0;

		for (int i = 0; i < numerosDigitados.length; i++) {
			if (numerosDigitados[i] % 2 == 0) {
				quantidadePares += 1;
				System.out.printf("%d ", numerosDigitados[i]);
			}
		}

		System.out.println("\n");
		System.out.printf("QUANTIDADE DE PARES = %d", quantidadePares);

		sc.close();

	}

}