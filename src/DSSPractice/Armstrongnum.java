package DSSPractice;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int rev=0;
		int orig_a=a;
		int arm=0;
		while(a>0) 
		{
			rev=a%10;
			a=a/10;
			arm=arm+(rev*rev*rev);
		}
	
	if (orig_a==arm) 
	{
		System.out.println("it is arm");
	}
	else 
	{
		System.out.println("is not arm");
		}
	}
}

