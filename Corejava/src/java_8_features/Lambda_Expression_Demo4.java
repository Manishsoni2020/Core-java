package java_8_features;

import java.util.*;
public class Lambda_Expression_Demo4 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Maddey");
	al.add("Jitu");
	al.add("Komal");
	al.forEach(a-> System.out.println("Name : "+a));
}
}
