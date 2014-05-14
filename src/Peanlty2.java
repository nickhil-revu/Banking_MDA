
public class Peanlty2 extends Penalty 
{
	@Override
	public void chargepenalty() {
		DataStore st_bal = new Store2();
		float  prev_bal = st_bal.getfloatbal();
		float tot = prev_bal -20;
		st_bal.setfloatbal(tot);
		System.out.println("\n Penalty Charged!! $20");
	}

}
