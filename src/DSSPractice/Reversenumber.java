package DSSPractice;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
	int n,r = 0;
	System.out.println("enter munber");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while(n!=0) 
		//while(n>0)
	{
	    r=r*10+n%10;
		n=n/10;
		
	}
	System.out.println(r);
	}
}
