package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProblemaComerciante {

	/*
	 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele
	 * comercializa. Para isto, mandou digitar um conjunto de N mercadorias, cada
	 * uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um
	 * programa que leia tais dados e determine e escreva quantas mercadorias
	 * proporcionaram:
	 */
	// 1. lucro < 10%
	// 2. 10% ≤ lucro ≤ 20%
	// 3. lucro > 20%

	/*
	 * Determine e escreva também o valor total de compra e de venda de todas as
	 * mercadorias, assim como o lucro total.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Serão informados dados de quantos produtos? ");
		int quantidadeDeProdutos = sc.nextInt();

		Produto[] produtos = new Produto[quantidadeDeProdutos];

		for (int i = 0; i < produtos.length; i++) {
			System.out.printf("Produto %d:%n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Preço de compra: R$ ");
			double precoDeCompra = sc.nextDouble();
			System.out.print("Preço de venda: R$ ");
			double precoDeVenda = sc.nextDouble();

			produtos[i] = new Produto(nomeProduto, precoDeCompra, precoDeVenda);
		}

		sc.close();

		int lucroAbaixo10 = 0;
		int lucroEntre10e20 = 0;
		int lucroAcima20 = 0;

		double totalCompra = 0;
		double totalVenda = 0;

		for (int i = 0; i < produtos.length; i++) {

			double percentual = ((produtos[i].getPrecoDeVenda() - produtos[i].getPrecoDeCompra())
					/ produtos[i].getPrecoDeCompra()) * 100;

			if (percentual < 10) {
				lucroAbaixo10 += 1;
			} else if (percentual >= 10 && percentual <= 20) {
				lucroEntre10e20 += 1;
			} else {
				lucroAcima20 += 1;
			}

			totalCompra += produtos[i].getPrecoDeCompra();
			totalVenda += produtos[i].getPrecoDeVenda();

		}

		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Lucro abaixo de 10%%: %d%n", lucroAbaixo10);
		System.out.printf("Lucro entre 10%% e 20%%: %d%n", lucroEntre10e20);
		System.out.printf("Lucro acima de 20%%: %d%n", lucroAcima20);
		System.out.printf("Valor total de compra: R$ %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: R$ %.2f%n", totalVenda);
		System.out.printf("Lucro total: R$ %.2f", totalVenda - totalCompra);
	}

}
