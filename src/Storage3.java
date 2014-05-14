
public class Storage3 extends Storage 
{
	DataStore objtemp = new Temporary();
	DataStore objstr3 = new Store3();
	@Override
	public void store_balance() 
	{
		int x = objtemp.gettempintbal();
		objstr3.setbal(x);
	}

	@Override
	public void store_pin() 
	{
		int y = objtemp.gettempintpin();
		objstr3.setintpin(y);
	}

}
