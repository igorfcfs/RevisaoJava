
public class Arrays {
	public static void main(String[] args) {
		int[] arrays = new int[3];
		for(int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i] = i);
		}
		System.out.println();
		for(int array : arrays) {
			System.out.println(array);
		}
		System.out.println();
		String[] arr = {"igor", "fernando", "casita", "ferreira", "da", "silva"};
		for(String nome : arr) {
			System.out.print(nome.toUpperCase() + " ");
		}
		System.out.println("\n");
		char[] characters = new char[26];
		characters[0] = 'a';
		characters[1] = 'b';
		characters[2] = 'c';
		characters[3] = 'd';
		characters[4] = 'e';
		characters[5] = 'f';
		characters[6] = 'g';
		characters[7] = 'h';
		characters[8] = 'i';
		characters[9] = 'j';
		characters[10] = 'k';
		characters[11] = 'l';
		characters[12] = 'm';
		characters[13] = 'n';
		characters[14] = 'o';
		characters[15] = 'p';
		characters[16] = 'q';
		characters[17] = 'r';
		characters[18] = 's';
		characters[19] = 't';
		characters[20] = 'u';
		characters[21] = 'v';
		characters[22] = 'w';
		characters[23] = 'x';
		characters[24] = 'y';
		characters[25] = 'z';
		
		System.out.println(characters[14] + "" + characters[8]);
		System.out.println();
		
		int numbers[] = {6, 9, 1};
		java.util.Arrays.sort(numbers);
		for(int x : numbers) {
			if(x < 9)System.out.print(x + "-");
			else System.out.print(x);
		}
		System.out.println();
		String stringNumbers[] = {"1", "9", "100"};
		java.util.Arrays.sort(stringNumbers);
		for(String x : stringNumbers) {
			System.out.print(x + " ");
		}
		System.out.println();
		int[] ids = new int[3], types = new int[3];
		ids[0] = 0;
		types[0] = 1;
		
		int ids1[] = new int[3], types1;
		ids1[1] = 3;
//		types1[1] = 4;
		System.out.println();
		
		int[][] matriz = {{1, 2},{3, 4}};
		for(int[] x : matriz)
			for(int y : x)
				System.out.println(y);
		
		System.out.println();
		int[][][] arrayMaluco = new int[2][2][2];
		int[][][] arrayMaluco2 = { { {1, 2}, {2, 1} }, { {3, 4, 5}, {4, 5} } };
		for(int[][] x : arrayMaluco2)
			for(int[] y : x)
				for(int z : y)
						System.out.println(z);
	}
}
