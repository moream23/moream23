package DSSPractice;

import java.util.Scanner;

public class today {

	public static void main(String[] args) {
		int a;
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		int rev=0;
		while(a>0) 
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);
		
	}
		
}
