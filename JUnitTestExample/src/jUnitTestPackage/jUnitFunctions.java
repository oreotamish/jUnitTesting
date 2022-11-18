package jUnitTestPackage;


public class jUnitFunctions {

	public static void main(String[] args) {
		System.out.println(addString("se","lo"));
		System.out.println(addTwo(1,2));
	}
	public static int addTwo(int a, int b)
	   {
	      int sum = a + b;
	      return sum;
	   }
	public static String addString(String a, String b)
	{
		String sum = a + b;
		return sum;
	}
}
