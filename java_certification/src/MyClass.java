import java.util.Arrays;
public class MyClass {
public static void main(String[] args) {
    String[] os = new String[] { "Mac", "Linux", "Windows" };
    System.out.println(Arrays.binarySearch(os, "Linux"));
}
}
