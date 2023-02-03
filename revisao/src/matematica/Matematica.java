package matematica;
import java.util.*;

public class Matematica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeiro valor: ");
		int x = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Segundo valor: ");
		int y = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Qual operacao? ");
		String resposta = sc.nextLine();
		
//		if (resposta == "soma") {
//			System.out.println(soma(x, y));
//		} else if(resposta == "subtracao") {
//			System.out.println(subtracao(x, y));
//		} else if (resposta == "multiplicacao") {
//			System.out.println(multiplicacao(x, y));
//		} else if(resposta == "divisao") {
//			System.out.println(divisao(x, y));
//		} else {
//			System.out.println("Voce nao digitou nenhuma operacao valida!");
//		}
		
		switch(resposta) {
		case "soma":
			System.out.println(soma(x, y));
			break;
		case "subtracao":
			System.out.println(subtracao(x, y));
			break;
		case "multiplicacao":
			System.out.println(multiplicacao(x, y));
			break;
		case "divisao":
			System.out.println(divisao(x, y));
			break;
		case "todas":
			System.out.println(todas(x, y));
//		default: 
//			System.out.println("Voce nao digitou nenhuma operacao valida!");
		}
		
		sc.close();
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static double multiplicacao(int a, int b) {
		return (double)a * b;
	}
	public static double divisao(int a, int b) {
		return (double)a / b;
	}
	public static String todas(int a, int b) {
		return "Soma: " + soma(a, b) 
		+ "\nSubtracao: " + subtracao(a, b) 
		+ "\nMultiplicacao: " + multiplicacao(a, b) 
		+ "\nDivisao: " 
		+ divisao(a, b);
	}
}