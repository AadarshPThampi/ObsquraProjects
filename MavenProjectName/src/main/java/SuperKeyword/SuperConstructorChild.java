package SuperKeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	public static void main(String[] args) {
		
		SuperConstructorChild obj = new SuperConstructorChild();	
		
	}
	public SuperConstructorChild()
	{
		super(10,20);
		System.out.println("Child class constructor");
		
	}
}
