package MyWorkShop;

public class Practice7 
{
	int x = 10;  // how many way to call nonstatic variable inside constructor
	public Practice7() 
	{
		//int x= this.x;
		//System.out.println(x);
		
		//System.out.println(x);
		
		Practice7 p = new Practice7();
		System.err.println(p.x);		

		
		//total way 3way
	}

}
