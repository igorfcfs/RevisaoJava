package exercicios;

import java.util.Scanner;

public class EmployeeExe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		System.out.println();
		
		Employee emp = new Employee(name, grossSalary, tax);
		System.out.println("Employee: " + name + ", $" + emp.netSalary());
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		System.out.println("Updated data: " + name + ", $" + emp.increaseSalary(percentage));
		sc.close();
	}
}
