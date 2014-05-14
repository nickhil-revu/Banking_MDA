
public class ATM1 {
	int bal,dep,wd;
	String pin;
	DataStore str;
	DataStore str1;
	String y,temp;	
	int ch=0;
	MDA mda;
	public ATM1()
	{
		mda = new MDA();
   	    System.out.println("\n ****** ATM 1 ******");
		 str = new Temporary();
		 str1 = new Store1();
		 mda.create();
	}
		

	public void card(int x, String y) 
	{
	       str.settempintbal(x);
		   str.settempstringpin(y);
		   str.set_atm(1);
		   mda.card();
	}


	public void pin1() 
	{
		mda.enterPin();		
	}


	public void pin(String y) 
	{
		temp = str1.getpin();
		   bal=str1.getbal();
		   if(y.equals(temp))
		   {
			   mda.correctPin();
		   		if (bal>=1000)
				mda.above();
			else
				mda.below();
		   }
			else
				mda.incorrectPin(3);		
	}


	public void deposit(int d) 
	{
		str.settempintdeposit(d);
		   mda.deposit();
		   bal=str1.getbal();
		   if (bal>=1000)
				mda.above();
			else
				mda.below_with_penalty();		
	}


	public void withdraw(int w) 
	{
		str.settempintwithdraw(w);
		   bal=str1.getbal();
		   if(bal>=1000&&w<=bal)
		   {
			   mda.withdraw();
			   bal=str1.getbal();
			   if (bal>=1000)
					mda.above();
				else
					mda.below_with_penalty();
		   }
		   else 
		   { if(bal<w)
			   System.out.println("Action not Possible: InSufficient Balance");
		     else
			   System.out.println("Access Denied!");
		   }		
	}


	public void balance() 
	{
		   mda.balance();
	
	}


	public void lock(String y) 
	{
		temp=str1.getpin();
		   if(y.equals(temp))
		   {
			   mda.lock();
		   }
		   else
		   {
			   mda.failLock();
		   }
	}


	public void unlock(String y) 
	{temp=str1.getpin();
	   if(y.equals(temp))
	   {
	    mda.unlock();
	    bal=str1.getbal();
	    if (bal>=1000)
			mda.above();
		else
			mda.below();
	   }
	   else
	   {
		   mda.failUnLock();
	   }
	 }


	public void exit() 
	{
		mda.exit();		
	}


	public void currentState() 
	{
		mda.currentState();
	}

}
	