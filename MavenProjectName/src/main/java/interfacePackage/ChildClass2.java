package interfacePackage;

public class ChildClass2 implements ParentInterface{

	public static void main(String[] args) {
		ParentInterface obj = new ChildClass2();		// reference of "PARENT" interface created
		obj.show();							// parent method invoked using the reference
	//	obj.display();						// reference can't call child's methods
	}

	@Override
	public void show() {
		System.out.println("Parent");
		
	}

	public void display()					//child class method
	{
		System.out.println("Child");
	}
}
