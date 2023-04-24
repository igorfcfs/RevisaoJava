package object_oriented_approach_3_exception_handling;
//
//interface Profitable1 {
//	/*public abstract*/void x(); // padrão de uma interface
//	/*public*/ default double profit() { //o modificador default me permite declará-lo, não sou obrigado a implementá-lo
//        return 12.5;
//    }
//	/*public*/ static double y() { //não tenho obrigação de implementá-lo e posso declará-lo usando o modificador static
//		return 0;
//	}
//}
// 
//interface Profitable2 {
//    default double profit() {
//        return 25.5;
//    }
//}
//
//public class Test implements Profitable1, Profitable2 {
//
//	@Override
//	public double profit() {
//		return Profitable1.super.profit();
//	}
//
//	@Override
//	public void x() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//
//abstract class A implements Profitable1{
//	
//}


//interface Perishable1 {
//    default int maxDays() {
//        return 1;
//    }
//}
// 
//interface Perishable2 extends Perishable1 {
//    default int maxDays() {
//        return 2;
//    }
//}
// 
//class Milk implements Perishable2, Perishable1 {}
// 
//public class Test {
//    public static void main(String[] args) {
//        Perishable1 obj = new Milk();
//        System.out.println(obj.maxDays());
//    }
//}




//interface Moveable {
//    void move();
//}
//
//
// 
//abstract class Animal {
//    void move() {
//        System.out.println("ANIMAL MOVING");
//    }
//}
//
//
// 
//class Dog extends Animal implements Moveable {}
//}
//
//
////Test.java
// 
//public class Test {
//    public static void main(String[] args) {
//        Moveable moveable = new Dog();
//        moveable.move();
//    }
//}





//interface M {
//    public static void log() {
//        System.out.println("M");
//    }
//}
// 
//abstract class A {
//    public static void log() { 
//        System.out.println("N");
//    }
//}
// 
//class MyClass extends A implements M {}
// 
//public class Test {
//    public static void main(String[] args) {
//        M obj1 = new MyClass();
//        obj1.log(); //Line n1
//        
//        A obj2 = new MyClass();
//        obj2.log(); //Line n2
//        
//        MyClass obj3 = new MyClass();
//        obj3.log(); //Line n3
//    }
//}






//interface ILog {
//    default void log() {
//        System.out.println("ILog");
//    }
//}
// 
//abstract class Log {
//    public static void log() { 
//        System.out.println("Log");
//    }
//}
// 
//class MyLogger extends Log implements ILog {}





//interface Rideable {
//    void ride(String name);
//}
// 
//class Animal {}
// 
//class Horse extends Animal implements Rideable {
//    public void ride(String name) {
//        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
//    }
//}
// 
//public class Test {
//    public static void main(String[] args) {
//        Animal horse = new Horse();
//        /*((Subclasse/Interface)objeto).metodo(<parâmetros>)*/
//        ((Horse)horse).ride("Emma");
//        ((Rideable)horse).ride("Emma");
//        ((Horse)(Rideable)horse).ride("Emma");
//        ((Rideable)(Horse)horse).ride("Emma");
//    }
//}


//interface X1 {
//    default void print() {
//        System.out.println("X1");
//    }
//}
// 
//interface X2 extends X1 {
//    void print();
//}
// 
//interface X3 extends X2 {
//    default void print() {
//        System.out.println("X3");
//    }
//}
// 
//class X implements X3 {}
// 
//public class Test {
//    public static void main(String[] args) {
//        X1 obj = new X();
//        obj.print();
//    }
//}


//Questão x *
//class A {
//	int a = 0;
//	public void x() {
//		System.out.println("A" + a);
//	}
//}
//class B extends A {
//	int a = 2;
//	public void x() {
//		System.out.println("B" + a);
//	}
//}
//
//abstract interface X{
//	/*public static final*/ int i = 0;
////	private default void log() {} // error
//	private static void log() {} // not error
//}
//
//public class Test{
//	public static void main(String...strings) {
//		A a = new B();
//		a.x(); //* referencia ao metodo da classe B
//		System.out.println(a.a); //* referencia ao atributo a da classe A
//	}
//}



//interface Sellable {
//    double getPrice();
//    
//    default String symbol() {
//        return "$";
//    }
//}
//
//
////Chair.java
// 
//class Chair implements Sellable {
//    public double getPrice() {
//        return 35;
//    }
//    
//    public String symbol() {
//        return "£";
//    }
//}
//
//
////Test.java
// 
//public class Test {
//    public static void main(String[] args) {
//        Sellable obj = new Chair(); //Line n1
//        System.out.println(obj.symbol() + obj.getPrice()); //Line n2
//    }
//}


//Questão 15
/*interface Flyable {
    static int horizontalDegree() { //Line n1
        return 20;
    }
 
    default void fly() {
        System.out.println("Flying at " + horizontalDegree() + " degrees."); //Line n2
    }
 
    void land();
}


//Aeroplane.java
public class Test implements Flyable {
    public void land() {
        System.out.println("Landing at " + -Flyable.horizontalDegree() + " degrees."); //Line n3
    }
 
    public static void main(String[] args) {
        new Test().fly();
        new Test().land();
    }
}*/





//Questão 16 *
/*interface Super {
    String name = "SUPER"; //Line n1
}



//class extends Class
//class implements Interface
//interface extends Interface
interface Sub extends Super { //Line n2
 
}

public class Test {
    public static void main(String[] args) {
        Sub sub = null; //*
        System.out.println(sub.name); //Line n3 - nao da erro porque e uma interface, se fosse uma classe daria erro porque nao referencia para nenhum objeto
    }
}*/

//Questão 17 *
/*interface I1 {
    int i = 10;
}

 
interface I2 {
    int i = 20;
}


interface I3 extends I1, I2 { //Line n1
 
}

public class Test {
    public static void main(String[] args) {
        System.out.println(I1.i); //Line n2
        System.out.println(I2.i); //Line n3
//        System.out.println(I3.i); //Line n4 - is ambiguous, mais de uma possibilidade de resultado - compilation error
    }
}*/




/*interface Shrinkable {
    public static void shrinkPercentage() {
        System.out.println("80%");
    }
}

//AntMan.java
 
class AntMan implements Shrinkable { }


//Test.java
 
public class Test {
    public static void main(String[] args) {
        AntMan.shrinkPercentage();
    }
}*/






//interface Workable {
//    void work();
//}
//
/////*abstract*/ interface X{}
//abstract class Work implements Workable{
//    public void work() {} //Line n1
//}
//
//@FunctionalInterface
//interface I1 {
////    void print();
//    boolean equals();
//}


/*public class Test {
    enum Directions {
        NORTH("N"), SOUTH("S"), EAST("E"), WEST("W");
 
        private String notation;
 
        Directions(String notation) {
            this.notation = notation;
        }
 
        public String getNotation() {
            return notation;
        }
    }
 
    public static void main(String[] args) {
        System.out.println(Test.Directions.NORTH.getNotation());
    }
}*/



//enum Flags {
//    TRUE, FALSE;
// 
//    Flags() {
//        System.out.println("HELLO");
//    }
//}
// 
//public class Test {
//    public static void main(String[] args) {
//        Flags flags = Flags.TRUE;
//        System.out.println(Flags.FALSE);
//    }
//}

/*interface C{}

public class Test {
    enum TrafficLight implements C {
        RED, YELLOW, GREEN;
    }
 
    public static void main(String[] args) {
        TrafficLight tl = TrafficLight.valueOf(args[1]);
        switch(tl) {
            case RED:
                System.out.println("STOP");
                break;
            case YELLOW:
                System.out.println("SLOW");
                break;
            case GREEN:
                System.out.println("GO");
                break;
        }
    }
}*/


interface A{
	void m() throws Exception;
}
public class Test implements A {
    enum JobStatus {
        SUCCESS, FAIL; //Line n1
    }
    
    enum TestResult {
        PASS, FAIL; //Line n2
    }
    
    public static void main(String[] args) {
        JobStatus js = JobStatus.FAIL;
        TestResult tr = TestResult.FAIL;
        
        System.out.println(js.equals(tr)); //Line n3
//        System.out.println(js == tr); //Line n4
        
//        main(args);
        try {
//        	throw null;
        	x();
        } catch(Throwable e) {
        	e = null;
        }
    }
    
    private static void x() throws Exception {
    	System.out.println("Not throwing any exception");
    }

	@Override
	public void m() {
		
	}
}


abstract class B{
	void travel(String place) {
	}
}
abstract class C extends B{
	public abstract void travel() throws Exception;
}

//checked exception -> erro pode ser tratado - RuntimeException
//unchecked exception -> erro não pode ser tratado - NullPointerException

