


public class ATM2 {
	MDA mda;
	DataStore str;
	DataStore str2;
	float x,d,w,bal;
	int y,temp;
	public ATM2()
	{
		 mda = new MDA();
	   	 System.out.println("\n ****** ATM 2******");
		 str = new Temporary();
		 str2 = new Store2();
		 mda.create();
	}
		

	public void CARD(float x, int y) 
	{
		   str.settempfloatbal(x);
		   str.settempintgpin(y);
		   str.set_atm(2);
		   mda.card();
	}

	public void pin1() 
	{
		mda.enterPin();
	}

	public void PIN(int y) 
	{
		   temp = str2.getintpin();
		   bal=str2.getfloatbal();
		   if(y==temp)
		   {
			   mda.correctPin();
		   		if (bal>=500)
				mda.above();
			else
				mda.below();
		   }
			else
				mda.incorrectPin(2);
			}

	public void DEPOSIT(float d) 
	{
		str.settempfloatdeposit(d);
		   mda.deposit();
		   bal=str2.getfloatbal();
		   if (bal>=500)
				mda.above();
			else
				mda.below_with_penalty();
		   
	}

	public void WITHDRAW(float w) 
	{
		str.settempfloatwithdraw(w);
		   bal=str2.getfloatbal();
		   if(bal>=500&&w<=bal)
		   {
			   mda.withdraw();
			   bal=str2.getfloatbal();
			   if (bal>=500)
					mda.above();
				else
					mda.below_with_penalty();
		   }
		   else
		   {   if(bal<w)
				   System.out.println("Action not Possible: InSufficient Balance");
			     else
				   System.out.println("Access Denied!");				  
		   }
	}
	
	public void BALANCE() 
	{
		mda.balance();		
	}

	public void EXIT()
	{
		mda.exit();		
	}

	public void currentState()
	{
		mda.currentState();		
	}

	
}
