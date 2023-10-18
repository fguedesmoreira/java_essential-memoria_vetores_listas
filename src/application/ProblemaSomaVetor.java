package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {

	/*
	 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
	 * seguida: 
	 * 1. Imprimir todos os elementos do vetor 
	 * 2. Mostrar na tela a soma e a média dos elementos do vetor
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int quantidadeNumeros = sc.nextInt();
		
		double[] numerosReais = new double[quantidadeNumeros];
		
		for (int i = 0; i < numerosReais.length; i++) {
			System.out.print("Digite um número: ");
			numerosReais[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		System.out.println();
		System.out.print("VALORES = ");
		
		for (int i = 0; i < numerosReais.length; i++) {
			System.out.printf(" %.1f ", numerosReais[i]);
			soma += numerosReais[i];
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MÉDIA = %.2f", soma / numerosReais.length);
		
		sc.close();
		
	}

}