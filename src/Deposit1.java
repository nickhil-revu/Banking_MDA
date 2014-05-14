
public class Deposit1 extends Deposit 
{
	@Override
	public void make_deposit() 
	{	
		int prev_bal;
		DataStore st_tmp = new Temporary();
		int amount = st_tmp.gettempintdeposit();
		DataStore st_bal=null;
		if(st_tmp.get_atm()==1) 	 //get data from Store1 if atm_no = 1
		{
			st_bal = new Store1();
		}
		if(st_tmp.get_atm()==3)		//get data from Store3 if atm_no = 3
		{
			st_bal = new Store3();
		}
		prev_bal = st_bal.getbal();
		int tot = amount + prev_bal;
		st_bal.setbal(tot);
	}
}
