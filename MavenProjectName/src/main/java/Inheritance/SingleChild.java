package Inheritance;

public class SingleChild extends SingleParent{

	public static void main(String[] args) {
		
		SingleChild obj= new SingleChild();		//created object of child class
		obj.display1(); 						 //calls method in parent class using object of child class
		obj.display2();
	}
	public void display2()
	{
		System.out.println("Child Class");
	}
}
