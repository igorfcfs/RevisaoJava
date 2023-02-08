package exercicios;

import java.util.Scanner;

public class RetangleExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		double width = sc.nextDouble(), height = sc.nextDouble();
		Rectangle rect = new Rectangle(width, height);
		System.out.println("AREA: " + rect.area());
		System.out.println("PERIMETER: " + rect.perimeter());
		System.out.println("DIAGONAL: " + rect.diagonal());
		
		sc.close();
	}
}
