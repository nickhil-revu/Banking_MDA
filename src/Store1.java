
public class Store1 extends DataStore 
{
	static String pin;
	static int bal;
	
	
	public void setpin(String y) 
	{  
		pin = y;
	}

	public void setbal(int x) 
	{
		bal=x;
	}
	
	public String getpin()
	{
		return pin;
	}
	
	public int getbal()
	{
		return bal;
	}
}
