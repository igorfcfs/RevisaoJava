package arrays;

import java.util.LinkedList;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    System.out.println();
	    
	    cars.addFirst("Chevrolet");
	    cars.addLast("Ferrari");
	    System.out.println(cars);
	}
}
