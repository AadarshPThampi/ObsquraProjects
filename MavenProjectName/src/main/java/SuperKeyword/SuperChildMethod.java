package SuperKeyword;

public class SuperChildMethod extends SuperParentMethod {

	public static void main(String[] args) {
		SuperChildMethod obj = new SuperChildMethod();	//object for child class
		obj.display2();
		
	}
public void display2()
{
	System.out.println("Super child method");
	super.display1(); 		//refer the method in parent class from inside the method using super
}
}
