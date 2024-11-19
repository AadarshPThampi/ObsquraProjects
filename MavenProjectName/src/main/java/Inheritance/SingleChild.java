package Inheritance;

public class SingleChild extends SingleParent{

	public static void main(String[] args) {
		
		SingleChild obj= new SingleChild();
		obj.display1(); 		 //calls method in parent class using inheritance
		obj.display2();
	}
	public void display2()
	{
		System.out.println("Child Class");
	}
}
