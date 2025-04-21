package java_8_features;

import java.util.Optional;

public class Optional_class_Allmethods {
public static void main(String[] args)
{
	
	//isPresent method is use to check the value which is present or not return true?/false
	Optional<String> str=Optional.of("Programing");
	if(str.isPresent())
	{
		System.out.println(str.get());
	}
	else 
	{
		System.out.println("Not applicable");
	}
	
	//ifpresent method is use when value is present then operation will perform
	Optional<String> io=Optional.of("Stream Api");
	io.ifPresent(val-> System.out.println(val.length()));
	
	//orElse() method is use to add data where our value is null
	String s=null;
	String finalname= Optional.ofNullable(s).orElse("java");
	System.out.println(finalname);
}
}
