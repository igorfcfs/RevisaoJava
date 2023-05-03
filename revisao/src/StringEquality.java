import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class StringEquality {
	public static void main(String[] args) {
		String s = "Hello";//it's on the pool
		String t = new String(s);//it's not on the pool
		if ("Hello".equals(s)) System.out.println("one");//true
		if (t == s) System.out.println("two");//false
		if (t.equals(s)) System.out.println("three");//true
		if ("Hello" == s) System.out.println("four");//true
		if ("Hello" == t) System.out.println("five");//false
		
		String a = "Hello";
		String b = new String("Hello");
		System.out.println(s == a);
		System.out.println(a.equals(b));
		
		System.out.println();
		StringBuilder s1 = new StringBuilder("Java");
		String s2 = "Java";
		String s3 = new String("Java");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s2 == s3);
		System.out.println(s2 == "Java");
		
		System.out.println();
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 7));
		System.out.println(numbers.substring(7, 9));
		System.out.println(numbers.substring(7));
		
		System.out.println("----------------------------------");
		String s11 = "purr";
		s11.toUpperCase();
		s11.trim();
		s11.substring(1, 3);
		s11 += " two";
		System.out.println(s11);
		System.out.println(s11.length());
		System.out.println("----------------------------------");
		
		String a1 = "";
		a1 += 2;
		a1 += 'c';
		a1 += false;
		System.out.println(a1);
		if ( a1 == "2cfalse") System.out.println("==");
		if ( a1.equals("2cfalse")) System.out.println("equals");
		
		System.out.println("------------------------------------");
		
		StringBuilder c = new StringBuilder("Java");
		c.reverse();
		System.out.println(c);
		
		System.out.println("------------------------------------");
		//length, size, capacity array
		char[]d = new char[2];
		System.out.println(c.length());
		System.out.println(c.capacity());
		
		System.out.println("-------------------------------------");
		//length, size, capacity ArrayList
		ArrayList list = new ArrayList();
		int size = list.size();
		//
		int[] random = { 6, -4, 12, 0, -10 };
		int x = 12;
//		Arrays.sort(random);
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);
		for(int x111 : random) {
			System.out.print(x111+" ");
		}
		System.out.println("\n-------------------------------------");
		//List to array - listObject.toArray(array instance<WrapperClass>)
		List<Integer> list2 = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list2);
		for(Integer el : list2)
			System.out.print(el+" ");
		System.out.println();
		Integer array[] = list2.toArray(new Integer[4]);
		System.out.println(array[0]);
		
		System.out.println("\n-------------------------------------");
		//Array to list - Arrays.asList(array)
		String [] names = {"Tom", "Dick", "Harry"};
		List<String> list3 = Arrays.asList(names);
		list3.set(0, "Sue");
		System.out.println(names[0]);
		
		System.out.println("\n-------------------------------------");
		
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);
		int x1 = Collections.binarySearch(hex, "8");
		int y1 = Collections.binarySearch(hex, "3A");
		int z = Collections.binarySearch(hex, "4F");
		System.out.println(x1 + " " + y1 + " " + z);
		for(String w : hex) {
			System.out.print(w+" ");
		}
		
		System.out.println("\n-------------------------------------");
		
		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		if (one == two)
		System.out.println("A");
		else if (one.equals(two))
		System.out.println("B");
		else
		System.out.println("C");
		
		
		LocalDate date1 = LocalDate.of(2014, Calendar.JUNE, 21);
		LocalDate date2 = LocalDate.of(2014, 6, 21);
		LocalDate date3 = LocalDate.of(2014, Month.JUNE, 21);
		System.out.println(date1 + " " + date2 + " " + date3);
		
		
		
		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2);
		date.plusYears(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " "
		+ date.getDayOfMonth());
		
		System.out.println();
		LocalDateTime d1 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d1 = d1.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d1.format(f));
		
		
		LocalDateTime d11 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p1 = Period.ofDays(1).ofYears(2);
		d11 = d11.minus(p1);
		DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
		.SHORT);
		System.out.println(f1.format(d11));
	}
}
