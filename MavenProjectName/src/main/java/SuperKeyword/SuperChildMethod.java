package SuperKeyword;

public class SuperChildMethod extends SuperParentMethod {

	public static void main(String[] args) {
		SuperChildMethod obj = new SuperChildMethod();
		obj.display2();

	}
public void display2()
{
	System.out.println("Child method class");
	super.display1(); //refer the method in parent class from inside method
}
}
