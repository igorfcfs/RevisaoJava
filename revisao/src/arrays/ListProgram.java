package arrays;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		for(int x : list) {
			System.out.println(x);
		}
		System.out.println(list.size());
		
		List<String> list2 = new ArrayList<>();
		list2.add("Igor");
		list2.add("Felipe");
		list2.add("Jorge");
		list2.add("Karina");
		list2.add(2, "Joao");
		list2.add("Marco");
		for(String x : list2) {
			System.out.println(x);
		}
		
		System.out.println();
		
		list2.remove(2);
		list2.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list2) {
			System.out.println(x);
		}
	}
}
