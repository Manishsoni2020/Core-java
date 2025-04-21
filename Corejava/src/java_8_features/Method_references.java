package java_8_features;

import java.util.Arrays;

public class Method_references {
	static void show(String s)
	{
		System.out.println(s);
	}
public static void main(String[]args)
{
	String str[]= {"Japan","India","South Africa"};
	Arrays.stream(str).forEach(Method_references::show);
}
}
