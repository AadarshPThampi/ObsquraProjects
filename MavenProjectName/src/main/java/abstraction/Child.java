package abstraction;

public class Child extends Parent{					//Inheritance

	public static void main(String[] args) {
		Child obj = new Child();					//object creation for Child class
		obj.show();
		System.out.println("Sum is "+obj.sum(2, 3));
		
	}

	@Override
	public void show() {								//  implementations hidden from user
		System.out.println("Abstract parent method");
		
	}

	@Override
	public int sum(int a, int b) {						//  implementations hidden from user
		int sum=a+b;
		return sum;
		
	}

}
