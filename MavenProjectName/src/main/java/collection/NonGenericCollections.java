package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NonGenericCollections {

	public static void main(String[] args) {
									// We don't specify the type (String) in NonGeneric Collections
		List var = new ArrayList();	// created reference of List interface using Class ArrayList
		
		var.add("Blue");		//adding elements to List using inbuilt add method.
		var.add("Green");
		var.add("Red");
		var.add("Yellow");
		System.out.println(var);
		
		var.set(1, "Black");
		System.out.println(var);
		
		System.out.println(var.get(3));
		
		System.out.println(var.indexOf("Red"));
		
		var.remove(3);
		System.out.println(var);
		
		var.add("Black");
		System.out.println(var);
		
		System.out.println(var.lastIndexOf("Black"));
		
		System.out.println(var.contains("Red"));
		
		if(var.isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			System.out.println("List is not empty");
		}
		
		//for each loop not used in non-generic since we don't specify the type. foreach needs type.
		
		Iterator i=var.iterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
	}

}
