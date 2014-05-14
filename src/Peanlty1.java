
public class Peanlty1 extends Penalty 
{
	@Override
	public void chargepenalty() 
	{
		DataStore st_bal = new Store1();
		int prev_bal = st_bal.getbal();
		int tot = prev_bal -10;
		st_bal.setbal(tot);
		System.out.println("\n Penalty Charged!! $10 ");

	}

}
