package trabalhando_com_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEBufferedReader {
	public static void main(String[] args) {
		
		//stream: sequencia
		String path = "D:\\projetos\\Alura\\RevisaoJava\\revisao\\src\\trabalhando_com_arquivos\\in.txt";
		
		//stream de leitura de caracteres a partir de arquivos
		FileReader fr = null;
		BufferedReader br = null;
		
		//BufferedReader e instanciado a partir do FileReader
		try {
//			fr = new FileReader(path);
//			br = new BufferedReader(fr);
			br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} 
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
