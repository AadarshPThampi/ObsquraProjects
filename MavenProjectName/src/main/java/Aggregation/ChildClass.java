package Aggregation;

public class ChildClass {			// there is no inheritance here. just given name for easiness.
	
	ParentClass refvar;

	int Age;
	String Place;
	
	public ChildClass(int Age, String Place,ParentClass refvar)
	{
		this.Age=Age;
		this.Place=Place;
		this.refvar=refvar;
	}
	
	public void display()
	{
		System.out.println(Age + Place);		//Child class variables
		
		System.out.println(refvar.Name + refvar.Salary);	//parent class variables called using reference variable
	}
	
	public static void main(String[] args) {
			
		ParentClass object = new ParentClass("Gopi","HR",12345);
		
		ChildClass obj = new ChildClass(24, "Kerala",object);
		
		obj.display();
	}

}
