
public class System1 extends Systems 
{
	public Storage getStoreddata() 
	{
		Storage s1 = new Storage1();
		return s1;
	}

	public Menu getdispMenuobj() 
	{
		Menu menu1 = new Menu1();
		return menu1;
	}

	public DisplayBalance getbalanceobj() 
	{
		DisplayBalance bal1 = new DisplayBalance1();
		return bal1;
	}

	public Withdraw getwithdrawobj() 
	{
		Withdraw wd1 = new Withdraw1();
		return wd1;
	}

	public Deposit getdepositobj() 
	{
		Deposit dep1 = new Deposit1();
		return dep1;
	}
	
	public Penalty getpenaltyobj() 
	{
		Penalty pen1 = new Peanlty1();
		return pen1;
	}

}
