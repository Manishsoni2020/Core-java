package arrays_class;

import java.util.Arrays;

public class Array_searching {
public static void main(String[] args) {
	int[]a= {10,5,20,11,6};
	Arrays.sort(a);
	System.out.println(Arrays.binarySearch(a, 11)); //3
	System.out.println(Arrays.binarySearch(a, 10)); //2
	
}
}
