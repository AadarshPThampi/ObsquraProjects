package abstraction;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();			// object creation for child class
		obj.display();								// calling abstract method from parent class
		obj.sum(3, 4);								// calling instance method from parent class

	}

	@Override
	public void display() {								// implementations hidden from user
		System.out.println("Parent class abstract method");
		
	}

}
