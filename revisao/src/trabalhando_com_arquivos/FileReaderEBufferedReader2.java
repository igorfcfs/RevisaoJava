package trabalhando_com_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEBufferedReader2 {
	public static void main(String[] args) {
		String path = "D:\\projetos\\Alura\\RevisaoJava\\revisao\\src\\trabalhando_com_arquivos\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} 
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
