package application;

import java.util.Scanner;

public class ProblemaMaisVelho {

	/*
	 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
	 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
	 * vetor. Depois, mostrar na tela o nome da pessoa mais velha.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int quantidadePessoas = sc.nextInt();

		String[] nomes = new String[quantidadePessoas];
		int[] idades = new int[quantidadePessoas];

		for (int i = 0; i < nomes.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dª pessoa:%n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}

		sc.close();

		String pessoaMaisVelha = "";
		int maiorIdade = 0;

		for (int i = 0; i < nomes.length; i++) {

			if (maiorIdade < idades[i]) {
				pessoaMaisVelha = nomes[i];
				maiorIdade = idades[i];
			}

		}

		System.out.println();
		System.out.printf("PESSOA MAIS VELHA: %s, %d anos", pessoaMaisVelha, maiorIdade);

	}

}