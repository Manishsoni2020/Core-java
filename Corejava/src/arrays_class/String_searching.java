package arrays_class;

import java.util.Arrays;

public class String_searching {
public static void main(String[] args) {
	String[] s= {"A","Z","B"};
	Arrays.sort(s);
	System.out.println(Arrays.binarySearch(s, "Z")); //2
	System.out.println(Arrays.binarySearch(s, "K")); //-3
}
}
