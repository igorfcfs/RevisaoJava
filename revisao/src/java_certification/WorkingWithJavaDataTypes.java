package java_certification;

import java.util.ArrayList;

public class WorkingWithJavaDataTypes {
//    private var place = "Unknown";
//    public static final var DISTANCE = 200;
	public static void main(String[] args) {
		//Question 1 => -108
        byte b1 = (byte) (127 + 21);
        System.out.println(b1);
        
        //Question 2 => compile sucefully
        char c = 'Z';
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f; 
        double d = 10_0.35d;
        l = c + i;
        f = c * l * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;
        
        //Question 3 => 97
        char c1 = 'a'; //ASCII code of 'a' is 97
        int i1 = c1; //Line n1
        System.out.println(i1); //Line n2
        
        //Question 4
        int x = 5____0;
//      int y = ____50; - error, vc so pode criar uma variavel assim
//      int z = 50____; - error, vc nao pode fazer nd assim
        float y = 123.76_86f;
        double z = 1_2_3_4;
        
        Boolean b11 = Boolean.valueOf("tRuE");
        Boolean b2 = Boolean.valueOf("fAlSe");
        Boolean b3 = Boolean.valueOf("abc");
        Boolean b4 = null;
        System.out.println(b11 + ":" + b2 + ":" + b3 + ":" + b4);
        
//        add(10.0, null);
        StringBuilder sb = new StringBuilder("INHALE ");
//        String s = sb.toString() + (sb.append("EXHALE "));
        String s = "" + (sb.append("EXHALE "));
        System.out.println(s.strip().length());
        System.out.println(s.strip());
        int aaa = 2;
        boolean res = false;
        res = aaa++ == 2 || --aaa == 2 && --aaa == 2;
        System.out.println(aaa);
        
        int m = 20;
        int var = --m * m++ + m-- - --m;//19 * 19 + 20 - 18
        System.out.println("m = " + m);
        System.out.println("var = " + var);
        
        int a = 1000;
        System.out.println(-a++);
        
        String swiftCode = "ICICINBBRT4";
        System.out.println(swiftCode.substring(4, 6));
        
        String abc = "abc";
        String def = abc; //true
//        String def = "abc" + ""; //true
//        String def = abc + ""; //false
        System.out.println(abc == def);
        
        System.out.println();
        
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        
        System.out.println();
        StringBuilder sb1 = new StringBuilder("Dream BIG");
        String s1 = sb1.toString();
        String s2 = sb1.toString();
        
        System.out.println(s1 == s2);
        
        StringBuilder sb2 = new StringBuilder("Breathe Deeply");
        String str1 = sb2.toString();
        String str2 = "Breathe Deeply";
        
        System.out.println(str1 == str2);
        
        Object [] arr = new Object[4];
        for(int i11 = 1; i11 <=3; i11++) {
            switch(i11) {
                case 1: 
                    arr[i11] = new String("Java");
                    break;
                case 2: 
                    arr[i11] = new StringBuilder("Java");
                    break;
                case 3: 
                    arr[i11] = new SpecialString("Java");
                    break;
            }
        }
        for(Object obj : arr) {
            System.out.println(obj);
        }
        
        StringBuilder sb11 = new StringBuilder(100);
        System.out.println(sb11.length() + ":" + sb11.toString().length());
        
        //Keyword VAR        
//      var[] s11 = new var[2]; //error
        String[] array= {"A", "B", "C"};
        for(var x1 : array) {
        	System.out.println(x1);
        }
        final var str = "ola";
        
        /*Error
         * var num;
         * num = 19;
        */
        
        var list1 = new ArrayList<>();
        var list2 = new ArrayList();
//        var lambda1 = () -> System.out.println("Hello");
//        var var = 100;
	}
	
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }
    
    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }
}
class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}
