import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Cliente{
	String nome;
	int idade;
	boolean suspeito;
	
	Cliente(String nome, int idade, boolean suspeito){
		this.nome = nome;
		this.idade = idade;
		this.suspeito = suspeito;
	}
	
	public void verificaSeESuspeito(List<String> lista) {
		if(suspeito == true) {
			lista.clear();
			System.out.println("O cliente e suspeito!");
			System.out.println("Voce nao tem permissao de acessar os dados!");
		} else {
			System.out.println("O cliente nao e suspeito!");
			System.out.println("Os dados sao:");
			informaDados(lista);
		}
	}
	
	public void informaDados(List<String> lista) {
		Collections.sort(lista);
		for(String s : lista) {
			System.out.println(s);
		}
	}
}

public class Dados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Voce gosta de bandidagem? ");
		String resposta = sc.nextLine();
		boolean conclusao;
//		if(resposta == "sim") {
//			conclusao = true;
//		} else {
//			conclusao = false;
//		}
		switch(resposta) {
		case "Nao", "nao":
			conclusao = false;
			break;
		default:
			conclusao = true;
			break;
		}
		List<String> lista = new ArrayList<>();
		lista.add("Igor");
		lista.add("Jorge");
		lista.add("Karina");
		lista.add("Felipe");
		Cliente cliente = new Cliente("Igor", 15, conclusao);
		cliente.verificaSeESuspeito(lista);
		sc.close();
	}
}
