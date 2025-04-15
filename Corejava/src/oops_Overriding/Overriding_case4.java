package oops_Overriding;

class H {
	public static void show() {  //static method also can be override
		System.out.println("H class");
	}
}

class K extends H {
	public static void show() {
		H.show();
		System.out.println("K class");
	}
}

public class Overriding_case4 {
	public static void main(String[] args) {
		K obj = new K();
		obj.show();
	}
}
