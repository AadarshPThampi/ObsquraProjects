package collection;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		Set <String> var = new HashSet<String>();	//reference of Set interface created using class Hashset
		
		var.add("Blue");		//adding elements to Set using inbuilt add method.
		var.add("Green");
		var.add("Red");
		var.add("Yellow");
		System.out.println(var);
		
		Set<String> s=new HashSet<String>();
		s.add("Car");
		s.add("Bus");
		s.add("bike");
		s.add("Scooter");
		System.out.println(s);
		
		System.out.println("contains green: "+var.contains("Green")); 
		
		var.addAll(s);		//add another set s to set var
		System.out.println(var);
		
		System.out.println("contains all: "+var.containsAll(s));//checks contents in s is there in var
		System.out.println(s);
		
		System.out.println(var.remove("Yellow"));
		System.out.println(var);
		
		System.out.println(var.size());
		
		System.out.println(var.isEmpty());
		
		var.clear();			//clears all elements in the Set
		System.out.println(var);
		
	}

}
