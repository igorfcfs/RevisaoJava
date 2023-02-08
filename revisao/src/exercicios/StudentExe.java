package exercicios;

import java.util.Scanner;

public class StudentExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble();
		Student s = new Student(name, n1, n2, n3);
		s.finalGrade();
		
		sc.close();
	}
}
