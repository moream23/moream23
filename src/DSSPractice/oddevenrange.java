package DSSPractice;

import java.util.Scanner;

public class oddevenrange {
	public static void main(String[] args) {
		int a;
		System.out.println("enter the last number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<=a;i++) 
		{
			if(i%2==0) 
			{
				System.out.println(i+"number is even");
			}
			else 
			{
				System.out.println(i+"number is odd");
			}
		}
	}

}
