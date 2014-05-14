import java.util.Scanner;


public class Banking {
	public static void main(String[] args) {
		
		int a=0,ch=0;
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a key");
		sc.next();
		while(a!=4)
		{
			System.out.println("**** CS 586:Software System Architecture *****");
			System.out.println("           **    Nickhil Revu   **");
		System.out.println("\n Enter the Input");
		System.out.println("1. ATM-1 \n2. ATM-2\n3. ATM-3");
		a=sc.nextInt();
		
		if(a==1)
		{   ch=0;
			ATM1 atm1 = new ATM1();
			while(ch!=8)
			{
			  
			   System.out.println("\n Select your choice");
			   System.out.println("1.card  2.pin  3.deposit  4.withdraw  5.balance  6.lock  7.unlock  8.exit 9.Current State");
			   ch =sc.nextInt();
			   switch(ch){
			   case 1:
				   System.out.println("Enter Opening balance");
				  int x=sc.nextInt();
				   System.out.println("Set your Pin ");
				  String y =sc.next();
				   atm1.card(x,y);
				   break;
				
			   case 2:
				   atm1.pin1();
				   y=sc.next();
				   atm1.pin(y);
				   break;
				
			   case 3:
				   System.out.println("Enter deposit Amount");
				   int d=sc.nextInt();
				   atm1.deposit(d);
				   break;
				   
			   case 4:
				   System.out.println("Enter withdraw Amount");
				   int w=sc.nextInt();
				   atm1.withdraw(w);
				   break;
				   
			   case 5:
				   atm1.balance();
				   break;
				
			   case 6:
				   System.out.println("Enter Pin");
				   y=sc.next();
				   atm1.lock(y);
				   break;
				   
			   case 7:
				   System.out.println("Enter pin");
				   y=sc.next();
				   atm1.unlock(y);
				   break;
				   			   
			   case 8:
				   atm1.exit();
				   break;
				   
			   case 9:
				   atm1.currentState();		// To find the current state
				   break;
			   default:
				   System.out.println("Invalid Input");
			   }
			}
			
		}
		else if(a==2)
		{
			ATM2 atm2 = new ATM2();
			ch=0;
			while(ch!=6)
			{
			  
			   System.out.println("\n Select your choice");
			   System.out.println("1.CARD  2.PIN  3.DEPOSIT  4.WITHDRAW  5.BALANCE  6.EXIT  7.CURRENT STATE");			   ch =sc.nextInt();
			   switch(ch){
			   case 1:
				   System.out.println("Enter Opening balance");
				   float x=sc.nextFloat();
				   System.out.println("Set your Pin ");
				   int y =sc.nextInt();
				   atm2.CARD(x,y);
				   break;
				
			   case 2:
				   atm2.pin1();
				    y=sc.nextInt();
				   atm2.PIN(y);
				   break;
				
			   case 3:
				   System.out.println("Enter deposit Amount");
				   float d=sc.nextFloat();
				   atm2.DEPOSIT(d);
				   break;
				   
			   case 4:
				   System.out.println("Enter withdraw Amount");
				   float w=sc.nextFloat();
				   atm2.WITHDRAW(w);
				   break;
				  
			   case 5:
				   atm2.BALANCE();
				   break;
				   
			   case 6:
				   atm2.EXIT();
				   break;
				
			   case 7:
				   atm2.currentState();		// To find the current state
				   break;
			   default:
				   System.out.println("Invalid Input");
			   }
			}
		}
		else if(a==3)
		{
			ATM3 atm3 = new ATM3();
			ch=0;
			while(ch!=8)
			{
			  
			   System.out.println("\n Select your choice");
			   System.out.println("1.card  2.pin  3.deposit  4.withdraw  5.balance  6.lock  7.unlock  8.exit 9.Current State");
			   ch =sc.nextInt();
			   switch(ch){
			   case 1:
				   System.out.println("Enter Opening balance");
				   int x=sc.nextInt();
				   System.out.println("Set your Pin ");
				  int y =sc.nextInt();
				   atm3.card(x,y);
				   break;
				
			   case 2:
				   atm3.pin1();
				   y=sc.nextInt();
				   atm3.pin(y);
				   break;
				
			   case 3:
				   System.out.println("Enter deposit Amount");
				   int d=sc.nextInt();
				   atm3.deposit(d);
				   break;
				   
			   case 4:
				   System.out.println("Enter withdraw Amount");
				   int w=sc.nextInt();
				   atm3.withdraw(w);
				   break;
				   
			   case 5:
				   atm3.balance();
				   break;
				
			   case 6:
				   atm3.lock();
				   break;
				   
			   case 7:
				   atm3.unlock();
				   break;
				   			   
			   case 8:
				   atm3.exit();
				   break;
				   
			   case 9:
				   atm3.currentState();		// To find the current state
				   break;
			   default:
				   System.out.println("Invalid Input");
			   }
			}
			
		}
		else
			System.out.println("Invalid Input");
		}	
	}
}
