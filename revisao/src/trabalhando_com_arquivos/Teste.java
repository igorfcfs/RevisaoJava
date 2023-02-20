package trabalhando_com_arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		//D:\\projetos\\Alura\\RevisaoJava\\revisao\\src\\trabalhando_com_arquivos\\out.txt
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path:");
		String path = sc.nextLine();
		String[] lines = {"Good morning", "Good afternoon", "Good night"};
		
		try (BufferedReader br = new BufferedReader(new FileReader(path));
				BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			System.out.println("The content inside it is:");
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			for(String line2 : lines) {
				bw.write(line2);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
