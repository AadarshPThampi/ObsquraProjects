package abstraction;

public abstract class ParentClass {					//abstract class

	public abstract void display();					//abstract method
	
	public void sum(int a, int b)					// instance method
	{
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
}
