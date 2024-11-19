package abstraction;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		ClassA obj = new ClassB();				// Reference of parent abstract class created
		obj.display();
		obj.print();
		//obj.show();	//can't call child class instance method using the reference of parent abstract class
	}

	@Override
	public void display() {
		System.out.println("Abstract method in parent");
		
	}
	
	public void show()
	{
		System.out.println("Child class instance method");
	}

}
