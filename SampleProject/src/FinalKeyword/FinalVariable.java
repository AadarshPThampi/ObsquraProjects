package FinalKeyword;

public class FinalVariable {

	final int a = 100;
	
	public static void main(String[] args) {
		FinalVariable obj = new FinalVariable();
		obj.display();
		
		
	}
	
	public void display()
	{
		a=30;
		
	}
}
