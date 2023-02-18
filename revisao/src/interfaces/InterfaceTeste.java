package interfaces;

interface Teste {
	double tax(double ammount);
}

class TestaInterface implements Teste {
	@Override
	public double tax(double ammount) {
		return ammount;
	}
}

public class InterfaceTeste {
	public static void main(String[] args) {
		Teste ti = new TestaInterface();
		System.out.println("Sua quantia eh " + ti.tax(0));
	}
}
