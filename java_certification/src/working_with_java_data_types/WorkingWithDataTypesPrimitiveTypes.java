package working_with_java_data_types;

public class WorkingWithDataTypesPrimitiveTypes {
//  private var place = "Unknown";
//  public static final var DISTANCE = 200;
	public static void main(String[] args) {
		// Question 1 => -108
		byte b1 = (byte) (127 + 21);
		System.out.println(b1);

		// Question 2 => compile sucefully
		char c = 'Z';
		long l = 100_00l;
		int i = 9_2;
		float f = 2.02f;
		double d = 10_0.35d;
		l = c + i;
		f = c * l * i * f;
		f = l + i + c;
		i = (int) d;
		f = (long) d;

		// Question 3 => 97
		char c1 = 'a'; // ASCII code of 'a' is 97
		int i1 = c1; // Line n1
		System.out.println(i1); // Line n2

		// Question 4
		int x = 5____0;
//		int y = ____50; - error, vc so pode criar uma variavel assim
//    	int z = 50____; - error, vc nao pode fazer nd assim
		float y = 123.76_86f;
		double z = 1_2_3_4;

		// Question 5
		byte b2 = 10;
		int i2 = b2;
//        byte b3 = i2;
		byte b3 = (byte) i2;
		System.out.println(b2 + i2 + b3);
		
		// Question 6
		short s1 = 10;
		
//		short s2 = 32768;
		short s2 = (short) 32768;
		
	    final int i3 = 10;
	    short s3 = i3;
	    
	    final int i4 = 40000;
//	    short s4 = i4;
	    short s4 = (short) i4;
	    
	    final int i5 = 10;
	    short s5 = i5 + 100;
	    
	    final int m = 25000;
	    final int n = 25000;
//	    short s6 = m + n;
	    short s6 = (short) (m + n);
	    
	    int i7 = 10;
//	    short s7 = i7; 
	    short s7 = (short) i7;
		
		// Question 7
//        boolean b1 = 0;
//        boolean b2 = 1;
//        System.out.println(b1 + b2);
		
	}
}
