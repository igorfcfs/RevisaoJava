package generics_set_map;

import java.util.HashSet;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.contains("Mazda"));
	    cars.remove("Volvo");
	    System.out.println(cars.size());
	    for (String i : cars) {
	    	  System.out.println(i);
	    }
	    cars.clear();
	    System.out.println(cars);
	}
}
