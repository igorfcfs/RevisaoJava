package arrays;

import java.util.Locale;
import java.util.Scanner;

public class VectProgram2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product[] p = new Product[sc.nextInt()];
		double totalPrice = 0;
		for(int i = 0; i < p.length; i++) {
			String name = sc.nextLine();
			sc.next();
			double price = sc.nextDouble();
			p[i] = new Product(name, price);
			totalPrice += p[i].getPrice();
		}
		double avarage = totalPrice/p.length;
		System.out.println("AVARAGE PRICE: " + avarage);
		
		sc.close();
	}
}
