package DSSPractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int a;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		long Fact=1;
		for(long i=1;i<=a;i++) 
		{
			Fact=Fact*i;		
		}
		System.out.println(Fact);
	}

}
