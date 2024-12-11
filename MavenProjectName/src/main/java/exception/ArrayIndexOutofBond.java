package exception;

public class ArrayIndexOutofBond {

	public static void main(String[] args) {
	
		int ar[]= {1,2,3};
		for(int i=0;i<=3;i++)					//array out of bounds exception since i has 0,1,2 only not 3
		{
			System.out.println(ar[i]);
		}

	}

}
