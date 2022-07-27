package DSSPractice;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		int a;
		System.out.println("enter the number");
		Scanner ref=new Scanner(System.in);
		a=ref.nextInt();
		if(a%2==0) 
		{
			System.out.println("number is even");
		}
		else 
		{
			System.out.println("mumber is odd");
		}
	}
}
