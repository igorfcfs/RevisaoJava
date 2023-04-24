package working_with_java_data_types;

public class WorkingWithDataTypesWrapperTypes {
	public static void main(String[] args) {
		
		// Question 8
		Boolean b11 = Boolean.valueOf("tRuE");
		Boolean b2 = Boolean.valueOf("fAlSe");
		Boolean b3 = Boolean.valueOf("abc");
		Boolean b4 = null;
		System.out.println(b11 + ":" + b2 + ":" + b3 + ":" + b4);
		
		// Question 9
//		add(10.0, null);
		
		// Question 10
		m(1);
		
		// Question 11
        extractInt(2.7);
//        extractInt(2);
        extractInt((double) 2);
        
        // Question 12
        String [] arr = {"abc", "TrUe", "false", null, "FALSE"};
        for(String s : arr) {
            System.out.print(Boolean.valueOf(s) ? "T" : "F");
        }
	}
	
	// Question 9
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }
    
    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }
    
    // Question 10
    private static void m(Object obj) {
        System.out.println("Object version");
    }
    
    private static void m(Number obj) {
        System.out.println("Number version");
    }
    
    private static void m(Double obj) {
        System.out.println("Double version");
    }
    
    // Question 11
    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }
}
