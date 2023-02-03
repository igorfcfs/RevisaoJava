package matematica;
import java.util.*;

public class EquacaoDoSegundoGrau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.print("b: ");
		double b = sc.nextDouble();
		sc.nextLine();
		System.out.print("c: ");
		double c = sc.nextDouble();
		sc.nextLine();
		double delta = Math.pow(b, 2.0) - 4*a*c;
		double x1 = (-b + Math.sqrt(delta)) / 2*a;
		double x2 = (-b - Math.sqrt(delta)) / 2*a;
		if(delta == Math.abs(delta)) {
			System.out.println("As raizes desta equacao sao: " + x1 + " " + x2);
		} else {
			System.out.println("Esta equacao nao possui raizes reais");
		}
		sc.close();
	}
}
