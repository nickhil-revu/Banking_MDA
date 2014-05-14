
public class Locked extends States 
{
	public void failUnLock()
	{
		op.incorrectPin_msg();
	}
	
	public void unlock()
	{
		op.unlock_msg();
	}
}
