package collectionsClass;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		LinkedHashSet<String> var = new LinkedHashSet<String>();
		
		var.add("Sum");
		var.add("Multiply");
		var.add("Diff");
		var.add("Divide");
		System.out.println(var);
		
		System.out.println(var.size());
		
		System.out.println(var.isEmpty());
		
		System.out.println(var.contains("Sum"));
		
		
		
		var.remove("Diff");
		System.out.println(var);
		
		for(String s:var)
		{
			System.out.print(s+" ");
		}
	}

}
