package interfaces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
//		return name.compareTo(other.getName());
		return salary.compareTo(other.getSalary());
//		return -salary.compareTo(other.getSalary());
	}
	
	@Override
	public String toString() {
		return name + ", " + salary;
	}
}

public class InterfaceComparable {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
		List<Employee> list = new ArrayList<>();
		String path = "D:\\projetos\\Alura\\RevisaoJava\\revisao\\src\\interfaces\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//			String name = br.readLine();
			String employeeCsv = br.readLine();
//			while (name != null) {
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
//				list.add(name);
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
//				name = br.readLine();
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
//			for (String s : list) {
			for (Employee emp : list) {
				System.out.println(emp);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}