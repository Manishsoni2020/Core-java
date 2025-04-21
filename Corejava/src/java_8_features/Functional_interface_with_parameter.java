package java_8_features;

interface Couple
{
	void couple_name(String male_name,String female_name);
}
public class Functional_interface_with_parameter {
public static void main(String[]args)
{
	Couple couple=(male_name,female_name)->{
		System.out.println("The best couple is : "+male_name+" and "+female_name);
	};
	couple.couple_name("Ranbir kapoor", "Alia Bhatt");
}
}
