class A {
	static void run(int[] a) {
		a[0] += 10;
	}

	public static void main(String[] args) {
		int[] a = new int[1];
		a[0] = 5;
		run(a);
		System.out.println(a[0]);
	}
}