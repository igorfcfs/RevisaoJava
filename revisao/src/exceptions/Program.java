package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Este index nao eh valido!");
		} catch(InputMismatchException e) {
			System.out.println("Precisa ser um numero");
		} catch(Exception e) {
			System.out.println("Oops, algo deu errado:");
			e.printStackTrace();
		} finally {
			System.out.println("Obrigado!");
			if(sc != null) {
				sc.close();
			}
		}
	}
}
