package object_oriented_approach_2;

/*public class Teste {
    public static void main(String [] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(subtext(str, 3, 8)); //Line n1
    }
    
    private static String subtext(String s, int a, int b) {
    	return null;
    }
    //Sobrecarga -> Overload
    private static int[] subtext(int a, int b, int c) {
    	int[] a1 = {1, 2, 3};
    	return a1;
    }
//    private static int[] subtext1(String s, int a, int b) {
//    	return null;
//    }
//    private static String[] subtext2(String s, int a, int b) {
//    	return null;
//    }
}*/

//6
/*class Square {
    int length;
    Square sq;
    
    Square(int length) {
        this.length = length;
    }
    
    void setInner(Square sq) {
        this.sq = sq;
    }
    
    int getLength() {
        return this.length;
    }
}

//7
public class Teste {
    public static void main(String[] args) {
        Square sq1 = new Square(10); //Line n1
        Square sq2 = new Square(5); //Line n2
        sq1.setInner(sq2); //Line n3
        System.out.println(sq1.sq.length); //Line n4
    }
}*/

//8
/*public class Teste {
    private static void m(int x) {
        System.out.println("INT VERSION");
    }
    
    private static void m(char x) {
        System.out.println("CHAR VERSION");
    }
    
    public static void main(String [] args) {
        int i = '5';
        m(i);
        m('5');
    }
}*/

//9 ----------------------------------------------------------
/*class Student {
    String name;
    int age;
    
    void Student() {
        Student("James", 25); //Line n1
    }
    
    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 
public class Teste {
    public static void main(String[] args) {
        Student s = new Student(); //Line n2
        System.out.println(s.name + ":" + s.age); //Line n3
    }
}*/

//10
//class Report {
//    public String generateReport() {
//        return "CSV";
//    }
//    
//    public Object generateReport(int i) {
//        return "XLSX";
//    }
//}
// 
//public class Test {
//    public static void main(String[] args) {
//        Report rep = new Report();
//        String csv = rep.generateReport();
//        Object xlsx = rep.generateReport();
//        System.out.println(String.join(":", csv, (String)xlsx));
//    }
//}

//public class Teste {
//    public static void print() {
//        System.out.println("STATIC METHOD!!!");
//    }
//    
//    public static void main(String[] args) {
//        Teste obj = null; //Line n1
//        obj.print(); //Line n2
//    }
//}

//class Point {
//    static int x;
//    int y, z;
//    
//    public String toString() {
//        return "Point(" + x + ", " + y + ", " + z + ")";
//    }
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//        Point p1 = new Point();
//        p1.x = 17;
//        p1.y = 35;
//        p1.z = -1;
//        
//        Point p2 = new Point();
//        p2.x = 19;
//        p2.y = 40;
//        p2.z = 0;
//        
//        System.out.println(p1); //Line n1
//        System.out.println(p2); //Line n2
//    }
//}

//public class Teste {
//    int i1 = 10;
//    static int i2 = 20;
//    
//    private void change1(int val) {
//        i1 = ++val; //Line n1
//        i2 = val++; //Line n2
//    }
//    
//    private static void change2(int val) {
//        i1 = --val; //Line n3
//        i2 = val--; //Line n4
//    }
//    
//    public static void main(String[] args) {
//        change1(5); //Line n5
//        change2(5); //Line n6
//        System.out.println(i1 + i2); //Line n7
//    }
//}

//public class Teste {
//    String msg = null;
//    
//    public Teste() {
//        this("Good Morning!");
//    }
//    
//    public Teste(String str) {
//        msg = str;
//    }
//    
//    public void display() {
//        System.out.println(msg);
//    }
//    
//    public static void main(String [] args) {
//        Teste g1 = new Teste();
//        Teste g2 = new Teste("Good Evening!");
//        g1.display();
//        g2.display();
//    }
//}

//public class Teste {
//    /*static*/ String quote = null;
//    public Teste() {
//    }
//    
//    public Teste(String str) {
//        quote = str;
//    }
//    
//    public void display() {
//        System.out.println(quote);
//    }
//    
//    public static void main(String [] args) {
//        Teste q1 = new Teste();
//        Teste q2 = new Teste("NEVER GIVE UP!");
//        q1.display(); // null | NEVER GIVE UP! <static>
////        q1.display(); // null | NEVER GIVE UP! <static>
//        q2.display(); // NEVER GIVE UP!
//    }
//}

//class Employee {
//    String name;
//    int age;
//    Employee() {
//        Employee("Michael", 22); //Line n1
//    }
//    
//    void Employee(String name, int age) {
//    	this.name = name;
//    	this.age = age;
//    }
//    
//    Employee(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//        Employee emp = new Employee(); 
//        System.out.println(emp.name + ":" + emp.age); //Line n2
//    }
//}

//public class Teste {
//    static int a = 10000;
//    
//    static {
//        a = -a--;
//    }
//    {
//        a = -a++;
//    }
// 
//    public static void main(String[] args) {
//        System.out.println(a);
//    }
//}

//public class Teste {
//    final static StringBuilder sb = new StringBuilder("A");
//    static int x = 2;
//    public static void main(String[] args) {
//        switch (x) {
//            default: 
//                sb.append("B"); //Line n1
//            case 1:
//            case 3: 
//            case 5:
//            case 7:
//            case 9: 
//                sb.append("C"); //Line n2
//                break;
//        }
//        System.out.println(x + ":" + sb.toString()); //Line n3
//    }
//    static {
//        sb.append("Z");
//    }
//    { x += 1; }
//}

//class Super {
//    { System.out.print("A");} //step 7
//    Super(String str) { //step6
//        System.out.print(str); //step 9
//    }
//    static {
//        System.out.print("1"); //step1
//    }
//    { System.out.print("B");} //step 8
//}
// 
//class Sub extends Super {
//    static { System.out.print("2"); } // step 2
//    Sub(String str) {
//        super(str); // step 5
//        System.out.print(str); //step 11
//    }
//    { System.out.print("C"); } //step 10
//    static {
//        System.out.print("3"); // step 3
//    }
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//        new Sub("Z"); // step 4
//    }
//}


//public class Teste {
////    public static void main(String[] args) {
////        double price = 90000;
////        String model;
////        if(price > 100000) {
////            model = "Tesla Model X";
////        } else if(price <= 100000) {
////            model = "Tesla Model S";
////        }
////        System.out.println(model);
////    }
//    static String str = "KEEP IT "; //Line n1
//    public static void main(String[] args) {
//        String str = Teste.str + "SIMPLE"; //Line n2
//        System.out.println(str);
//    }
//}

//class Parent {
//    int i = 10;
//    Parent(int i) {
//        super();
//        this.i = i;
//    }
//}
// 
//class Child extends Parent {
//    int j = 20;
//    
//    Child(int j) {
//        super(0);
//        this.j = j;
//    }
//    
//    Child(int i, int j) {
//    	super(i);
////    	this(j);
//    }
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//        Child child = new Child(1000, 2000);
//        System.out.println(child.i + ":" + child.j);
//    }
//}

//class Base {
//    protected void m1() {
//        System.out.println("Base: m1()");
//    }
//}
// 
//class Derived extends Base {
//    void m1() {
//        System.out.println("Derived: m1()");
//    }
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//        Base b = new Derived();
//        b.m1();
//    }
//}

//abstract class A{
//	public abstract Object m();
//}
//
//class B extends A {
//
//	@Override
//	public Integer m() {
//		return 0;
//	}
//	
//}

//class M { }
//class N extends M { }
//class O extends N { }
//class P extends O { }
// 
//public class Teste {
//    public static void main(String args []) {
//        M obj = new O();
//        if(obj instanceof M) 
//          System.out.print("M");
//        if(obj instanceof N) 
//          System.out.print("N");
//        if(obj instanceof O) 
//          System.out.print("O");
//        if(obj instanceof P) 
//          System.out.print("P");
//    }
//}

//class A {
//    public void print() {
//        System.out.println("A");
//    }
//}
//
//class B extends A {
//    public void print() {
//        System.out.println("B");
//    }
//}
//
// 
//class C extends A {
//    public void print() {
//        System.out.println("C");
//    }
//}
//
// 
//public class Teste {
//    public static void main(String[] args) {
//        A obj1 = new C();
//        A obj2 = new B();
//        C obj3 = (C)obj1;
////        C obj4 = (C)obj2;
//        A obj5 = (C)obj2;
//        obj3.print();
//    }
//}

//class Super {
//    public String num = "10"; //Line n1
//}
// 
//class Sub extends Super {
//    public int num = 20; //Line n2
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//    	Super obj = null;
//    	Sub obj1 = (Sub)obj;
//        System.out.println(obj1.num += 2); //Line n3
//    }
//}

//class Paper {
//    static String getType() { //Line n1
//        return "GENERIC";
//    }
//}
// 
//class RuledPaper extends Paper {
//    static String getType() { //Line n2
//        return "RULED";
//    }
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//        Paper paper = new RuledPaper(); //Line n3
//        System.out.println(paper.getType()); //Line n4
//    }
//}


//class M {
//    public void main(String[] args) { //Line n1
//        System.out.println("M");
//    }
//}
// 
//class N extends M {
//    public static void main(String[] args) { //Line n2
//        new M().main(args); //Line n3
//    }
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//        N.main(args); //Line n4
//    }
//}


//class Parent {
//    String quote = "MONEY DOESN'T GROW ON TREES";
//}
// 
//class Child extends Parent {
//    String quote = "LIVE LIFE KING SIZE";
//}
// 
//class GrandChild extends Child {
//    String quote = "PLAY PLAY PLAY";
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//        GrandChild gc = new GrandChild();
//        Parent gc1 = new GrandChild();
//        System.out.println(gc.quote);
//        System.out.println(((GrandChild)gc1).quote);
//        System.out.println(((Parent)gc).quote);
//        System.out.println(((Parent)(Child)gc).quote);
//    }
//}




//class X {
//    void greet() {
//        System.out.println("Good Morning!");
//    }
//}
// 
//class Y extends X {
//    void greet() {
//        System.out.println("Good Afternoon!");
//    }
//}
// 
//class Z extends Y {
//    void greet() {
//        System.out.println("Good Night!");
//    }
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//        Z x = new Z();
//        x.greet(); //Line n1
//        ((Y)x).greet(); //Line n2
//        ((Z)x).greet(); //Line n3
//    }
//}

//class Base {
//    int id = 1000; //Line n1
// 
//    Base() {
//        Base(); //Line n2
//    }
// 
//    void Base() { //Line n3
//        System.out.println(++id); //Line n4
//    }
//}
// 
//class Derived extends Base {
//    int id = 2000; //Line n5
// 
//    Derived() {} //Line n6
// 
//    void Base() { //Line n7
//        System.out.println(--id); //Line n8
//    }
//}
// 
//public class Teste {
//    public static void main(String[] args) {
//        Base base = new Derived(); //Line n9
//    }
//}


public class Teste {
    private static String print(String... args) {
        return String.join("-", args); //Line n1
    }
    
    private static Object print(Object... args) {
        String str = "";
        for(Object obj : args) {
            if(obj instanceof String) { //Line n2
                str += (String) obj; //Line n3
            }
        }
        return str; //Line n4
    }
    
    public static void main(String... args) {
        Object obj1 = new String("SPORT"); //Line n5
        Object obj2 = new String("MAD"); //Line n6
        System.out.println(print(obj1, obj2)); //Line n7
    }
}
