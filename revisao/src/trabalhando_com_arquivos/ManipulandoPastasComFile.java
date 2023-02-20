package trabalhando_com_arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Expressoes lambda/Predicados: Nos podemos colocar uma funcao como argumento de outra funcao
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for(File file: files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created success: " + success);
		sc.close();
	}
}
