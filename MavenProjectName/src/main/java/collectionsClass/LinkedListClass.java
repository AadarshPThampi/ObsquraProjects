package collectionsClass;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		
		LinkedList v = new LinkedList();
		
		v.add(10);
		v.add(80);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
		
		v.set(1, 20);
		System.out.println(v);
		
		System.out.println(v.get(3));
		
		System.out.println(v.contains(50));

		if(v.isEmpty())
		{
			System.out.println("LinkedList is empty");
		}
		else
		{
			System.out.println("LinkedList is not empty");
		}
		
		Iterator x=v.iterator();
		
		while(x.hasNext())
		{
			System.out.print(x.next()+" ");
		}
		System.out.println();
		
		x.remove();
		System.out.println(v);
		
	}
	

}
