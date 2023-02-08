package exercicios;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	Employee(String name, double grossSalary, double tax){
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public double increaseSalary(double percentage) {
		double x = grossSalary/100 * percentage;
		return netSalary() + x;
	}
}
