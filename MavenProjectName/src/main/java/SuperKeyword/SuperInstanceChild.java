package SuperKeyword;

public class SuperInstanceChild extends SuperInstanceparent {

	String b="Child";		//Instance variable in child class
	public static void main(String[] args) {
		SuperInstanceChild obj = new SuperInstanceChild();
		obj.display();
	}
public void display()
{
	System.out.println(b);
	System.out.println(super.a);		//invoking instance variable from parent class
}
}
