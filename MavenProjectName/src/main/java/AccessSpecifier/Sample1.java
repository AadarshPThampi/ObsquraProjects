package AccessSpecifier;

public class Sample1 {

	private void privateMethod()
	{
		System.out.println("Private method");
	}
	
	public void publicMethod()
	{
		System.out.println("public method");
	}
	protected void protectedMethod()
	{
		System.out.println("protected method");
	}
	void defaultMethod()
	{
		System.out.println("default method");
	}
	public static void main(String[] args) {
		Sample1 obj=new Sample1();
		obj.privateMethod();				//Accessible only within the class
		obj.defaultMethod();				//Accessible only within the package
		obj.protectedMethod();				//Accessible within the package	
		obj.publicMethod();					//Accessible anywhere
		

	}

}
