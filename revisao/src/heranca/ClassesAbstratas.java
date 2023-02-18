package heranca;

abstract class Pessoa {
	/*@Override
	public String toString() {
		return "Esta eh a classe pessoa";
	}*/
}
class PessoaJuridica extends Pessoa {
	@Override
	public String toString() {
		return "Esta eh a classe pessoa juridica";
	}
}
class PessoaFisica extends Pessoa {
	@Override
	public String toString() {
		return "Esta eh a classe pessoa fisica";
	}
}

public class ClassesAbstratas {
	public static void main(String[] args) {
		//A classe pessoa nao deveria ser instanciada, por isso a tornamos abstrata
		/*Pessoa p1 = new Pessoa();
		System.out.println(p1);*/
		Pessoa p2 = new PessoaJuridica();
		System.out.println(p2);
		Pessoa p3 = new PessoaFisica();
		System.out.println(p3);
	}
}
