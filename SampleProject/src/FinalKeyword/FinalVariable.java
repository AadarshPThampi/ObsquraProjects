package FinalKeyword;

public class FinalVariable {

	final int a = 100;
	
	public static void main(String[] args) {
		FinalVariable obj = new FinalVariable();
		obj.display();
		
		
	}
	
	public void display()
	{
		a=30;						// value of final variable a can't be changed
		System.out.println(a);
		
	}
}
