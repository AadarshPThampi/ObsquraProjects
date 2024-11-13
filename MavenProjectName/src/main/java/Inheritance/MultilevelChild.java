package Inheritance;

public class MultilevelChild extends MultilevelIntermediate{

	public static void main(String[] args) {
	MultilevelChild obj = new MultilevelChild();
	obj.display1();
	obj.display2();
	obj.display3();

	}
public void display3()
{
	System.out.println("Child class");

}
}
