package exercicios;

public class Student {
	private String name;
	private double n1, n2, n3;
	Student(String name, double n1, double n2, double n3){
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public void finalGrade() {
		double media = (n1 + n2 + n3)/3;
		double min = 60.0;
		System.out.println("FINAL GRADE = " + media);
		if (media >= min) {
			System.out.println(PassOrFailed.PASS);
		} else {
			System.out.println(PassOrFailed.FAILED);
			System.out.println("MISSING " + (min - media)  + " POINTS");
		}
	}
}
