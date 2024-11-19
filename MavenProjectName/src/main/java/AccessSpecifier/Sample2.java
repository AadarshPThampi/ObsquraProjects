package AccessSpecifier;

public class Sample2 extends Sample1{		//Inheritance

	public static void main(String[] args) {
		Sample2 obj=new Sample2();
		// obj.privateMethod();			//private method not accessible from other class
		obj.defaultMethod();			//accessible within package 
		obj.publicMethod();				//accessible anywhere
		obj.protectedMethod();			//accessible within package 

	}

}
