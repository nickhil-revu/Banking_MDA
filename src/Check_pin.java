
public class Check_pin extends States {
	public void correctPin()
	{
		op.display_menu();
	}
	public void incorrectPin()
	{
		op.incorrectPin_msg();
	}
	public void maxattempts()
	{
		op.many_attempts();
	}
}
