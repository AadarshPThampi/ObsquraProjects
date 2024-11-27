package collectionsClass;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList <String> obj = new  ArrayList<String>();	// object creation for ArrayList class
		
		obj.add("car");
		obj.add("bus");
		obj.add("bike");
		obj.add("scooter");	
		System.out.println(obj);
			

		ArrayList <String> var = new  ArrayList<String>();
		var.add("green");
		var.add("pink");
		System.out.println(var);
		
		System.out.println(obj.addAll(var));		//add 2 list together
		System.out.println(obj);
		
		obj.set(0, "hello");
		System.out.println(obj);
		
		System.out.println(obj.get(5));
		
		System.out.println(obj.contains("pink"));
		
		System.out.println(obj.size());
		
		System.out.println(obj.indexOf("bus"));
		
		Iterator itr = obj.iterator();		//Iterator variable created
		
		while(itr.hasNext())				// check if elements is inside obj
		{
			System.out.println(itr.next());		// prints the elements in the list
		}
		
		itr.remove();			// removes the last element only
		System.out.println(obj);
	}

}
