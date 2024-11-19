package Encapsulation;

public class ClassA {

	private String name;				//variables declared as Private
	private int age;
	
	public void setName(String name)	//set method to modify the variable
	{
		this.name=name;
	}
	public String getName()				//get method to view the value
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}
