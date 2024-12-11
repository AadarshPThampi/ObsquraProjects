package AccessSpecifierNew;

import AccessSpecifier.Sample1;				//importing class from other package

public class SampleClass extends Sample1{		//Inheritance

	public static void main(String[] args) {
		SampleClass obj = new SampleClass();
			
		//obj.privateMethod();				//private method not accessible from other class
		//obj.defaultMethod();				//default method not accessible from other package
		obj.protectedMethod();				//accessed outside package using inheritance
		obj.publicMethod();					//accessed anywhere using inheritance
		
	}

}
