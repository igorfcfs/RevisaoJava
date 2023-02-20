package trabalhando_com_arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterEBufferedWritter {
	public static void main(String[] args) {
		String[] lines = {"Good morning", "Good afternoon", "Good night"};
		String path = "D:\\projetos\\Alura\\RevisaoJava\\revisao\\src\\trabalhando_com_arquivos\\out.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
