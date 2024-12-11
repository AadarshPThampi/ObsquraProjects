package FinalKeyword;

public class FinalChild extends Finalparent{

	public final void display()				//final method can't be overridden in child class
	{
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		

	}

}
