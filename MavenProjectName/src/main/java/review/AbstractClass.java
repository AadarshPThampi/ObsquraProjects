package review;

public class AbstractClass implements ParentInterface {

	public static void main(String[] args) {
		ParentInterface obj=new AbstractClass();
		obj.sum(10, 20);

	}

	@Override
	public void sum(int a, int b) {
		int sum=a+b;
		System.out.println("Sum is"+sum);
		
	}

}
