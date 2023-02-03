package Exercicios;
import java.util.Scanner;

class Triangulo2 {
	private double a;
	private double b;
	private double c;
	
	Triangulo2(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area() {
		double p = (a + b + c)/2; 
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
}

public class ExercicioTriangulo3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle A: ");
		double ax = sc.nextDouble();
		double bx = sc.nextDouble();
		double cx = sc.nextDouble();
		System.out.println("Enter the measures of triangle B: ");
		double ay = sc.nextDouble();
		double by = sc.nextDouble();
		double cy = sc.nextDouble();
		
		Triangulo2 x = new Triangulo2(ax, bx, cx);
		Triangulo2 y = new Triangulo2(ay, by, cy);
		
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
