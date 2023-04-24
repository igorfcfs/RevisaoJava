package working_with_java_data_types;

public class WorkingWithDataTypesStrigClass {
	
	// Question 40
    @Override
    public String toString() {
        return "TEST";
    }
	
	public static void main(String[] args) {
		// Question 34
        var str = "Have Faith!";
        System.out.println(str.length() + " : " + str.charAt(10));
        
        // Question 35
        String s1 = "OCP";
        String s2 = "ocp";
        System.out.println(s1.length() == s2.length());
        System.out.println(s1.equalsIgnoreCase(s2));
        
        // Question 36
        String fName = "Joshua";
        String lName = "Bloch";
        System.out.println(fName = lName);
        
        // Question 37
        String str1 = "Think";
        change(str1);
        System.out.println(str1);
        
        // Question 38
        String text = "ONE ";
        System.out.println(text.concat(text.concat("ELEVEN ")).trim());
        
        // Question 39
        String text1 = "    BE YOURSELF!    "; //Contains multiple space characters
        System.out.println(text1.trim());
        System.out.println(text1.strip());
        System.out.println(text1.stripLeading().stripTrailing());
        
        // Question 40
        WorkingWithDataTypesStrigClass obj = new WorkingWithDataTypesStrigClass();
        System.out.println(obj);
        
        // Question 41
        String s11 = new String("Java");
        String s21 = "JaVa";
        String s3 = "JaVa";
        String s4 = "Java";
        String s5 = "Java";
        
        int i = 1;
        
        // Question 42
        
        // Question 43
        String str11 = " ";
        boolean b1 = str11.isEmpty();
        boolean b2 = str11.isBlank();
        System.out.println(b1 + " : " + b2);
        
        str11.strip();
        b1 = str11.isEmpty();
        b2 = str11.isBlank();
        System.out.println(b1 + " : " + b2);
        
        // Question 44
        String s111 = "1Z0-819";
        String s211 = "1Z0-819" + "";
        System.out.println(s111 == s211);
        
        // Question 45
        final String fName1 = "James";
        String lName1 = "Gosling";
        String name1 = fName1 + lName1;
        String name2 = fName1 + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        
        // Question 46
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1111 = ":ONE";
        
        String str111 = i1 + s1111;
        String str2 = i2 + s1111;
        
        System.out.println(str111 == "1:ONE");
        System.out.println(str2 == "1:ONE");
        
        // Question 47
        String javaworld = "JavaWorld";
        String java = "Java";
        String world = "World";
        java += world;
        System.out.println(java == javaworld);
        
        // Question 48
        
        
        // Question 49
        
        
        // Question 50
        
	}
	
	// Question 37
    private static void change(String s) {
        s.concat("_Twice");
    }
}
