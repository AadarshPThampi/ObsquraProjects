package MethodOverriding;

public class Child extends Parent {				//Inheritance

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display(40, 20);				//calls the method in same child class
		
	}
public void display(int a, int b)			//method overriding with same name and parameter as in parent
{
	int dif = a-b;
	System.out.println("Difference is "+dif);
	super.display(a, b);					//calls the method in parent class using super
	
}

	
}
