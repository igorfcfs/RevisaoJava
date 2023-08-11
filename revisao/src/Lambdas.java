//interface funcional -> possui apenas 1 metodo abstrato
interface Inter {
	void print();
//	void x();
}

interface InterString {
	boolean print(String a, String b);
}

interface Predicate<T>{
	void print(T t);
}

interface PredicateVar<T> {
	void print(T... t);
}

class OverrideInter implements Inter, InterString {
	@Override
	public void print() {
		System.out.println("Print");
	}

	@Override
	public boolean print(String a, String b) {
		return a.equals(b);
	}
}

public class Lambdas {
	void x(String[] values, String x) {}
	public static void main(String[] args) {
		// Forma Padrão
		OverrideInter inter = new OverrideInter();
		inter.print();
		
		System.out.println();
		
		// Forma X
		Inter inter1 = new Inter() {
			@Override
			public void print() {
				System.out.println("Print");
			}

//			@Override
//			public void x() {
//				
//			}
		};
		inter1.print();
		
		System.out.println();
		
		// Forma com Lambda
		Inter inter2 = () -> System.out.println("Print");
		inter2.print();

		InterString s = (String a, String b) -> {
			return a.equals(b);
		};
		InterString s1 = (a, b) -> a.equals(b);
		System.out.println(s.print("A", "A"));
		System.out.println(s1.print("A", "B"));
		
		System.out.println();
		
		// Forma com Lambda e Predicate
		Predicate<String> x = a -> System.out.println(a);
		PredicateVar<Integer> y = a -> {
			for (int el : a) {
				System.out.println(el);
			}
		};
		x.print("Igor");
		y.print(10, 11);
	}
}
