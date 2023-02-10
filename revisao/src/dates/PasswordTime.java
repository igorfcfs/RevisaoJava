package dates;

import java.time.*;
import java.util.*;

public class PasswordTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalTime passTime = LocalTime.now();
		
		System.out.print("Digite a senha: ");
		int passInt = sc.nextInt();
		String passString = String.valueOf(passInt);
		
		System.out.println(passTime);
		
		String pass = String.valueOf(passTime.getHour()) + String.valueOf(passTime.getMinute());
		if(passString.equals(pass)){
			System.out.println(Acesso.ACESSO_CONCEDIDO);
		} else {
			System.out.println(Acesso.ACESSO_NEGADO);
		}
		
		sc.close();
	}
}
