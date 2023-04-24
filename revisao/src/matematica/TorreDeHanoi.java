package matematica;

import java.util.Scanner;

public class TorreDeHanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de discos dessa torre: ");
		int n = sc.nextInt();
		
		//Utilizei a f�rmula 2^n - 1
		int numMinTentativas = (int) (Math.pow(2, n) - 1);
		System.out.printf("O n�mero m�nimo de tentativas � %d", numMinTentativas);
		
		sc.close();
	}
}
