import java.util.ArrayList;
public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
//		list.add("ola");
		for(int el : list) {
			System.out.println(el);
		}
	}
}
