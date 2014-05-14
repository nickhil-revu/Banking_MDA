
public class Idle extends States 
{
	public void card()
	{
		op.store_balance();
		op.store_pin();
	}
	public void enter_Pin()
	{
		op.prompt_pin();
	}

}
