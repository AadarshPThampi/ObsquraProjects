package SamplePackage;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
StringBuffer a= new StringBuffer("Name");
System.out.println(a);

StringBuilder b = new StringBuilder("Place");
System.out.println(b);

//Append
a.append(" is");
System.out.println(a);

b.append(" to go");
System.out.println(b);

//Insert
a.insert(1, "Sample");
System.out.println(a);

b.insert(5, "need");
System.out.println(b);

//Replace
a.replace(1, 2, "Hari");
System.out.println(a);

b.replace(5, 9, "we");
System.out.println(b);

//Delete
a.delete(1, 10);
System.out.println(a);

b.delete(5, 7);
System.out.println(b);

//Reverse
a.reverse();
System.out.println(a);

b.reverse();
System.out.println(b);

//concat, contains, to upper, to lower		to check

	}

}
