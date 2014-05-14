
public class System3 extends Systems {
	public Storage getStoreddata() {
		Storage s3 = new Storage3();
		return s3;
	}
	
	public Menu getdispMenuobj() {
		Menu menu3 = new Menu1();
		return menu3;
	}

	public DisplayBalance getbalanceobj() {
		DisplayBalance bal3 = new DisplayBalance1();
		return bal3;
	}

	public Withdraw getwithdrawobj() {
		Withdraw wd3 = new Withdraw1();
		return wd3;
	}

	public Deposit getdepositobj() {
		Deposit dep3 = new Deposit1();
		return dep3;
	}

}
