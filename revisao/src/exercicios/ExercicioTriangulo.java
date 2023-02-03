package exercicios;
import java.util.*;
public class ExercicioTriangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle A: ");
		double a1 = sc.nextDouble();
		sc.nextLine();
		double b1 = sc.nextDouble();
		sc.nextLine();
		double c1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the measures of triangle B: ");
		double a2 = sc.nextDouble();
		sc.nextLine();
		double b2 = sc.nextDouble();
		sc.nextLine();
		double c2 = sc.nextDouble();
		sc.nextLine();
		
		double areaX = area(a1, b1, c1);
		double areaY = area(a2, b2, c2);
		System.out.println("the x triangle area is: " + areaX);
		System.out.println("the y triangle area is: " + areaY);
		
		if(areaX > areaY) {
			System.out.println("The area of x triangle is larger");
		} else if(areaX < areaY) {
			System.out.println("The area of y triangle is smaller");
		} else {
			System.out.println("The both areas are equal");
		}
		
		sc.close();
	}
	
	public static double area(double a, double b, double c) {
		double p = (a + b + c)/2; 
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
}
