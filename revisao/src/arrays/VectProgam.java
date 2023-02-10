package arrays;

import java.util.Locale;
import java.util.Scanner;

public class VectProgam {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double[] vect = new double[x];
		double totalHeight = 0;
		for(int i = 0; i < x; i++) {
			double d = sc.nextDouble();
			vect[i] = d;
			totalHeight += vect[i];
		}
		double avarageHeight = totalHeight/x;
		System.out.println("AVARAGE HEIGHT: " + avarageHeight);
		
		sc.close();
	}
}
