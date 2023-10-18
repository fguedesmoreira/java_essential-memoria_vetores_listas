package application;

import java.util.Scanner;

public class ProblemaNegativos {

	/*
	 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
	 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
	 * todos os números negativos lidos.
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
		System.out.println("NÚMEROS NEGATIVOS: ");

		for (int i = 0; i < numerosDigitados.length; i++) {
			if (numerosDigitados[i] < 0) {
				System.out.println(numerosDigitados[i]);
			}
		}

		sc.close();

	}

}