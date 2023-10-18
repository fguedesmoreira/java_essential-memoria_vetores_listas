package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class ProblemaAlturas {

	/*
	 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
	 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
	 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
	 * pessoas caso houver.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão informadas? ");
		int quantidadePessoas = sc.nextInt();

		Pessoa[] vetorPessoas = new Pessoa[quantidadePessoas];

		double somaAlturas = 0.0;

		for (int i = 0; i < vetorPessoas.length; i++) {

			sc.nextLine();
			System.out.printf("Dados da %dª pessoa:%n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vetorPessoas[i] = new Pessoa(nome, idade, altura);
			somaAlturas += vetorPessoas[i].getAltura();

		}

		System.out.println();
		System.out.printf("Altura média: %.2f%n", somaAlturas / vetorPessoas.length);

		int quantidadePessoasMenores16Anos = 0;
		String nomePessoasMenores16Anos = "";

		for (int i = 0; i < vetorPessoas.length; i++) {
			if (vetorPessoas[i].getIdade() < 16) {
				nomePessoasMenores16Anos += "\n" + vetorPessoas[i].getNome();
				quantidadePessoasMenores16Anos += 1;
			}
		}

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%",
				((double) quantidadePessoasMenores16Anos / vetorPessoas.length) * 100);
		System.out.println(nomePessoasMenores16Anos);

		sc.close();

	}

}