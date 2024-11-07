package SuperKeyword;

public class SuperInstanceChild extends SuperInstanceparent {

	String b="Child";
	public static void main(String[] args) {
		SuperInstanceChild obj = new SuperInstanceChild();
		obj.dispaly();
	}
public void dispaly()
{
	System.out.println(b);
	System.out.println(super.a);
}
}
