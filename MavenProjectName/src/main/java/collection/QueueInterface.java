package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
	
		Queue var=new PriorityQueue();
		
		var.add("10");
		var.add("30");
		var.add("30");
		var.add("40");
		var.add("50");
		System.out.println(var);
		
		System.out.println("Size is: "+var.size());
		
		System.out.println("Has value 30: "+var.contains(30));
		
		System.out.println("Is empty: "+var.isEmpty());
		
		var.clear();
		System.out.println(var);

	}

}
