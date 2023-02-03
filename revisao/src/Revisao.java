import java.util.Scanner;

public class Revisao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		String s1 = sc.nextLine(), s2 = sc.nextLine(), s3 = sc.nextLine();
		System.out.println("Valores digitados:");
		System.out.println(x);
		System.out.println(s1 + "\n" + s2 + "\n" + s3);
		sc.close();
	}
}