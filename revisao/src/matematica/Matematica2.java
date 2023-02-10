package matematica;
import java.util.*;

public class Matematica2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos Argumentos? ");
		int argumentos = sc.nextInt();
		sc.nextLine();
		System.out.println("Valores: ");
		int x[] = new int[argumentos];
		for(int i = 0; i < x.length; i++) {		
			x[i] = sc.nextInt();
		}
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
			System.out.println(soma(x));
			break;
//		case "subtracao":
//			System.out.println(subtracao(x));
//			break;
//		case "multiplicacao":
//			System.out.println(multiplicacao(x));
//			break;
//		case "divisao":
//			System.out.println(divisao(x));
//			break;
//		case "todas":
//			System.out.println(todas(x));
//		default: 
//			System.out.println("Voce nao digitou nenhuma operacao valida!");
		}
		
		sc.close();
	}
	
	public static int soma(int args[]) {
		int x = 0;
		for(int i = 0; i < args.length; i++) {
			x += args[i];
		}
		return x;
	}
//	public static int subtracao(int args[]) {
//		int x = 0;
//		for(int i = 0; i < args.length; i++) {
//			x += args[i];
//			if(args[i] == ?) {
//				x -= args[i];
//			}
//		}
//		return x;
//	}
//	public static double multiplicacao(int args[]) {
//		int x = 0;
//		for(int i = 0; i < args.length; i++) {
//			x *= args[i];
//		}
//		return (double)x;
//	}
//	public static double divisao(int args[]) {
//		int x = 0;
//		for(int i = 0; i < args.length; i++) {
//			x /= args[i];
//		}
//		return (double)x;
//	}
	public static String todas(int args[]) {
		return "Soma: " + soma(args);
//		+ "\nSubtracao: " + subtracao(args) 
//		+ "\nMultiplicacao: " + multiplicacao(args) 
//		+ "\nDivisao: " + divisao(args);
	}
}