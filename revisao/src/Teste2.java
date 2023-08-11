class Student {
	String name;

	Student(String name) {
		this.name = name;
	}
}

public class Teste2 {
	public static void main(String[] args) {
		Student s1 = new Student("Alice");
		Student s2 = new Student("Bob");
		Student s3 = new Student("Carol");
		s1 = s3;
		s3 = s2;
		s2 = null;
		System.out.println(s1.name); //Carol
//		System.out.println(s2.name); //null
		System.out.println(s3.name); //Bob
		System.out.println("acbbcc".replace('a', 'z'));
		System.out.println("acbbcc".replace("ac", "zz"));
		
		Shape shape1 = null;
		Square square1 = null;
		
		shape1 = (Square) new Square();
	}
}
class Shape {}
class Square extends Shape {}



