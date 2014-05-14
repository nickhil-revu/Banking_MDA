
public class Storage2 extends Storage 
{
	DataStore objtemp = new Temporary();
	DataStore objstr2 = new Store2();
	@Override
	public void store_balance() 
	{
		float x = objtemp.gettempfloatbal();
		objstr2.setfloatbal(x);
	}
	
	public void store_pin() 
	{
		int y = objtemp.gettempintpin();
		objstr2.setintpin(y);
	
	}

	
}
