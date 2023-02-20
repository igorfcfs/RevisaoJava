package enums;

import java.util.Locale;

enum Cores{
	VERMELHO, VERDE, AZUL;
}

class Carro {

	private String marca;
	private double preco;
	private Cores cor;

	Carro() {
	}

	Carro(String marca, double preco, Cores cor) {
		this.marca = marca;
		this.preco = preco;
		this.cor = cor;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Marca: " + marca + "\n");
		sb.append("Preco: " + preco + "\n");
		sb.append("Cor: " + cor + "\n");
		return sb.toString();
	}
}

public class StringBuilderTest {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Carro carro = new Carro("Chevrolet", 64000, Cores.VERMELHO);
		System.out.println(carro);
	}
}
