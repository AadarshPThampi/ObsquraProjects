package exception;

public class Example1 {

	public static void main(String[] args) {
		int a =10;
		int b=0;
		
		try
		{
			int div=a/b;					// arithmetic exception code placed inside try block
		}
		
		catch (ArithmeticException var)			// we know its an arithmetic exception.hece given classname
		{
		//	System.out.println("Exception Handled");	
			b=2;
			int newVal=a/b;
			System.out.println(newVal);
			System.out.println(var);		//prints the exception class name
		}
		
		finally								//executes if exception is handled or not
		{
			System.out.println("Important parts of the code");	
		}
	}

}
