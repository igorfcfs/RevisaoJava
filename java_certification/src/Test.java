public class Test {
	private static String str2;
	
    public static void main(String[] args) {
        String str = "Think"; //Line n3
        change(str); //Line n4
        System.out.println(Test.str2);
        System.out.println(str.toString());
    }
    
    private static void change(String s) {
        str2 = s.concat("_Twice"); //Line n9
    }
}