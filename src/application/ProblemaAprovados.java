package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAprovados {

	/*
	 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
	 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
	 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
	 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
	 * (seis).
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão informados? ");
		int quantidadeAlunos = sc.nextInt();

		String[] alunos = new String[quantidadeAlunos];
		double[] notaSemestre1 = new double[quantidadeAlunos];
		double[] notaSemestre2 = new double[quantidadeAlunos];

		for (int i = 0; i < alunos.length; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:%n", i + 1);
			alunos[i] = sc.nextLine();
			notaSemestre1[i] = sc.nextDouble();
			notaSemestre2[i] = sc.nextDouble();
		}

		sc.close();

		System.out.println("\nAlunos aprovados:");

		for (int i = 0; i < alunos.length; i++) {

			if ((notaSemestre1[i] + notaSemestre2[i]) / 2 >= 6.0) {
				System.out.println(alunos[i]);
			}

		}
	}

}