package working_with_java_data_types;

class A {
   public String toString() {
       return null;
   }
}

public class WorkingWithDataTypesOperators {
	public static void main(String[] args) {
		
		// Question 13
        System.out.println( 53 / 2.0 );
        System.out.println( 53 % 2.0 );
        
        // Question 14
        System.out.println("Password" + 1 + 2 + 3 + 4);
        
        // Question 15
        System.out.println(1 + 2 + 3 + 4 + "Running");
        
        // Question 16
        System.out.println("1" + "2" + "3" == "1" + "2" + "3");
        
        // Question 17
//        System.out.println("Equals??? " + 10 != 5);
        
        // Question 18
        System.out.println("Result is: " + (10 != 5));
        
        // Question 19
        byte var = 127;
//        System.out.println(var = var - 1);
        System.out.println(var = (var--));
//        System.out.println(var = var + 1);
        System.out.println(var = (var++));
        System.out.println(++var);
        System.out.println(--var);
        System.out.println(var *= 2);
        System.out.println(var -= 10);
        System.out.println(var += 2);
        System.out.println(var);
        
        // Question 20
        String text = null;
//        System.out.println(text.repeat(3));
//        System.out.println(null + null + null);
        System.out.println(null + "null" + null);
//        System.out.println(text *= 3);
        System.out.println(text += "null".repeat(2));
        System.out.println(text + text + text);
//        text += null; System.out.println((text.concat(null)));
        
        // Question 21
        String text1 = null;
        text1 = text1 + new A();
        System.out.println(text1.length());
        
        // Question 22
        String text2 = "RISE ";
        text2 = text2 + (text2 = "ABOVE ");
        System.out.println(text2);
        
        // Question 23
        StringBuilder sb = new StringBuilder("INHALE ");
        String s = sb.toString() + (sb.append("EXHALE "));
        System.out.println(s.strip().length());
        
        // Question 24
        boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true));
        System.out.println(flag);
        
        // Question 25
        boolean status = true;
//        System.out.println(status = false || status = true | status = false);
        System.out.println(status);
        
        // Question 26
        var a = 3;
        var b = 5;
        var c = 7;
        var d = 9;
        boolean res = --a + --b < 1 && c++ + d++ > 1;
        System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b", a, b, c, d, res);
        
        // Question 27
        int m = 20;
        int var1 = --m * m++ + m-- - --m;
        System.out.println("m = " + m);
        System.out.println("var = " + var1);
        
        // Question 28
        int x = 7;
        boolean res1 = x++ == 7 && ++x == 9 || x++ == 9;
        System.out.println("x = " + x);
        System.out.println("res = " + res1);
        
        // Question 29
        int a1 = 1000;
        System.out.println(-a1++);
        
        // Question 30
        int i = 2;
        boolean res2 = false;
        res2 = i++ == 2 || --i == 2 && --i == 2;
        System.out.println(i);
        
        // Question 31
        int i1 = 10;
        System.out.println(i1 > 3 != false);
        
        // Question 32
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;
        boolean flag4 = false;
        
        System.out.println(!flag1 == flag2 != flag3 == !flag4);
        System.out.println(flag1 = flag2 != flag3 == !flag4);
        
        // Question 33
        var val = 9;
        System.out.println(val += 10 - -val-- - --val);
	}
}
