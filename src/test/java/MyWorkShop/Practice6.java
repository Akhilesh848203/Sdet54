package MyWorkShop;

public class Practice6 
{
	public static void test1()
	{
		
	}
	public void test2() 
	{
		test1();  //way1
		
		Practice6.test1(); //way2
		
		Practice6 p = new Practice6();
		
		p.test1();//way3
		this.test1();
		
		
		//4way to call static method inside non static method
		//static inside static 3way
		//nonsatic inside static only one way
		
	}

}
