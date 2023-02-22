package generics_set_map;

import java.util.HashMap;

public class HashMapClass {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();

	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    System.out.println(capitalCities.get("England"));
	    System.out.println(capitalCities.remove("England"));
	    System.out.println(capitalCities);
	    System.out.println(capitalCities.size());
	    
	    System.out.println("\nKeys:");
	    // Print keys
	    for (String i : capitalCities.keySet()) {
	      System.out.println(i);
	    }
	    
	    System.out.println("\nValues:");
	    // Print values
	    for (String i : capitalCities.values()) {
	      System.out.println(i);
	    }
	    
	    System.out.println("\nKeys and values:");
	    // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
	    
	    System.out.println();
	    HashMap<String, Integer> people = new HashMap<String, Integer>();

	    people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Angie", 33);

	    for (String i : people.keySet()) {
	      System.out.println("key: " + i + " value: " + people.get(i));
	    }
	    people.clear();
	    System.out.println(people);
	}
}
