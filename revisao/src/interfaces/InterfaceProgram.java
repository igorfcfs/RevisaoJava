package interfaces;

import java.util.Scanner;
import heranca.Color;

interface Shape {
    abstract double area();
}

abstract class AbstractShape {
	Color color;
}

class Rectangle extends AbstractShape implements Shape {
    double width, height;
    
    Rectangle(Color color, double width, double height){
    	this.color = color;
    	this.width = width;
    	this.height = height;
    }
    
    @Override
    public double area(){
        return width * height;
    }
}

class Circle extends AbstractShape implements Shape {
    double radius;
    
    Circle(Color color, double radius){
    	this.color = color;
    	this.radius = radius;
    }
    
    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
}

public class InterfaceProgram {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Type the width and height of the rectangle: ");
    	double width = sc.nextDouble();
    	double height = sc.nextDouble();
    	System.out.print("Type the radius of the circle: ");
    	double radius = sc.nextDouble();
    	
    	Rectangle rect = new Rectangle(Color.BLUE, width,  height);
        Circle circle = new Circle(Color.RED, radius);
        
        if(rect.width == rect.height) {
        	System.out.printf("Square area: %.2f\nColor: %s\n", rect.area(), rect.color);
        } else {
        	System.out.printf("Rectangle area: %.2f\nColor: %s\n", rect.area(), rect.color);
        }
        System.out.printf("Circle area: %.2f\nColor: %s\n", circle.area(), circle.color);
        
        sc.close();
    }
}
