package SamplePackage;

public class CheckNumber {

	public static void main(String[] args) {
		CheckNumber obj=new CheckNumber();
		
		System.out.println(obj.check(999));
		}

	public boolean check(int a)
	{
		if(a>9&&a<100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
