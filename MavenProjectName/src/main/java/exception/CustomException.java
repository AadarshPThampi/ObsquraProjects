package exception;
import java.util.Scanner;
public class CustomException {

	public static void main(String[] args) throws VotingException { //exception declaration
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new VotingException("Not eligible"); //user defined exception. considered as constructor by default
		}

	}

}
