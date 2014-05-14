
public class Store2 extends DataStore 
{
	static int pin;
	static float bal;
	
	public void setintpin(int y) 
	{  
		pin = y;
	}

	public void setfloatbal(float x) 
	{
		bal=x;
	}
	
	public int getintpin() 
	{
		return pin;
	}
	
	public float getfloatbal() {
		return bal;
	}

}
