package functional_programming;

import java.util.function.Predicate;

interface Test{
	boolean test(Integer i);
}

class TestTest implements Test {
	public boolean test(Integer i) {
		return i > 0;
	}
}

public class LambdaAndPredicates {
	public static void main(String[] args) {
		Test test = new TestTest();
		System.out.println(test.test(2));
		
		Test test2 = i -> i > 0; //Test test2 = (Integer i) -> {return i > 0};
		System.out.println(test2.test(2));
		
		Predicate<Integer> test3 = i -> i > 0;
		System.out.println(test3.test(2));
	}
}
