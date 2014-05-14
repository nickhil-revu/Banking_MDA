
public class ATM3 {
	DataStore str;
	DataStore str3;
	MDA mda;
	
	int ch=0;
	int x,d,w,bal;
	
	int y,temp;
	
	public ATM3()
	{
		System.out.println("****** ATM 3 ******");
		mda = new MDA();
	 	str = new Temporary();
	 	str3 = new Store3();
	 	mda.create();
	}
	

	public void card(int x, int y) 
	{
		   str.settempintbal(x);
		   str.settempintgpin(y);
		   str.set_atm(3);
		   mda.card();
	}

	public void pin(int y) {
		temp = str3.getintpin();
		   bal=str3.getbal();
		   if(y==temp)
		   {
			   mda.correctPin();
		   		if (bal>=100)
				mda.above();
			else
				mda.below();
		   }
			else
				mda.incorrectPin(1);		
	}

	public void deposit(int d) 
	{
		str.settempintdeposit(d);
		   mda.deposit();
		   bal=str3.getbal();
		   if (bal>=100)
				mda.above();
			else
				mda.below();
		
	}

	public void withdraw(int w) 
	{
		str.settempintwithdraw(w);
		   bal=str3.getbal();
		   if(bal>=100&&w<=bal)
		   {
			   mda.withdraw();
			   bal=str3.getbal();
			   if (bal>=100)
					mda.above();
				else
					mda.below();
		   }
		   else
		   {
			   System.out.println("Action not Possible: Insufficient Balance");
		   }
		   
	}

	public void balance() 
	{
		mda.balance();		
	}

	public void lock()
	{
		mda.lock();		
	}

	public void unlock() 
	{
		mda.unlock();
	}

	public void exit() 
	{
		mda.exit();
	}

	public void currentState() 
	{
		mda.currentState();
	}

	public void pin1() 
	{
		mda.enterPin();
	}

	
}
