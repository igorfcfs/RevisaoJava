//import java.util.Scanner;
//
//class SecurityClass {
//	private static String securityPassword;
//
//	SecurityClass(String securityPassword) {
//		setSecurityPassword(securityPassword);
//	}
//
//	public void setSecurityPassword(String securityPassword) {
//		Scanner sc = new Scanner(System.in);
//		if (SecurityClass.securityPassword == null)
//			SecurityClass.securityPassword = securityPassword;
//		else {
//			System.out.print("Digite a senha anterior: ");
//			String senhaAnterior
//		}
//		sc.close();
//	}
//	
//	private static boolean verifyPassword() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Digite a senha anterior: ");
//		String senhaAnterior = sc.next();
//		System.out.println();
//		if (senhaAnterior == securityPassword)return true; else return false;
//	}
//
//	public static void printSecurityPassword(String securityPassword) {
//		SecurityClass.securityPassword = securityPassword;
//		System.out.println(SecurityClass.securityPassword);
//	}
//
//	public static void changePassword() {
//		verifyPassword();
//		if (senhaAnterior == securityPassword) {
//			System.out.print("Digite a nova senha: ");
//			String novaSenha = sc.next();
//			securityPassword = novaSenha;
//		} else {
//			System.out.println("Senha incorreta.");
//		}
//		sc.close();
//	}
//}
//
//public class CyberSecurity {
//	public static void main(String... args) {
//		SecurityClass.printSecurityPassword2("igor123");
//	}
//}
