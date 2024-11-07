package Inheritance;

public class HyrarchyChild1 extends HyrarchyParent{

	public static void main(String[] args) {
		
		HyrarchyChild1 obj1=new HyrarchyChild1();
		obj1.display1();
		obj1.display2();

	}
public void display2()
{
	System.out.println("Hyrarchy Child class 1");
}
}
