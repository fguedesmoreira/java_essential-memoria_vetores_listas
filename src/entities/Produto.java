package entities;

public class Produto {

	private String nome;
	private double precoDeCompra;
	private double precoDeVenda;

	public Produto(String nome, double precoDeCompra, double precoDeVenda) {
		this.nome = nome;
		this.precoDeCompra = precoDeCompra;
		this.precoDeVenda = precoDeVenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoDeCompra() {
		return precoDeCompra;
	}

	public void setPrecoDeCompra(double precoDeCompra) {
		this.precoDeCompra = precoDeCompra;
	}

	public double getPrecoDeVenda() {
		return precoDeVenda;
	}

	public void setPrecoDeVenda(double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}

}