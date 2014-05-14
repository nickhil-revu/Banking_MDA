
public class DisplayBalance2 extends DisplayBalance 
{
	@Override
	public void display_balance() {
		DataStore st = new Store2();
		float balance = st.getfloatbal();
		System.out.println("Current Balance : "+balance);
	}
}
