package matematica;
import java.util.*;

class Circle{
	private double radius;
//	static double PI = 3.14159;
	Circle(double radius){
		this.radius = radius;
	}
	
	public double circumference() {
		return 2*Math.PI*radius;
	}
	
	public double area() {
//		return PI*(radius*radius);
		return Math.PI*(radius*radius);
	}
}

public class AreaDoCirculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		Circle c = new Circle(radius);
		
		System.out.println("The circumference of this circle is: " + c.circumference());
		System.out.println("The area of this circle is: " + c.area());	
	}
}
