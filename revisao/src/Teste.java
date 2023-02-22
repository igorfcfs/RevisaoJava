public class Teste {
	int x = 2;
	public static void main(String[] args) {
		final int x = 2;
//		x = 3;
		int y = 2;
		y = 4;
//		String[] strings = new String[10];
//		strings[1] = "Maria";
		String[] strings = {"Maria", "Joao", "Paulo"};
		for(String s : strings) {
			System.out.println(s);
		}
		System.out.println(strings.length);
		
		isVoid();
		System.out.println(isNotVoid());
		
		Teste teste = new Teste();
		System.out.println(teste.x);
		teste.x = 3;
		System.out.println(teste.x);
	}
	
	public static void isVoid() {
		System.out.println("This method is void");
	}
	public static String isNotVoid() {
		return "This method is not void";
	}
}
