import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		int marks;
		System.out.println("enter marks..");
		Scanner a=new Scanner(System.in);
		marks=a.nextInt();
		if(marks>=60 && marks<=100)
		{
		System.out.println("first class");	
		}
		else if(marks>=45 && marks<60)
		
		{
		System.out.println("second class");	
		}
		else
		
		{
			System.out.println("fail");
		}
		

	}

}
