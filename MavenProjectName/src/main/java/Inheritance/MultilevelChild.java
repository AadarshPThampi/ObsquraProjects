package Inheritance;

public class MultilevelChild extends MultilevelIntermediate{

	public static void main(String[] args) {
	MultilevelChild obj = new MultilevelChild();		//created object of child class
	obj.display1();										//calling parent class method using object of child class
	obj.display2();										//calling intermediate class method ....
	obj.display3();

	}
public void display3()
{
	System.out.println("Child class Method");

}
}
