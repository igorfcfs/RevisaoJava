package Matematica;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Deseja a tabuada para qual valor? ");
		int x = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i <= 10; i++) {
			System.out.println(x + " x " + i + " = " + x*i);
		}
		System.out.println("Obrigado!");
		sc.close();
	}
}