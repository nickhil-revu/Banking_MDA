
public class System2 extends Systems {
	public Storage getStoreddata() 
	{
		Storage s2 = new Storage2();
		return s2;
	}
	
	public Menu getdispMenuobj() 
	{
		Menu menu2 = new Menu2();
		return menu2;
	}

	public DisplayBalance getbalanceobj() 
	{
		DisplayBalance bal2 = new DisplayBalance2();
		return bal2;
	}

	public Withdraw getwithdrawobj() 
	{
		Withdraw wd2 = new Withdraw2();
		return wd2;
	}

	public Deposit getdepositobj() 
	{
		Deposit dep2 = new Deposit2();
		return dep2;
	}
	
	public Penalty getpenaltyobj() 
	{
		Penalty pen2 = new Peanlty2();
		return pen2;
	}

}
