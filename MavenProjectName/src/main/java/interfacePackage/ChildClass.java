package interfacePackage;

public class ChildClass implements Parent{		// used keyword implements 

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();		// object created for child class
		obj.display();							// invoking abstract method in parent interface
		System.out.println(obj.a);				// invoking static final variable from parents
	}

	@Override
	public void display() {	
		System.out.println("Parent interface");
		
	}

}
