
public class Ready extends States 
{
	public void deposit() 
	{ 
		op.make_deposit();
	}
	
	public void withdraw() 
	{ 
		op.make_withdraw();
	}
	
	public void balance() 
	{ 
		op.display_balance();
	}
	
	public void failLock() 
	{
		op.incorrectPin_msg();
	}
	
	public void lock()
	{
		op.lock_msg();
	}
	
	public void unlock()
	{
		op.unlock_msg();
	}
	
	public void exit()
	{
		op.eject_card();
	}
	
}
