class Hamlet {
	static String word = "";

	Hamlet(String word) {
		this.word += word;
	}

	{
		word += "a";
	}
	static {
		word += "i";
	}
	{
		word += "o";
	}
}

public class TypingMonkey {
	public static void main(String[] args) {
		System.out.print(Hamlet.word + " ");
		new Hamlet("u");
		System.out.print(Hamlet.word + " ");
		new Hamlet("e");
		System.out.print(Hamlet.word + " ");
	}
}