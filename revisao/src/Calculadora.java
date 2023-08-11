public class Calculadora {

	public static void soma(double... args) {
		double soma = 0;
		for (double x : args)
			soma += x;
		System.out.println(soma);
	}

	public static void sub(double... args) {
		double sub = args[0];
		for (int i = 1; i < args.length; i++)
			sub -= args[i];
		System.out.println(sub);
	}

	public static void mul(double... args) {
		double mul = 1;

		for (double x : args)
			mul *= x;

		System.out.println(mul);
	}

	public static void div(double... args) {
		double div = args[0];
		if (args[args.length - 1] != 0) {
			for (int i = 1; i < args.length; i++)
				div /= args[i];
			System.out.println(div);
		} else
			System.out.println("Impossível dividir por zero.");
	}

	public static void main(String[] args) {
		soma(1.5, 1, 1, 1, 1);
		sub(4, 5);
		mul(2, 3);
		div(2, 0);
	}
}
