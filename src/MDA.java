import java.util.Scanner;

public class MDA 
{
	States obj1 = new Idle();
	States obj2 = new Check_pin();
	States obj3 = new Checking();
	States obj4 = new Ready();
	States obj5 = new Overdrawn();
	States obj6 = new Locked();
	
	States st = new States();
	
	int state =0;
	int attempts;
	Scanner sc = new Scanner(System.in);
	int ans;
	
	public void currentState() {
		switch(state)
		{
		case 0:System.out.println("Inser your card first");
		break;
		case 1:System.out.println("Your Current State : IDLE STATE");
		break;
		case 2:System.out.println("your Current State : CHECK PIN STATE");
		break;
		case 4:System.out.println("your Current State : READY STATE");
		break;
		case 5:System.out.println("your Current State : OVERDRAWN STATE");
		break;
		case 6 :System.out.println("your Current State : LOCKED STATE");
		break;
		
		}
	}
	
	public void create() {	
		state=1;
		System.out.println("\n\t!!  WELCOME  !!\n");
	}
	
	public void card() {
		if(state==1)
		{
			attempts=0;
			state=2;
			obj1.card();
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
			currentState();
		}
		
	}

	public void correctPin() {
		if(state==2)
		{
			state=3;
			obj2.correctPin();
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
			currentState();
		}
	}
	

	public void above() {
		if(state==3)
		{
			state=4;
		}
	}

	public void below() {
		if(state==3)
		{
			state=5;
		}
}

	public void incorrectPin(int i) {
		
		if(state==2)
		{
			obj2.incorrectPin();
			attempts++;
			if(attempts==i)
			{
				obj2.maxattempts();
				state=1;
				currentState();
			}
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
			currentState();
		}
	}

	public void deposit() {
		if(state==4)
		{
			state=3;
			obj4.deposit();
		}
		else if(state==5)
		{
			state=3;
			obj5.deposit();
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
			currentState();
		}
		
	}
	public void withdraw() {
		if(state==4)
		{
			state=3;
			obj4.withdraw();
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
			currentState();
		}
	}

	public void balance() {
		if(state==4)
		{
			obj4.balance();
		}
		else if(state==5)
		{
			obj5.balance();
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
			currentState();
		}
	}
	
	public void lock() {
		if(state==4)
		{
			state=6;
			obj4.lock();
		}
		else if(state==5)
		{
			state=6;
			obj5.lock();
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
			currentState();
		}
	}

	public void failLock() {
		if(state==4)
		{
			obj4.failLock();
		}
		else if(state==5)
		{
			obj5.failLock();
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
			currentState();
		}
		
	}

	public void unlock() {
		if(state==6)
		{
			state=3;
			obj6.unlock();
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
			currentState();
		}
	}

	public void failUnLock() {
		if(state==6)
		{
			obj6.failUnLock();
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
			currentState();
		}
	}

	public void exit() {
		if(state==4)
		{
			state=1;
			obj4.exit();
		}
		else if(state==5)
		{
			state=1;
			obj5.exit();
		}
		else
		{
			System.out.println("Sorry!! you cannot perform this operation from this state");
		}
		currentState();
		
	}

	public void below_with_penalty() {
		if(state==3)
		{
			state=5;
			obj3.charge_penalty();
		}
		
	}
	public void enterPin()
	{
		obj1.enter_Pin();
	}
}
