package java_8_features;

interface Calculator 
{
	void sum(int a,int b); //Multiple parameter
}

public class Lambda_Expressions_Demo3 {
public static void main(String[] args) {
	Calculator cal=(a,b)->{
		System.out.println(a+b);
	};
	cal.sum(5, 20);
}
}
