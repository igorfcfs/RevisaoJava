package Exercicios;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

class Pessoa {
	String nome;
	int idade;
	double altura;

	Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
}

public class ExercicioVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Quantas pessoas serao digitadas? ");
		int numeroDePessoasASeremDigitadas = sc.nextInt();
		sc.nextLine();

		Pessoa[] vect = new Pessoa[numeroDePessoasASeremDigitadas];

		for (int i = 0; i < numeroDePessoasASeremDigitadas; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa");

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();

			vect[i] = new Pessoa(nome, idade, altura);
		}
		double soma = 0;
		int menores = 0;
		String[] pessoasMenores = new String[numeroDePessoasASeremDigitadas];
		for (int i = 0; i < numeroDePessoasASeremDigitadas; i++) {
			Pessoa p = vect[i];
			soma += p.altura;
			if (p.idade < 16) {
				menores++;
				pessoasMenores[i] = p.nome;
			}
		}
		double alturaMedia = soma / numeroDePessoasASeremDigitadas;
		System.out.println("Altura media: " + alturaMedia);
		System.out.println(
				"Pessoas com menos de 16 anos: " + (menores * 100)/numeroDePessoasASeremDigitadas + "%");
		for (int i = 0; i < pessoasMenores.length; i++) {
			if (pessoasMenores[i] != null)
				System.out.println(pessoasMenores[i]);
		}
		System.out.println("Fim do programa");

		sc.close();
	}
}
