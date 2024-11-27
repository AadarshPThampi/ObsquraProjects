package collectionsClass;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet<String> var=new HashSet<String>();
		
		var.add("Book");
		var.add("Pen");
		var.add("Pencil");
		var.add("Box");
		var.add("Eraser");
		var.add("Ruler");
		System.out.println(var);
		
		var.remove("Pen");
		System.out.println("After removing Pen: "+var);
		
		System.out.println("Contains Ruler: "+var.contains("Ruler"));
		
		System.out.println("Size is: "+var.size());
		
		if (var.isEmpty())
		{
			System.out.println("HashSet is empty");
		}
		else
		{
			System.out.println("HashSet is not empty");
		}
		
		for(String s:var)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		var.clear();		// clears all contents in the HashSet
		System.out.println("After clearing: "+var);
	}

}
