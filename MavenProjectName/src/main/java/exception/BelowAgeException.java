package exception;

public class BelowAgeException extends Exception {	//User-defined Exception class

	public  BelowAgeException(String below)		// parameterized constructor with string as argument
	{
		super(below);
	}
}
