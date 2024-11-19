package exception;

public class AboveAgeException extends Exception {	//User-defined Exception class

	public AboveAgeException(String above) // parameterized constructor with string as argument
	{
		super(above);
	}
	
}
