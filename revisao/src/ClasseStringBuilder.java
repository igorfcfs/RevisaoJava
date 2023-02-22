public class ClasseStringBuilder {
	public static void main(String[] args) {
		
		StringBuilder string1 = new StringBuilder();
		StringBuilder string2 = new StringBuilder(50);
		StringBuilder string3 = new StringBuilder("Boson treinamentos");
		System.out.printf("string 1: \"%s\"\n", string1);
		System.out.printf("string 2: \"%s\"\n", string2);
		System.out.printf("string 3: \"%s\"\n", string3);
		
		System.out.println();
		
		StringBuilder string4 = new StringBuilder("Dev Superior");
		System.out.printf("string 4: %s\n", string4.toString());
		System.out.printf("Capacidade: %d\n", string4.capacity());
		System.out.printf("Comprimento: \"%s\"\n", string4.length());
		string4.setLength(15);
		System.out.printf("Novo comprimento: %d%n", string4.length());
		System.out.printf("string 4: %s\n", string4.toString());
	}
}
