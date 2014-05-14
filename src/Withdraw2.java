
public class Withdraw2 extends Withdraw 
{
	@Override
	public void make_withdraw() {
		DataStore st_wd = new Temporary();
		float amount = st_wd.gettempfloatwithdraw();
		DataStore st_bal = new Store2();
		float prev_bal = st_bal.getfloatbal();
		float tot = prev_bal-amount;
		st_bal.setfloatbal(tot);
	}

}
