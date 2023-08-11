
class Const{
	private static int COUNT = 0;
	{System.out.println("1");}
	public Const() {
		System.out.println("3");
	}
	static {System.out.println("0");}
	static {COUNT = 10; System.out.println(COUNT);}
	{System.out.println("2");}
}

public class Construtores {
	public static void main(String[] args) {
//		Const c = new Const();
		System.out.println("4");
		new Const();
	}
}
