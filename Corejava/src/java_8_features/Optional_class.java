package java_8_features;

import java.util.Optional;

public class Optional_class {
public static void main(String[] args)
{
	//Create Optional using of()
	Optional<String> opt=Optional.of("Java");
	System.out.println(opt.get());
	
	//Create Optional using ofNullable()
	String name=null;
	Optional<String> op=Optional.ofNullable(name);
	System.out.println(op.isPresent());
}
}
