
public class DisplayBalance1 extends DisplayBalance 
{
	@Override
	public void display_balance() {
		DataStore temp = new Temporary();
		DataStore st = null;
		if(temp.get_atm()==1) 	 //get data from Store1 if atm_no = 1
		{
			st = new Store1();
		}
		if(temp.get_atm()==3)	//get data from Store3 if atm_no = 3
		{
			st = new Store3();
		}
		
		int balance = st.getbal();
		System.out.println("Current Balance : "+balance);
	}
}
