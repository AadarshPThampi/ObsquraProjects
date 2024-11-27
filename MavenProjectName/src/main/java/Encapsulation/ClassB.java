package Encapsulation;

public class ClassB {							// NO Inheritance

	public static void main(String[] args) {
		ClassA obj = new ClassA();				// create object of "PARENT" method
		obj.setName("Ramesh");					// set value to variables of other class by set method
		obj.setAge(30);									
		
		System.out.println("Name is "+ obj.getName());	// get value of variables from other class by get method
		System.out.println("Age is "+ obj.getAge());

	}

}
