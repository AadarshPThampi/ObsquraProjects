package collectionsClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		
		List<String> var = new ArrayList<String>();
		
		var.add("Circle");
		var.add("Square");
		var.add("Rectangle");
		var.add("Triangle");

		Iterator it=var.iterator();
		
		while(it.hasNext())				// checks if List var has values, loop execute if true
		{
			System.out.print(it.next()+" ");	// prints the element in the loop
		}
		System.out.println();
		
		for(String v:var)			//foreach loop
		{
			System.out.print(v+" ");
		}
	}

}
