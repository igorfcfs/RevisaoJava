package exercicios;
import java.util.Scanner;

class Triangulo {
	double a;
	double b;
	double c;
	
	public double area() {
		double p = (a + b + c)/2; 
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
}

public class ExercicioTriangulo2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Enter the measures of triangle A: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle B: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("the x triangle area is: " + x.area());
		System.out.println("the y triangle area is: " + y.area());
		
		if(areaX > areaY) {
			System.out.println("The area of x triangle is larger");
		} else if(areaX < areaY) {
			System.out.println("The area of y triangle is smaller");
		} else {
			System.out.println("The both areas are equal");
		}
		sc.close();
	}
}
