package MyWorkShop;

public class Practice5 
{
	static int x =10;
	public void test()
	{
		System.out.println(x);//way1 directaly
		System.out.println(this.x);//way2 using this keyword
		Practice5 p = new Practice5();
		System.out.println(p.x);//way3 using object
		System.out.println(Practice5.x);//way4 using object
		
		
	}

}
