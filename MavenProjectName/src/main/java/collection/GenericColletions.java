package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericColletions {

	public static void main(String[] args) {
													// We specify the type (String) in Generic Collections
		List <String> var=new ArrayList <String>(); // created reference of List interface using Class ArrayList
		
		var.add("Blue");		//adding elements to List using inbuilt add method.
		var.add("Green");
		var.add("Red");
		var.add("Yellow");
		System.out.println("The list is "+var);
		
		var.set(1, "Blue");	//modify the List interface
		System.out.println("Blue in index 1: "+var);
		
		System.out.println("Index of Red: "+var.indexOf("Red")); //gets the index value of item in the List
		
		System.out.println("Last index of Blue: "+var.lastIndexOf("Blue"));// gets the last occurence of repeated items
		
		var.remove(1);		// removes the value at index provided
		System.out.println("List after removing index 1: "+var);
		
		System.out.println("Value at index 2: "+var.get(2)); // gets the value at the index provided
		
		System.out.println("List has Pink: "+var.contains("Pink"));	//check the value in list
		System.out.println("List has Yellow: "+var.contains("Yellow"));
		
		System.out.println("Is List empty: "+var.isEmpty());		//checks if List is empty or not
		if(var.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("List is Not Empty");
			
		}
		
		System.out.println("Size of List: "+var.size()); // gets the size of List
		
	/*	for(int i=0;i<var.size();i++)			// used normal for loop
		{
			System.out.println(var.get(i));
		} 	*/
		
		for(String v:var)			//using foreach loop to iterate all elements
		{
			System.out.println(v);
		}
	}

}
