
public class Deposit2 extends Deposit 
{
	@Override
	public void make_deposit() {
		DataStore st_tmp = new Temporary();
		float amount = st_tmp.gettempfloatdeposit();
		DataStore st_bal = new Store2();
		float prev_bal = st_bal.getfloatbal();
		float tot = amount + prev_bal;
		st_bal.setfloatbal(tot);
	}
}
