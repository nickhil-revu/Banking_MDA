
public class Outputprocessor 
{
	DataStore tmobj = new Temporary();
	Systems sys1 = new System1();
	Systems sys2 = new System2();
	Systems sys3 = new System3(); 
	
	public void store_balance() // Store data entered by user
	{
		Storage stobj;
		int atm_no= tmobj.get_atm();
		if(atm_no==1)
		{
			stobj= sys1.getStoreddata();
			stobj.store_balance();
		}
		if(atm_no==2)
		{
			stobj= sys2.getStoreddata();
			stobj.store_balance();
		}
		if(atm_no==3)
		{
			stobj= sys3.getStoreddata();
			stobj.store_balance();
		}

	}

	public void store_pin() // Store data entered by user
	{
		Storage stobj;
		int atm_no= tmobj.get_atm();
		if(atm_no==1)
		{
			stobj= sys1.getStoreddata();
			stobj.store_pin();
		}
		if(atm_no==2)
		{
			stobj= sys2.getStoreddata();
			stobj.store_pin();
		}
		if(atm_no==3)
		{
			stobj= sys3.getStoreddata();
			stobj.store_pin();
		}

	}

	public void incorrectPin_msg() {
		IncorrectMsg incor = new IncorrectMsg();
		incor.incorrectPin_msg();		
	}

	public void display_menu() {
		Menu menuobj;
		int atm_no=tmobj.get_atm();
		if(atm_no==1)
		{
			menuobj=sys1.getdispMenuobj();
			menuobj.display_menu();
		}
		if(atm_no==2)
		{
			menuobj=sys2.getdispMenuobj();
			menuobj.display_menu();
		}
		if(atm_no==3)
		{
			menuobj = sys3.getdispMenuobj();
			menuobj.display_menu();
		}
	}

	public void prompt_pin()   
	{
		PromptPin pobj = new PromptPin();
		pobj.prompt_pin();
	}

	
	public void many_attempts() {
		MaxAttempts attobj = new MaxAttempts();
		attobj.many_attempts();
			
	}

	public void display_balance() {
		DisplayBalance balobj;
		int atm_no = tmobj.get_atm();
		if(atm_no==1)
		{
			balobj=sys1.getbalanceobj();
			balobj.display_balance();
		}
		if(atm_no==2)
		{
			balobj=sys2.getbalanceobj();
			balobj.display_balance();
		}
		if(atm_no==3)
		{
			balobj=sys3.getbalanceobj();
			balobj.display_balance();
		}
	}

	public void make_withdraw() {
		Withdraw wdobj;
		int atm_no = tmobj.get_atm();
		if(atm_no==1)
		{
			wdobj=sys1.getwithdrawobj();
			wdobj.make_withdraw();
		}
		if(atm_no==2)
		{
			wdobj=sys2.getwithdrawobj();
			wdobj.make_withdraw();
			
		}
		if(atm_no==3)
		{
			wdobj=sys3.getwithdrawobj();
			wdobj.make_withdraw();
		}
	}

	public void make_deposit() 
	{
		Deposit depobj;
		int atm_no = tmobj.get_atm();
		if(atm_no==1)
		{
			depobj=sys1.getdepositobj();
			depobj.make_deposit();
		}
		if(atm_no==2)
		{
			depobj=sys2.getdepositobj();
			depobj.make_deposit();
		}
		if(atm_no==3)
		{
			depobj=sys3.getdepositobj();
			depobj.make_deposit();
		}
	}

	public void chargepenalty() 
	{
		Penalty penobj;
		int atm_no = tmobj.get_atm();
		if(atm_no==1)
		{
			penobj=sys1.getpenaltyobj();
			penobj.chargepenalty();
		}
		if(atm_no==2)
		{
			penobj=sys2.getpenaltyobj();
			penobj.chargepenalty();
		}
	}

	public void unlock_msg()
	{
		UnlockMsg ulobj = new UnlockMsg();
		ulobj.unlock_msg();
	}

	public void lock_msg() 
	{
		LockMsg lobj = new LockMsg();
		lobj.lock_msg();		
	}
	
	public void eject_card()
	{
		EjectCard ej = new EjectCard();
		ej.eject_card();
	}

}
