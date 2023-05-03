import java.util.InputMismatchException;
import java.util.Scanner;

public class NotasETEC {
	static final int NF = 0;
	static final int I = 1;
	static final int R = 2;
	static final int B = 3;
	static final int MB = 4;
	
	enum Notas {
		NF, I, R, B, MB;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Quantas atividade voc� prop�s neste bimestre? ");
			int atividadesPropostas = sc.nextInt();
			int notas = 0;
			x: for(int i = 1; i <= atividadesPropostas; i++) {
				System.out.print("Qual foi a nota da atividade " + i + "? ");
				
				String notasString = sc.next().toUpperCase();
				switch(notasString) {
				case "NF":	
					notas += NF;
					break;
				case "I":
					notas += I;
					break;
				case "R":
					notas += R;
					break;
				case "B":
					notas += B;
					break;
				case "MB":
					notas += MB;
					break;
				default:
					System.out.println("Voc� n�o digitou uma nota v�lida. Tente novamente.");
					i = 0;
					continue x;
				}
			}
			double mediaDouble = (double) notas/atividadesPropostas;
			int mediaInt = (int) Math.round(mediaDouble);
			Notas media = null;
			switch(mediaInt) {
			case 0:
				media = Notas.NF;
				break;
			case 1:
				media = Notas.I;
				break;
			case 2:
				media = Notas.R;
				break;
			case 3:
				media = Notas.B;
				break;
			case 4:
				media = Notas.MB;
				break;
			}
			System.out.println("A m�dia deste aluno � " + media + ".");
		} catch(InputMismatchException e) {
			System.out.println("Voc� deve digitar somente n�meros.");
		} catch(ArithmeticException e) {
			System.out.println("Voc� deve passar no m�nimo 1 atividade por bimestre.");
		} catch(Exception e) {
			System.out.print("Um erro ocorreu: ");
			e.printStackTrace();
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}
