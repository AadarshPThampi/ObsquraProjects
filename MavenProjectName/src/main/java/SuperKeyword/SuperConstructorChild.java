package SuperKeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	public static void main(String[] args) {
		
		//object is created to invoke the default constructor.
		SuperConstructorChild obj = new SuperConstructorChild();	
		
	}
	public SuperConstructorChild()			 //default constructor of child class
	{
		super(10,20);						// super should be 1st statement inside constructor
		System.out.println("Child class constructor");
		
	}
}
