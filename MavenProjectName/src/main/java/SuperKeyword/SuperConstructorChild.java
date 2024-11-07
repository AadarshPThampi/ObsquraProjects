package SuperKeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	public static void main(String[] args) {
		
		//object is created to invoke the default constructor.
		SuperConstructorChild obj = new SuperConstructorChild();	
		
	}
	public SuperConstructorChild() //constructor
	{
		super(10,20);
		System.out.println("Child class constructor");
		
	}
}
