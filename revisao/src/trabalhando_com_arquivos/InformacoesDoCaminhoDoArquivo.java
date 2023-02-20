package trabalhando_com_arquivos;

import java.io.File;
import java.util.Scanner;

public class InformacoesDoCaminhoDoArquivo {
	public static void main(String[] args) {
		//D:\\projetos\\Alura\\RevisaoJava\\revisao\\src\\trabalhando_com_arquivos\\in.txt
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
		sc.close();
	}
}