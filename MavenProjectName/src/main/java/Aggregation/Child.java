package Aggregation;

public class Child {		// there is no inheritance here. name just given  for easiness.
String Brand;
String Model;
int year;

Parent refvar;				// Reference variable for other class(ClassName  RefVariableaName)

public Child(String Brand, String Model, int year, Parent refvar)	//constructor
{
	this.Brand= Brand;
	this.Model=Model;
	this.year=year;
	this.refvar=refvar;
}

public void display()
{
	//refering varibales from child class using normal method.
	System.out.println(Brand + Model + year);
	// refering variables from parent class using reference variable.
	System.out.println(refvar.Name + refvar.City+ refvar.pin);		
}
	public static void main(String[] args) {
		Parent object=new Parent("Dhoni","Kochi",695405);
		Child obj = new Child("Tata","Sumo",2020, object);
		obj.display();
	}

}
