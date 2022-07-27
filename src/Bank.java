import java.util.Scanner;

public class Bank 
{
	public static void main(String[] args) {
		
	}
	private double bal=50000;
	private int pwd;
	public void deposit(double money)
	{
		System.out.println("enter pwd");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==1319)
		{
			bal=bal+money;
			System.out.println("deposite money:" +money);
			System.out.println("total balance:" +bal);
		}
		else 
		{
			System.out.println("invalid pwd");
		}
	}

	 public void checkbalance() 
	   {
		 System.out.println("enter pwd");
			Scanner s=new Scanner(System.in);
			pwd=s.nextInt();
			if(pwd==1319)  
		{
			System.out.println("total balance:" +bal);
		}
			else 
			{
				System.out.println("invalid pwd");
			}
	   }
	 public void withdraw (double money)
		{
			System.out.println("enter pwd");
			Scanner s=new Scanner(System.in);
			pwd=s.nextInt();
			if(pwd==1319)
			{
				bal=bal-money;
				System.out.println("deposite money:" +money);
				System.out.println("total balance:" +bal);
			}
			else 
			{
				System.out.println("invalid pwd");
			}
}
}
class customer
{
	public static void main(String[] args)
	{
		Bank B=new Bank();
		int ch;
		System.out.println("1:Deposite");
		System.out.println("2:checkbal");
		System.out.println("3:WIthdraw");
		System.out.println("enter your choice");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
 switch(ch) 
  
 {
 case 1: B.deposit(1000);
 break;
 case 2: B.withdraw(2000);
 break;
 case 3: B.checkbalance();
 break;
 default:System.out.println("invalid choice");
 }
	}
}
