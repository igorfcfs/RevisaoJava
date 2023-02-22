package generics_set_map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PrintService<T> {
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public void print(T tipo) {
		System.out.println(tipo);
	}
	
	public void values(){
		for(T x : list) {
			System.out.println(x);
		}
	}
	@Override
	public String toString() {
		return "PS: " + list;
	}
}

public class Generics {
	public static void main(String[] args) {
		PrintService<Integer> ps1 = new PrintService<>();
		ps1.addValue(2);
		ps1.addValue(3);
		ps1.addValue(4);
		ps1.print(2);
		ps1.values();
		System.out.println(ps1);
		
		PrintService<String> ps2 = new PrintService<>();
		ps2.addValue("Igor");
		ps2.addValue("Karina");
		ps2.addValue("Felipe");
		ps2.print("Jorge");
		ps2.values();
		System.out.println(ps2);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	}
}
