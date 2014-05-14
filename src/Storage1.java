
public class Storage1 extends Storage 
{
	DataStore objtemp = new Temporary();
	DataStore objstr1 = new Store1();
	public void store_balance() 
	{
		int x = objtemp.gettempintbal();
		objstr1.setbal(x);
	}

	public void store_pin()
	{
		String y = objtemp.gettempstringpin();
		objstr1.setpin(y);
	}
	

}
