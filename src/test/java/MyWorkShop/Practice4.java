package MyWorkShop;

public class Practice4 
{
	
	int x=10;
	public void test()
	{
		System.out.println(x);//way1
		System.out.println(this.x);//way2
		
		Practice4 p = new Practice4();
		System.out.println(p.x);//way3
	}

}
