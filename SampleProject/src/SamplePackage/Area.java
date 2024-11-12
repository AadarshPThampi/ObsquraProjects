package SamplePackage;

public class Area {

	public static void main(String[] args) {
		
		Area.calc(10);
		Area.calc(10, 20);
	}

	public static void calc(int r)
	{
		float ar= 3.14f *r*r;
		System.out.println("Area of Circle is: "+ar);
	}
	public static void calc(int a, int b)
	{
		int ar= a*b;
		System.out.println("Area of Rectangle is: "+ar);
	}
}
