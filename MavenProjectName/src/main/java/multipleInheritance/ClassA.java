package multipleInheritance;

public class ClassA implements Parent1, Parent2, Parent3 {// implemented multiple parent interfaces

	public static void main(String[] args) {
		ClassA obj = new ClassA();				// object created for child class
		obj.print1();		// invoking method of Parent1
		obj.print2();		// invoking method of Parent2
		obj.print3();		// invoking method of Parent3
	}

	@Override
	public void print2() {
		System.out.println("Parent 2");
		
	}

	@Override
	public void print1() {
		System.out.println("Parent 1");
		
	}

	@Override
	public void print3() {
		System.out.println("Parent 3");
		
	}

}
