
public class Withdraw1 extends Withdraw {

	@Override
	public void make_withdraw() {
		int prev_bal;
		DataStore st_tmp = new Temporary();
		int amount = st_tmp.gettempintwithdraw();
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
		int tot =  prev_bal-amount;
		st_bal.setbal(tot);
	}
		
		
		
	

}
