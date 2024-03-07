package MyWorkShop;

public class Practice2 
{
	static int  x= 20;
	public static void test()
	{
		System.out.println(x);
	}
	
	static
	{
		System.out.println(x);
	}
	
	{
		System.out.println(x);
	}
	
	public static void test1()
	{
		test();//way1
		Practice2 p2 = new Practice2();
		p2.test();//way2
		Practice2.test(); //way3
	}

}
