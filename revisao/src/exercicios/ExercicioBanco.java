package exercicios;
import java.util.Scanner;

class Conta {
	private int numeroDaConta;
	private String titularDaConta;
	private double saldo;
	
	Conta(int numeroDaConta, String titularDaConta){
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
	}
	Conta(int numeroDaConta, String titularDaConta, double depositoInicial){
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		deposito(depositoInicial);
	}
	
	public void saque(double valorASacar) {
		this.saldo -= valorASacar + 5.0;
	}
	
	public void deposito(double valorASacar) {
		this.saldo += valorASacar;
	}
	
	@Override
	public String toString() {
		return "Account " + numeroDaConta + ", Holder: " + titularDaConta + ", balance: " + saldo;
	}
	
}


public class ExercicioBanco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numeroDaConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account Holder: ");
		String titularDaConta = sc.nextLine();
		System.out.print("Is there a initial deposit? (y/n) ");
		String resposta = sc.nextLine();
		
//		Conta conta = new Conta(numeroDaConta, titularDaConta);
		Conta conta;
		if(resposta.equals("y")) {
			System.out.print("Enter a initial deposit: ");
			double initialDeposit = sc.nextDouble();
//			conta.deposito(initialDeposit);
			conta = new Conta(numeroDaConta, titularDaConta, initialDeposit);
		} else {
			conta = new Conta(numeroDaConta, titularDaConta);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		conta.deposito(deposit);
		System.out.println("Updated account data:");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		conta.saque(withdraw);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();
	}
}
