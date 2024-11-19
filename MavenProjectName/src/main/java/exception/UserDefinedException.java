package exception;
import java.util.Scanner;
public class UserDefinedException {

	public static void main(String[] args) throws AboveAgeException, BelowAgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		
		if(age>70)
		{
			throw new AboveAgeException("Age above 70 not allowed");//user defined exception.Considered as constructor by default
		}
		else if (age <18)
		{
			throw new BelowAgeException("Age below 18 not allowed");//user defined exception.Considered as constructor by default
		}
		else if(age>18)
		{
			System.out.println("Eligible for Driving");
		}
	}

}
