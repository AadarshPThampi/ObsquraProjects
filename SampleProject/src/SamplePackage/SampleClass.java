package SamplePackage;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Hello";					//String declared using string literals
		System.out.println(S);
		
		String M= new String("Hai");		//string declared using new keyword
		System.out.println(M);

		char ar[]= {'a','b','c','d','e','f','g'};
		String P = new String(ar);			//Converting char array to single string 
		System.out.println(P);
		
		
		int X = S.length();
		System.out.println("Length of String is "+X);
		
		char C=S.charAt(4);
		System.out.println("Char at 4th index is "+C);
		
		int a =10;
		String New=String.valueOf(a); // used to convert any datatype to string(here, int to string)
		System.out.println(New);
		
		String ab="Kishore";			//Declared using String literals
		String cd="Kishore";
		System.out.println(ab==cd);
		
		String ef= new String("Kishore");	//Declared using new keyword
		System.out.println(ef==ab);
		
		String ij="Hai";
		String kl="hello";
		String mn="hai";
		String op="hai";
		System.out.println("Is ij equal to mn: "+ij.equals(mn));
		System.out.println("Is op equal to mn: "+op.equals(mn));
		
		System.out.println(ij.equalsIgnoreCase(mn));
		
		String ety="";
		System.out.println(ety.isEmpty());
		
		
	}

}
