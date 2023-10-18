package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ExercicioList {

	/*
	 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e
	 * salario) de N funcionários. Não deve haver repetição de id.
	 * 
	 * Em seguida, efetuar o aumento de X por cento no salário de um determinado
	 * funcionário. Para isso, o programa deve ler um id e o valor X. Se o id
	 * informado não existir, mostrar uma mensagem e abortar a operação. Ao final,
	 * mostrar a listagem atualizada dos funcionários, conforme exemplos.
	 * 
	 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o
	 * salário possa ser mudado livremente. Um salário só pode ser aumentado com
	 * base em uma operação de aumento por porcentagem dada.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcionários serão registrados? ");
		int quantidadeDeFuncionarios = sc.nextInt();

		List<Funcionario> listaDeFuncionarios = new ArrayList<>();

		for (int i = 0; i < quantidadeDeFuncionarios; i++) {
			System.out.println();
			System.out.printf("Funcionário #%d:%n", i + 1);
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			while (retornaFuncionario(listaDeFuncionarios, id) != null) {
				System.out.print("O ID informado já existe! Por favor, informe um novo: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nomeFuncionario = sc.nextLine();
			System.out.print("Salário: R$ ");
			double salario = sc.nextDouble();

			listaDeFuncionarios.add(new Funcionario(id, nomeFuncionario, salario));
		}

		System.out.println();
		System.out.print("Informe o ID do funcionário que terá o aumento salarial: ");
		int id = sc.nextInt();

		Funcionario funcionario = retornaFuncionario(listaDeFuncionarios, id);

		if (funcionario == null) {
			System.out.printf("O ID informado não existe!%n");
		} else {
			System.out.print("Informe o percentual do aumento: ");
			double percentual = sc.nextDouble();

			funcionario.aplicaAumento(percentual);
		}

		sc.close();

		System.out.println();
		System.out.println("Lista de funcionários:");

		for (Funcionario func : listaDeFuncionarios) {
			System.out.println(func);
		}

	}
	
	private static Funcionario retornaFuncionario(List<Funcionario> lista, int id) {
		
		Funcionario funcionario = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		return funcionario;
		
	}

}