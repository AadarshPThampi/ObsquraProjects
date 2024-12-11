package review;

public class Child extends Parent{

	public static void main(String[] args) {
		Child obj = new Child();
		obj.answer(10, 20);

	}

	
	public void answer(int a, int b)
	{
	int prod=a*b;
	System.out.println("prod is "+prod);
	super.answer(10, 20);
	}
}
