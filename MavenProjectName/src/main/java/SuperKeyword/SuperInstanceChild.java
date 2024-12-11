package SuperKeyword;

public class SuperInstanceChild extends SuperInstanceparent {	//IS A Relationship

	String b="Child class instance variable";				//Instance variable in child class
	public static void main(String[] args) {
		SuperInstanceChild obj = new SuperInstanceChild();	// object creation for child class
		obj.display();
	}

public void display()
{
	System.out.println(b);
	System.out.println(super.a);		//invoking instance variable from parent class using super
}
}
